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
 * Module:  CollegeNews.java
 * Author:  Guo
 * Purpose: Defines the Class CollegeNews
 ***********************************************************************/


@Entity
@Table(name="CollegeNews")
@DynamicUpdate
@DynamicInsert
public class CollegeNews implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	public String cNewsID;
	public java.util.Date cNewsDate;
	public java.lang.String cNewsURL;
	public java.lang.String cNewsImgURL;
	public java.lang.String cNewsContent;

	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY,optional=true)
	@JoinColumn(name="aid",nullable=true)
	public Admin admin;

	public String getcNewsID() {
		return cNewsID;
	}

	public void setcNewsID(String cNewsID) {
		this.cNewsID = cNewsID;
	}

	public java.util.Date getcNewsDate() {
		return cNewsDate;
	}

	public void setcNewsDate(java.util.Date cNewsDate) {
		this.cNewsDate = cNewsDate;
	}

	public java.lang.String getcNewsURL() {
		return cNewsURL;
	}

	public void setcNewsURL(java.lang.String cNewsURL) {
		this.cNewsURL = cNewsURL;
	}

	public java.lang.String getcNewsImgURL() {
		return cNewsImgURL;
	}

	public void setcNewsImgURL(java.lang.String cNewsImgURL) {
		this.cNewsImgURL = cNewsImgURL;
	}

	public java.lang.String getcNewsContent() {
		return cNewsContent;
	}

	public void setcNewsContent(java.lang.String cNewsContent) {
		this.cNewsContent = cNewsContent;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
}