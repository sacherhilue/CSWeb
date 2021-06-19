package cn.edu.cqu.services;

import cn.edu.cqu.domains.CollegeProfile;

public interface CollegeProfileCRUD {

public CollegeProfile getByID(String cpID);
	
	public void edit(CollegeProfile collegeProfile);
	
	public void deleteByID(String cpID);
}
