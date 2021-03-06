package cn.edu.cqu.domains;

import java.io.Serializable;

/***********************************************************************
 * Module:  Admin.java
 * Author:  Guo
 * Purpose: Defines the Class Admin
 ***********************************************************************/

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="Admin")
@DynamicUpdate
@DynamicInsert
public class Admin implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	public java.lang.String aid;
	public java.lang.String aName;
	public java.lang.String aPwd;
	public java.lang.String getAid() {
		return aid;
	}
	public void setAid(java.lang.String aid) {
		this.aid = aid;
	}
	public java.lang.String getaName() {
		return aName;
	}
	public void setaName(java.lang.String aName) {
		this.aName = aName;
	}
	public java.lang.String getaPwd() {
		return aPwd;
	}
	public void setaPwd(java.lang.String aPwd) {
		this.aPwd = aPwd;
	}
}