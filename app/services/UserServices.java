package services;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import models.User;
import repository.DatabaseConnection;

public class UserServices {
	private DatabaseConnection databaseConnection;

	@Inject
	public UserServices(DatabaseConnection databaseConnection) {
		this.databaseConnection = databaseConnection;
	}

	public void addUser(User user) {
		databaseConnection.insert(user);
	}

	public List<User> getUsers() throws SQLException {
		return databaseConnection.executeSql();
	}

	public User findById(Integer id, List<User> userList) {
		for (User user : userList) {
			if (user.userId.equals(id)) {
				System.out.println("userServices Methods print name  : ---" + user.getfName());
				return user;
			}
		}
		return null;
	}

	public User updateUser(User editedUser) {
		return databaseConnection.updateQuery(editedUser);
	}
}
