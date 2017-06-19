package controllers;

import models.Activity;
import models.Student;
import models.pages.ActivityPage;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http.Cookie;
import views.html.*;

public class ActivityPageController extends Controller{

	public Result showPage(int id) {
		Cookie cookie = request().cookie("sessionId");
		String studentId = session(cookie.value());
		ActivityPage page = new ActivityPage();
		page.activity = Activity.find.byId(id);
		page.title = page.activity.activityName;
		page.user = Student.find.byId(studentId);
		return ok(activity.render(page));
	}
}
