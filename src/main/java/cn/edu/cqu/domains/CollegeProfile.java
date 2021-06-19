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
 * Module:  CollegeProfile.java
 * Author:  Guo
 * Purpose: Defines the Class CollegeProfile
 ***********************************************************************/

@Entity
@Table(name="CollegeProfile")
@DynamicUpdate
@DynamicInsert
public class CollegeProfile implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	public String cpID;
	public java.lang.String cpURL;
	public java.lang.String cpImgURL;
	public java.lang.String cpContent;

	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY,optional=true)
	@JoinColumn(name="aid",nullable=true)
	public Admin admin;

	public String getCpID() {
		return cpID;
	}

	public void setCpID(String cpID) {
		this.cpID = cpID;
	}

	public java.lang.String getCpURL() {
		return cpURL;
	}

	public void setCpURL(java.lang.String cpURL) {
		this.cpURL = cpURL;
	}

	public java.lang.String getCpImgURL() {
		return cpImgURL;
	}

	public void setCpImgURL(java.lang.String cpImgURL) {
		this.cpImgURL = cpImgURL;
	}

	public java.lang.String getCpContent() {
		return cpContent;
	}

	public void setCpContent(java.lang.String cpContent) {
		this.cpContent = cpContent;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

}