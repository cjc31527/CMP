package controllers;

import models.Student;
import models.forms.StudentLoginForm;
import models.pages.LoginPage;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Http.RequestBody;
import play.mvc.Result;

import java.util.Date;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;

import views.html.*;

public class LoginPageController extends Controller{
    
	private FormFactory formFactory;

	@Inject
	public LoginPageController(FormFactory formFactory) {
       this.formFactory = formFactory; 
	}

	// TODO
	public Result login() {
		Form<Student> studentForm = formFactory.form(Student.class);
		Student studentFromRequest = studentForm.bindFromRequest().get();
		Student studentFormDB = Student.find.byId(studentFromRequest.studentID);

		LoginPage page = new LoginPage();
		page.title = "登录";

		if (studentFormDB == null) {
			page.errorMsg = "账号不存在";
			return ok(login.render(page));
		}
		if (studentFormDB.password.equals(studentFromRequest.password)) {
			page.errorMsg = "";
			String studentId = studentFromRequest.studentID;
			Date date = new Date();
			String sessionId = Long.toString(date.getTime());
			response().setCookie("sessionId", sessionId);
			session(sessionId, studentId);
			return redirect("/home");
		} else {
			page.errorMsg = "密码错误";
			return ok(login.render(page));
		}
	}

	public Result logout() {
		if (request().cookie("sessionId").value() != null) {
			session().remove(request().cookie("sesionId").value()); 
		}
		return this.showPage();
	}

	public Result showPage() {
		JsonNode s = request().body().asJson();
		LoginPage page = new LoginPage();
		page.title = "登录";
		return ok(login.render(page));
	}
}