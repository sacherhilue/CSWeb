package cn.edu.cqu.services;
import java.util.List;

import cn.edu.cqu.domains.User;
public interface UserCRUD {
	public void add(User user);

	public User getByID(String userID);
	public List<User> getByName(String userName);
	public List<User> getAll();
	public List<User> getByGender(String userGender);

	public void editAll(String id,User newUser);
	public void editInfo(String id,User newUser);

	public void deleteById(String userID);
	public void deleteAll();
	public void deleteByName(String userName);

	public List<User> test(String userGender);
}
