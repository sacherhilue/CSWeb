package com.myyd.services.hibernate;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myyd.domains.User;
import com.myyd.services.UserCRUD;

@Service("userCRUDHibernate")
public class UserCRUDHibernate implements UserCRUD
{
	private HibernateTemplate ht;
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		ht = new HibernateTemplate(sessionFactory);
	}

	@Override
	@Transactional
	public void add(User user)
	{
		ht.save(user);
	}

	@Override
	public User getByID(String userID)
	{
		return ht.get(User.class, userID);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAll()
	{
		List<User> users = (List<User>) ht.find("from User");
		return users;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getByGender(String userGender)
	{
		List<User> users = (List<User>) ht.find(
				"from User where userGender=?", userGender);
		if (users.size() > 0)
			return users;
		else
			return null;
	}

	@Override
	@Transactional
	public void editAll(String id, User newUser)
	{
		User u = this.getByID(id);
		u.setUserName(newUser.getUserName());
		u.setUserGender(newUser.getUserGender());
		ht.update(u);
	}
	
	@Override
	@Transactional
	public void editInfo(String id, User newUser)
	{
		User u = this.getByID(id);
		u.setUserName(newUser.getUserName());
		u.setUserGender(newUser.getUserGender());
		ht.update(u);
	}
	
	@Override
	@Transactional
	public void deleteById(String userID)
	{
		User u = this.getByID(userID);
		ht.delete(u);
	}

	@Override
	@Transactional
	public void deleteAll()
	{
		List <User> users = this.getAll();
		for (User user : users)
		{
			this.deleteById(user.getUserID());
		}
	}

	@Override
	@Transactional
	public void deleteByName(String userName)
	{
		List<User> users = this.getByName(userName);
		for (User user : users)
		{
			this.deleteById(user.getUserID());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getByName(String userName)
	{
		List<User> users = (List<User>) ht.find("from User where userName=?", userName);
		return users;
	}
	
	@SuppressWarnings("unchecked")
	public List<User> test(String userGender)
	{
		String queryString = "select userName,count(distinct userID) as countNum from User "
				+ "group by :test "
				+ "order by countNum desc";    
        String paramName= "test";   
        String value= "userGender";   
        List<User> users = (List<User>) ht.findByNamedParam(queryString, paramName, value);    
		return users;
	}
}
