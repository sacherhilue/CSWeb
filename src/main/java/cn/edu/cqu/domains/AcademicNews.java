package cn.edu.cqu.domains;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/***********************************************************************
 * Module:  AcademicNews.java
 * Author:  Guo
 * Purpose: Defines the Class AcademicNews
 ***********************************************************************/


@Entity
@Table(name="AcademicNews")
@DynamicUpdate
@DynamicInsert
public class AcademicNews implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	public String aNewsID;
	public java.util.Date aNewsDate;
	public java.lang.String aNewsURL;
	public java.lang.String aNewsImgURL;
	public java.lang.String aNewsContent;
	
	public Admin admin;
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY,optional=true)
	@JoinColumn(name="aid",nullable=true)
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin)
	{
		this.admin = admin;
	}

	public String getaNewsID()
	{
		return aNewsID;
	}

	public void setaNewsID(String aNewsID)
	{
		this.aNewsID = aNewsID;
	}

	public java.util.Date getaNewsDate()
	{
		return aNewsDate;
	}

	public void setaNewsDate(java.util.Date aNewsDate)
	{
		this.aNewsDate = aNewsDate;
	}

	public java.lang.String getaNewsURL()
	{
		return aNewsURL;
	}

	public void setaNewsURL(java.lang.String aNewsURL)
	{
		this.aNewsURL = aNewsURL;
	}

	public java.lang.String getaNewsImgURL()
	{
		return aNewsImgURL;
	}

	public void setaNewsImgURL(java.lang.String aNewsImgURL)
	{
		this.aNewsImgURL = aNewsImgURL;
	}

	public java.lang.String getaNewsContent()
	{
		return aNewsContent;
	}

	public void setaNewsContent(java.lang.String aNewsContent)
	{
		this.aNewsContent = aNewsContent;
	}
}