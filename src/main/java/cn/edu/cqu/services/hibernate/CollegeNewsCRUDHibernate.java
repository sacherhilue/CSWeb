package cn.edu.cqu.services.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.cqu.domains.CollegeNews;
import cn.edu.cqu.services.CollegeNewsCRUD;

@Service("CollegeNewsCRUDHibernate")
public class CollegeNewsCRUDHibernate implements CollegeNewsCRUD {

	private HibernateTemplate ht;
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		ht = new HibernateTemplate(sessionFactory);
	}
	
	@Override
	public CollegeNews getByID(String cNewsID) {
		return ht.get(CollegeNews.class, cNewsID);
	}

	@Override
	@Transactional
	public void edit(CollegeNews collegeNews) {
		ht.merge(collegeNews);
	}

	@Override
	@Transactional
	public void deleteByID(String cNewsID) {
		CollegeNews c = this.getByID(cNewsID);
		ht.delete(c);
	}

}
