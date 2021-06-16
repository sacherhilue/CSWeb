package cn.edu.cqu.services.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.cqu.domains.Admin;
import cn.edu.cqu.services.AdminCRUD;

@Service("AdminCRUDHibernate")
public class AdminCRUDHibernate implements AdminCRUD
{
	private HibernateTemplate ht;
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		ht = new HibernateTemplate(sessionFactory);
	}

	@Override
	@Transactional
	public void add(Admin admin)
	{
		ht.save(admin);
	}

	@Override
	public Admin getByID(String aid)
	{
		return ht.get(Admin.class, aid);
	}

	@Override
	public void edit(String aid, Admin newAdmin)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteByID(String aid)
	{
		// TODO Auto-generated method stub

	}

}
