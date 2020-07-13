package services;

import java.util.List;

import models.User;

public class UserServices {

	public void addUser(User user,List<User> userList )  {
		int id = userList.size() + 1;
		user.setUserId(id);
		userList.add(user);
	}

	public User findById(Integer id,List<User> userList) {
		for (User user : userList) {
			if (user.userId.equals(id)) {
				System.out.println("userServices Methods print name  : ---" + user.getfName());
				return user;
			}
		}
		return null;
	}

	public User updateUser(User editedUser,List<User> userList) {
		int id = editedUser.getUserId();
		for (User user : userList) {
			if (user.userId.equals(id)) {
				user.setfName(editedUser.getfName());
				user.setmName(editedUser.getmName());
				user.setlName(editedUser.getlName());
				user.setUserEmail(editedUser.getUserEmail());
				user.setPassword(editedUser.getPassword());
				return user;
			}
		}
		return null;
	}
}
