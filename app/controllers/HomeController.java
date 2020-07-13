package controllers;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import models.User;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import services.UserServices;

public class HomeController extends Controller {

	@Inject
	private FormFactory formFactory;

	@Inject
	private UserServices userServices;
	
	
	public List<User> userList = new ArrayList<User>();
	
	public Result index() {
		String name = "tejashree";
		return ok(views.html.index.render(name));
	}

	public Result addUser() {
		Form<User> userForm = formFactory.form(User.class);
		return ok(views.html.addUser.render(userForm));
	}

	public Result saveUser(Http.Request request) {
		Form<User> userform = formFactory.form(User.class).bindFromRequest(request);
		System.out.println(userform);
		User user = userform.get();
		userServices.addUser(user,userList);
		return redirect(routes.HomeController.addUser());
	}

	public Result editUser(Integer userId) {
		System.out.println("edit User method Controller Userid :---"+userId);
		User user = userServices.findById(userId,userList);
		System.out.println("edit User method Controller username :---"+user.getfName());
		System.out.println("edit User method Controller userList"+ userList);
		Form<User> userForm = formFactory.form(User.class).fill(user);
		return ok(views.html.edit.render(userForm));
	}
	
	public Result updateUser(Http.Request request) {
		Form<User> userForm = formFactory.form(User.class).bindFromRequest(request);
		System.out.println("UpdateUser method Form : ---"+ userForm);
		User editedUser = userForm.get();
		System.out.println("UpdateUser method user : ---"+editedUser);
		System.out.println("UpdateUser method user id : ---"+editedUser.getUserId());
		User user = userServices.updateUser(editedUser,userList);
		if(user == null) 
			return ok("user not found");
		else
		return ok("successfully update");
	}
	// get all user
	public Result getAllUser() {
		// return ok(Json.toJson(users));
		return ok(views.html.showuser.render(userList));
	}

}
