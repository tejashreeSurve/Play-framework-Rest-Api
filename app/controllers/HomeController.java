package controllers;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import Utility.JwtToken;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
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
	private JwtToken jwtToken;

	@Inject
	public HomeController(FormFactory formFactory, UserServices userServices, JwtToken jwtToken) {
		this.formFactory = formFactory;
		this.userServices = userServices;
		this.jwtToken = jwtToken;
	}

	// add User
	public Result addUser() {
		Form<User> userForm = formFactory.form(User.class);
		return ok(views.html.addUser.render(userForm));
	}

	// save User
	public Result saveUser(Http.Request request) throws SQLException {
		Form<User> userform = formFactory.form(User.class).bindFromRequest(request);
		User user = userform.get();
		User isUserPresent = userServices.findByEmail(user.userEmail);
		if (isUserPresent != null) {
			return ok(views.html.index.render("User Already exist,Please Try with other Email"));
		}
		String token = jwtToken.generateToken(user.userEmail);
		System.out.println("ADDUSER---" + token);
		userServices.addUser(user);
		return ok(views.html.index.render("Successfully Register,Please Validate befor Login"));
	}

	// Get method edit User
	public Result editUser(Integer userId, String token) throws SQLException {
		User user = userServices.findById(userId);
		if (user == null)
			return ok(views.html.index.render("Email-id Not Exist"));
		if (user.isVerified == true) {
			Form<User> userForm = formFactory.form(User.class);
			return ok(views.html.edit.render(userForm, user));
		}
		return ok(views.html.index.render("Please Validate befor update User"));
	}

	// Post method update User
	public Result updateUser(Http.Request request) {
		Form<User> userForm = formFactory.form(User.class).bindFromRequest(request);
		User editedUser = userForm.get();
		userServices.updateUser(editedUser);
		return ok(views.html.index.render("User is Successfully Updated"));
	}

	// Get method login
	public Result loginUser(Http.Request request) {
		Form<Login> loginForm = formFactory.form(Login.class);
		return ok(views.html.login.render(loginForm));
	}

	// Post method sign-up
	public Result signUp(Http.Request request) throws SQLException {
		Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest(request);
		Login loginUser = loginForm.get();
		String loginToken = jwtToken.generateToken(loginUser.userEmail);
		System.out.println("LOGINL----" + loginToken);
		User user = userServices.findByEmail(loginUser.userEmail);
		if (user == null)
			return ok(views.html.index.render("User Not Exist"));
		if (user.isVerified == true) {
			if (!user.getPassword().equals(loginUser.password))
				return ok(views.html.index.render("Please Enter Valide password"));
			else
				return redirect(routes.HomeController.addUser());
		}
		return ok(views.html.index.render("Please verified Email before Sign-in"));

	}

	// get all user
	public Result getAllUser() throws SQLException {
		List<User> userData = userServices.getUsers();
		return ok(views.html.showuser.render(userData));
	}

	// validate user through token
	public Result validateUser(String token) throws SQLException {
		String userEmail = jwtToken.getToken(token);
		User userIsValidate = userServices.findByEmail(userEmail);
		if (userIsValidate == null)
			return ok(views.html.index.render("Email-id Not Exist"));
		userIsValidate.setVerified(true);
		System.out.println("boolean method:---" + userIsValidate.isVerified);
		userServices.updateUser(userIsValidate);
		return ok(views.html.index.render("User is Successfully Validate"));
	}
	
	public Result logout(String token) {
		jwtToken.refreshToken(token);
		return ok(views.html.index.render("Successfully Logout"));
	}

}
