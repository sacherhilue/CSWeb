package cn.edu.cqu.services.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.cqu.domains.CollegeProfile;
import cn.edu.cqu.services.CollegeProfileCRUD;

@Service("CollegeProfileCRUDHibernate")
public class CollegeProfileCRUDHibernate implements CollegeProfileCRUD {

	private HibernateTemplate ht;
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		ht = new HibernateTemplate(sessionFactory);
	}
	
	@Override
	public CollegeProfile getByID(String cpID) {
		return ht.get(CollegeProfile.class, cpID);
	}

	@Override
	@Transactional
	public void edit(CollegeProfile collegeProfile) {
		ht.merge(collegeProfile);
	}

	@Override
	@Transactional
	public void deleteByID(String cpID) {
		CollegeProfile cp = this.getByID(cpID);
		ht.delete(cp);
	}

}
