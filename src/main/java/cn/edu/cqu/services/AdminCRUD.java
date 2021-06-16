package cn.edu.cqu.services;

import cn.edu.cqu.domains.Admin;

public interface AdminCRUD
{
	public void add(Admin admin);
	
	public Admin getByID(String aid);
	
	public void edit(String aid,Admin newAdmin);
	
	public void deleteByID(String aid);
}
