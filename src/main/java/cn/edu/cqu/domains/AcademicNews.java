package cn.edu.cqu.domains;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/***********************************************************************
 * Module:  AcademicNews.java
 * Author:  Guo
 * Purpose: Defines the Class AcademicNews
 ***********************************************************************/


@Entity
@Table(name="AcademicNews")
public class AcademicNews {
	@Id
	public int aNewsID;
	public java.util.Date aNewsDate;
	public java.lang.String aNewsURL;
	public java.lang.String aNewsImgURL;
	public java.lang.String aNewsContent;

	public Admin admin;

	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="aid") 
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin)
	{
		this.admin = admin;
	}

	public int getaNewsID()
	{
		return aNewsID;
	}

	public void setaNewsID(int aNewsID)
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