package cn.edu.cqu.services;

import cn.edu.cqu.domains.Admin;

public interface AdminCRUD
{
	public Admin getByID(String aid);
	
	public void edit(Admin newAdmin);
	
	public void deleteByID(String aid);
}
