package cn.edu.cqu.services.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.cqu.domains.AcademicNews;
import cn.edu.cqu.services.AcademicNewsCRUD;

@Service("AcademicNewsCRUDHibernate")
public class AcademicNewsCRUDHibernate implements AcademicNewsCRUD {

	private HibernateTemplate ht;
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		ht = new HibernateTemplate(sessionFactory);
	}

	@Override
	public AcademicNews getByID(String aNewsID) {
		return ht.get(AcademicNews.class, aNewsID);
	}

	@Override
	@Transactional
	public void edit(AcademicNews newAdmin) {
		ht.merge(newAdmin);
	}

	@Override
	@Transactional
	public void deleteByID(String aNewsID) {
		AcademicNews a = this.getByID(aNewsID);
		ht.delete(a);
	}

}
