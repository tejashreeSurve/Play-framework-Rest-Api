package controllers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;

import models.User;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
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

	public List<User> userList = new ArrayList<User>();

	public Result index() {
		String name = "tejashree";
		return ok(views.html.index.render(name));
	}

	public Result bodyParse(Http.Request request) {
//		JsonNode json = Json.newObject()
//		        .put("name", "tejashree");
		JsonNode json2 = request.body().asJson();
		return ok("Get Name" + json2.get("name").asText());
	}

	public Result addUser() {
		Form<User> userForm = formFactory.form(User.class);
		return ok(views.html.addUser.render(userForm));
	}

	public Result saveUser(Http.Request request) {
		Form<User> userform = formFactory.form(User.class).bindFromRequest(request);
		System.out.println(userform);
		User user = userform.get();
		System.out.println("USER DATA : --" + user.fName);
		userServices.addUser(user);
		return redirect(routes.HomeController.addUser());
	}

	public Result editUser(Integer userId) throws SQLException {
		System.out.println("edit User method Controller Userid :---" + userId);
		User user = userServices.findById(userId, userServices.getUsers());
		if (user == null)
			return ok("User Not Exist");
		System.out.println("edit User method Controller username :---" + user.getfName());
		System.out.println("edit User method Controller userList" + userList);
		Form<User> userForm = formFactory.form(User.class);
		return ok(views.html.edit.render(userForm, user));
	}

	public Result updateUser(Http.Request request) {
		Form<User> userForm = formFactory.form(User.class).bindFromRequest(request);
		System.out.println("UpdateUser method Form : ---" + userForm);
		User editedUser = userForm.get();
		System.out.println("UpdateUser method user : ---" + editedUser);
		System.out.println("USER EMAIL :---------" + editedUser.userEmail);
		System.out.println("UpdateUser method user id : ---" + editedUser.getUserId());
		User user = userServices.updateUser(editedUser);
		if (user == null)
			return ok("user not found");
		else
			return ok("successfully update");
	}

	// get all user
	public Result getAllUser() throws SQLException {
		List<User> userData = userServices.getUsers();
		System.out.println(userData);
		return ok(views.html.showuser.render(userData));
		// return ok(Json.toJson(userData));
	}

}
