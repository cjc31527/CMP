package controllers;

import java.sql.Connection;
import java.util.LinkedList;
import java.util.List;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Transaction;

import play.mvc.Controller;
import play.mvc.Http.Cookie;
import play.mvc.Result;

import models.Activity;
import models.Attend;
import models.Student;
import models.Community;

import models.pages.ActivityListPage;
import views.html.*;

public class ActivityListPageController extends Controller {

	public Result showPage() {
		Cookie cookie = request().cookie("sessionId");
		String sessionId = cookie.value();
		String studentId = session(sessionId);
		ActivityListPage page = new ActivityListPage();
		page.attendedActivites = this.queryAcitivites(studentId);
		page.title = "所有活动";
		page.user = Student.find.byId(studentId);
		return ok(activities_list.render(page));
	}
	
	private LinkedList<Activity> queryAcitivites(String studentId) {
		
		return new LinkedList<Activity>();
	}

}
