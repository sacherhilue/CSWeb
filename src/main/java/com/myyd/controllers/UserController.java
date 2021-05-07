package com.myyd.controllers;

import java.io.IOException;
import java.util.HashMap;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.myyd.services.UserCRUD;
@RestController
public class UserController {
//	@Autowired
//	@Qualifier("userCRUDHibernate")
//	private UserCRUD userCRUD;
	
	@RequestMapping(value="/addRegInfo.json") 
	public HashMap<String, Object> addRegInfo(
			@RequestParam("mailBoxAddress") String mailBoxAddress,
			@RequestParam("password") String password) throws IOException
	{
		HashMap<String, Object> results = new HashMap<String, Object>();
//
//		String str = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";//������ʽ
//		Pattern p = Pattern.compile(str);
//		Matcher m = p.matcher(mailBoxAddress);
//		if (!m.find())//
//		{
//			results.put("status", 2);
//			return results;
//		}
//
		results.put("status", 0);
		return results;
	}
}
