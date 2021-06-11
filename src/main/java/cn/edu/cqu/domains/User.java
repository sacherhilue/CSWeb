package cn.edu.cqu.domains;

import java.io.Serializable;

//import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Table;

//@Entity
//@Table(name="UserTest")
public class User implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String userID;
	private String userName;
	private String userGender;
	private int age;
	public String getUserName()
	{
		return userName;
	}
	public String getUserID()
	{
		return userID;
	}
	public void setUserID(String userID)
	{
		this.userID = userID;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public String getUserGender()
	{
		return userGender;
	}
	public void setUserGender(String userGender)
	{
		this.userGender = userGender;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
}
