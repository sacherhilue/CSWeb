package cn.edu.cqu.services;

import cn.edu.cqu.domains.CollegeNews;

public interface CollegeNewsCRUD {
	public CollegeNews getByID(String cNewsID);

	public void edit(CollegeNews collegeNews);

	public void deleteByID(String cNewsID);
}
