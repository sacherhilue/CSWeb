package cn.edu.cqu.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.edu.cqu.domains.AcademicNews;
import cn.edu.cqu.domains.Admin;
import cn.edu.cqu.services.AcademicNewsCRUD;
import cn.edu.cqu.services.AdminCRUD;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})

public class Test233 {
	@Autowired
	@Qualifier("AdminCRUDHibernate")
	private AdminCRUD adminCRUD;
	
	@Autowired
	@Qualifier("AcademicNewsCRUDHibernate")
	private AcademicNewsCRUD academicNewsCRUD ;
	
	@org.junit.Test
	public void test()
	{
		Admin a = new Admin();
		a.setAid("123");
		a.setaName("aaa");
		a.setaPwd("123456");
		
		adminCRUD.edit(a);
		
		a.setaName("bbb");
		adminCRUD.edit(a);
		
		AcademicNews aNews = new AcademicNews();
		aNews.setAdmin(a);
		aNews.setaNewsContent("223333");
		aNews.setaNewsID(""+666);
		academicNewsCRUD.edit(aNews);
		
		System.out.println(academicNewsCRUD.getByID(""+666).getAdmin().getaName());
		
		
		
	}
}
