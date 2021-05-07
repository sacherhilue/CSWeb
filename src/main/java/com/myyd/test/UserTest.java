package com.myyd.test;
//package cn.edu.cqu.srtp.test;
//
//import java.util.Date;
//import java.util.List;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import cn.edu.cqu.srtp.domains.EateryBaidu;
//import cn.edu.cqu.srtp.domains.Favorite;
//import cn.edu.cqu.srtp.domains.RegInfo;
//import cn.edu.cqu.srtp.domains.User;
//import cn.edu.cqu.srtp.services.EateryBaiduCRUD;
//import cn.edu.cqu.srtp.services.EateryTagCRUD;
//import cn.edu.cqu.srtp.services.FavoriteCRUD;
//import cn.edu.cqu.srtp.services.LogInRecordCRUD;
//import cn.edu.cqu.srtp.services.RecordNodeCRUD;
//import cn.edu.cqu.srtp.services.RegInfoCRUD;
//import cn.edu.cqu.srtp.services.TagActionCRUD;
//import cn.edu.cqu.srtp.services.UserCRUD;
//import cn.edu.cqu.srtp.services.UserFeedbackCRUD;
//import cn.edu.cqu.srtp.services.UserLocationWhiteListCRUD;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
//public class UserTest
//{
//	@Autowired
//	@Qualifier("userCRUDHibernate")
//	private UserCRUD userCRUD;
//
//	@Autowired
//	@Qualifier("eateryBaiduCRUDHibernate")
//	private EateryBaiduCRUD eateryBaiduCRUD;
//
//
//	@Autowired
//	@Qualifier("eateryTagCRUDHibernate")
//	private EateryTagCRUD eateryTagCRUD;
//
//	@Autowired
//	@Qualifier("favoriteCRUDHibernate")
//	private FavoriteCRUD favoriteCRUD;
//
//
//
//	@Autowired
//	@Qualifier("logInRecordCRUDHibernate")
//	private LogInRecordCRUD logInRecordCRUD;
//
//	@Autowired
//	@Qualifier("recordNodeCRUDHibernate")
//	private RecordNodeCRUD recordNodeCRUD;
//
//	@Autowired
//	@Qualifier("regInfoCRUDHibernate")
//	private RegInfoCRUD regInfoCRUD;
//
//	@Autowired
//	@Qualifier("tagActionCRUDHibernate")
//	private TagActionCRUD tagActionCRUD;
//
//
//
//	@Autowired
//	@Qualifier("userFeedbackCRUDHibernate")
//	private UserFeedbackCRUD userFeedbackCRUD;
//
//	@Autowired
//	@Qualifier("userLocationWhiteListCRUDHibernate")
//	private UserLocationWhiteListCRUD userLocationWhiteListCRUD;
//
//	
//	@Before
//	@org.junit.Test
//	public void testUserAdd()
//	{
////		User u = new User();
//		u.setUserGender("famale");
//		u.setUserName("Kotori");
//		u.setUserProfileImagePath("none");
//		u.setUserID((long) 1);
//		userCRUD.add(u);
//	}
//	@Test
//	public void testEateryBaidu()
//	{
//		
//		User u = new User();
//		u.setUserGender("famale");
//		u.setUserName("Kotori");
//		u.setUserProfileImagePath("none");
//		userCRUD.add(u);
//		
//		EateryBaidu eb = new EateryBaidu();
//		eb.setAddress("");
//		eb.setAveragePrice(1);
//		eb.setOverallRating(1);
//		eb.setEnvironmentalRating(1);
//		eb.setFacilityRating(1);
//		eb.setHygeneRating(1);
//		eb.setServiceRating(1);
//		eb.setTasteRating(1);
//		eb.setTechnologyRating(1);
//		eb.setAveragePrice(1);
//		eb.setLocationLong(1);
//		eateryBaiduCRUD.add(eb);
//		
//		Favorite f = new Favorite();
//		f.setEateryBaidu(eb);
//		f.setUser(u);
//		f.setAddTime(new Date());
//		
//		favoriteCRUD.add(f);
//		
//		
//	}
//	
//	@Test
//	public void testFavorite()
//	{
//		this.testUserAdd();
//		
//	}
//
//	@Test
//	public void testAddRegInfo()
//	{
//		//user表更改
//		User u = new User();
//		u.setUserGender("male");//性别默认为男
//		u.setUserName("2333@qq.com");//用户名默认为邮箱
//		u.setUserProfileImagePath(null);
//		userCRUD.add(u);
//
//		//RegInfo表更改
//		RegInfo r = new RegInfo();
//		r.setMailBoxAddress("2333@qq.com");
//		r.setUserPassword("2333@qq.com");
//		Date d = new Date();
//		r.setRegisterTime(d);
//		List<User> us = userCRUD.getByName("2333@qq.com");
//		r.setUser(us.get(us.size()-1));
//		regInfoCRUD.add(r);
//	}
//
//	@org.junit.Test
//	public void testUserGet()
//	{
//		userCRUD.getByID((long) 1);
//	}
//
//	@org.junit.Test
//	public void testUserUpdate()
//	{
//		User u = userCRUD.getAll().get(0);
//		u.setUserName("23333");
//		userCRUD.edit(u.getUserID(), u);
//	}
//
//	@org.junit.Test
//	public void testUserDelete()
//	{
//		List<RegInfo > ls = regInfoCRUD.getByAll();
//		for (RegInfo regInfo : ls)
//		{
//			regInfoCRUD.deleteByMailBoxAddress(regInfo.getMailBoxAddress());
//		}
//		userCRUD.deleteAll();
//	}
//}
