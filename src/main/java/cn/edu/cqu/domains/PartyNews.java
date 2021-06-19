package cn.edu.cqu.domains;

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
 * Module:  PartyNews.java
 * Author:  Guo
 * Purpose: Defines the Class PartyNews
 ***********************************************************************/

@Entity
@Table(name="PartyNews")
@DynamicUpdate
@DynamicInsert
public class PartyNews {
	@Id
	public String pNewsID;
	public java.util.Date pNewsDate;
	public java.lang.String pNewsURL;
	public java.lang.String pNewsImgURL;
	public java.lang.String pNewsContent;
	public int pType;

	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY,optional=true)
	@JoinColumn(name="aid",nullable=true)
	public Admin admin;

	public String getpNewsID() {
		return pNewsID;
	}

	public void setpNewsID(String pNewsID) {
		this.pNewsID = pNewsID;
	}

	public java.util.Date getpNewsDate() {
		return pNewsDate;
	}

	public void setpNewsDate(java.util.Date pNewsDate) {
		this.pNewsDate = pNewsDate;
	}

	public java.lang.String getpNewsURL() {
		return pNewsURL;
	}

	public void setpNewsURL(java.lang.String pNewsURL) {
		this.pNewsURL = pNewsURL;
	}

	public java.lang.String getpNewsImgURL() {
		return pNewsImgURL;
	}

	public void setpNewsImgURL(java.lang.String pNewsImgURL) {
		this.pNewsImgURL = pNewsImgURL;
	}

	public java.lang.String getpNewsContent() {
		return pNewsContent;
	}

	public void setpNewsContent(java.lang.String pNewsContent) {
		this.pNewsContent = pNewsContent;
	}

	public int getpType() {
		return pType;
	}

	public void setpType(int pType) {
		this.pType = pType;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}



}