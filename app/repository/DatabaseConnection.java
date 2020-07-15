package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import models.User;
import play.db.Database;

public class DatabaseConnection {

	private Database db;

	@Inject
	public DatabaseConnection(Database db) {
		this.db = db;
	}

	Connection connection = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;
	List<User> userList = null;

	public void insert(User user) {
		String insertQuery = "INSERT INTO userDetails VALUES ( ?,?,?,?,?,?)";
		try {
			connection = db.getConnection();
			// Statement statement = connection.
			preparedStatement = connection.prepareStatement(insertQuery);
			preparedStatement.setInt(1, user.userId);
			preparedStatement.setString(2, user.fName);
			preparedStatement.setString(3, user.mName);
			preparedStatement.setString(4, user.lName);
			preparedStatement.setString(5, user.userEmail);
			preparedStatement.setString(6, user.password);
			preparedStatement.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null)
					connection.close();
			} catch (SQLException se) {
			}
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}

	public List<User> executeSql() {
		String selectQuery = "select * from userdetails";
		try {
			connection = db.getConnection();
			preparedStatement = connection.prepareStatement(selectQuery);
			userList = new ArrayList<User>();
			 resultSet =  preparedStatement.executeQuery();
				while (resultSet.next()) {
					User user = new User();
					System.out.println("NAME :-----------"+ resultSet.getString(2));
					user.setUserId(resultSet.getInt(1));
					user.setfName(resultSet.getString(2));
					user.setmName(resultSet.getString(3));
					user.setlName(resultSet.getString(4));
					user.setUserEmail(resultSet.getString(5));
					user.setPassword(resultSet.getString(6));
					userList.add(user);
				}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null)
					connection.close();
			} catch (SQLException se) {
			}
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return userList;
	}
	public User updateQuery(User user) {
		if(user == null)
			return null;
		else {
		String updateQuery = "update userdetails set fname=?,mname=?,lname=?,useremail=?,password=? where userid=?";
		try {
			connection = db.getConnection();
			preparedStatement = connection.prepareStatement(updateQuery);
			preparedStatement.setString(1, user.getfName());
			preparedStatement.setString(2, user.getmName());
			preparedStatement.setString(3, user.getlName());
			preparedStatement.setString(4, user.getUserEmail());
			preparedStatement.setString(5, user.getPassword());
			preparedStatement.setInt(6, user.getUserId());
			int count =preparedStatement.executeUpdate();
			System.out.println(count +"RECORD IS UPDATED SUCCESSFULLY");
		
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null)
					connection.close();
			} catch (SQLException se) {
			}
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return user;
		}
	}
}
