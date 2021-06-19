package cn.edu.cqu.services;

import cn.edu.cqu.domains.AcademicNews;

public interface AcademicNewsCRUD
{
	public AcademicNews getByID(String aNewsID);
	
	public void edit(AcademicNews newAdmin);
	
	public void deleteByID(String aNewsID);
}
