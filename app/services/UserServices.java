package services;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import models.Login;
import models.User;
import repository.DatabaseConnection;

public class UserServices {
	private DatabaseConnection databaseConnection;

	@Inject
	public UserServices(DatabaseConnection databaseConnection) {
		this.databaseConnection = databaseConnection;
	}

	// add User in database
	public void addUser(User user) {
		databaseConnection.insert(user);
	}

	// get all User from database
	public List<User> getUsers() throws SQLException {
		return databaseConnection.executeSql();
	}

	// find user by id
	public User findById(Integer id) throws SQLException {
		for (User user : getUsers()) {
			if (user.userId == id) {
				return user;
			}
		}
		return null;
	}

	// find user by email
	public User findByEmail(String email) throws SQLException {
		for (User user : getUsers()) {
			if (user.userEmail.equals(email)) {
				return user;
			}
		}
		return null;
	}

	// update user
	public void updateUser(User editedUser) {
		 databaseConnection.updateQuery(editedUser);
	}
}
