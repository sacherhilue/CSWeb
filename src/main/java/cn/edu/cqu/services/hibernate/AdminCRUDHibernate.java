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
	public Admin getByID(String aid)
	{
		return ht.get(Admin.class, aid);
	}

	@Override
	@Transactional
	public void edit(Admin newAdmin)
	{
		ht.merge(newAdmin);
	}

	@Override
	public void deleteByID(String aid)
	{
		Admin a = this.getByID(aid);
		ht.delete(a);
	}

}
