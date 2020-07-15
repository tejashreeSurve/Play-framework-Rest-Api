package controllers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;

import models.Login;
import models.User;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import services.UserServices;

public class HomeController extends Controller {

	private FormFactory formFactory;
	private UserServices userServices;

	@Inject
	public HomeController(FormFactory formFactory, UserServices userServices) {
		this.formFactory = formFactory;
		this.userServices = userServices;
	}
	
	// add User
	public Result addUser() {
		Form<User> userForm = formFactory.form(User.class);
		return ok(views.html.addUser.render(userForm));
	}

	// save User
	public Result saveUser(Http.Request request) {
		Form<User> userform = formFactory.form(User.class).bindFromRequest(request);
		User user = userform.get();
		userServices.addUser(user);
		return redirect(routes.HomeController.addUser());
	}

	// Get method edit User
	public Result editUser(Integer userId) throws SQLException {
		User user = userServices.findById(userId);
		if (user == null)
			return ok("User Not Exist");
		Form<User> userForm = formFactory.form(User.class);
		return ok(views.html.edit.render(userForm, user));
	}

	// Post method update User
	public Result updateUser(Http.Request request) {
		Form<User> userForm = formFactory.form(User.class).bindFromRequest(request);
		User editedUser = userForm.get();
		User user = userServices.updateUser(editedUser);
		if (user == null)
			return ok("user not found");
		else
			return ok("successfully update");
	}

	// Get method login 
	public Result loginUser() {
		Form<Login> loginForm = formFactory.form(Login.class);
		return ok(views.html.login.render(loginForm));
	}

	// Post method sign-up
	public Result signUp(Http.Request request) throws SQLException {
		Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest(request);
		Login loginUser = loginForm.get();
		User user = userServices.findByEmail(loginUser.userEmail);
		if (!user.password.equals(loginUser.password))
			return ok(views.html.index.render("Please Enter Valid password"));
		else
			return redirect(routes.HomeController.addUser());

	}

	// get all user
	public Result getAllUser() throws SQLException {
		List<User> userData = userServices.getUsers();
		return ok(views.html.showuser.render(userData));
	}

}
