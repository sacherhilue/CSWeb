package com.myyd.domains;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="UserTest")
public class User implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GenericGenerator(name="systemUUID",strategy="uuid")
	@GeneratedValue(generator="systemUUID")
	private String userID;
	private String userName;
	private String userGender;
	private int age;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "user",fetch=FetchType.EAGER/*,orphanRemoval=true*/)
//	private Set<Eat> userEat;
//	
//	@OneToMany(cascade=CascadeType.ALL,mappedBy = "user",fetch=FetchType.EAGER)
//	private Set<UserFeedback> userFeedback;
	
//	public Set<Eat> getUserEat()
//	{
//		return userEat;
//	}
//	public void setUserEat(Set<Eat> userEat)
//	{
//		this.userEat = userEat;
//	}
//	public Set<UserFeedback> getUserFeedback()
//	{
//		return userFeedback;
//	}
//	public void setUserFeedback(Set<UserFeedback> userFeedback)
//	{
//		this.userFeedback = userFeedback;
//	}
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
