package controllers;

import java.util.LinkedList;
import java.util.List;

import models.Activity;
import models.Student;
import models.Attend;
import models.Belongto;
import models.Message;
import models.pages.HomePage;
import play.mvc.*;
import play.mvc.Http.Cookie;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests to the
 * application's home page.
 */
public class HomePageController extends Controller{

	/**
	 * An action that renders an HTML page with a welcome message. The configuration
	 * in the <code>routes</code> file means that this method will be called when
	 * the application receives a <code>GET</code> request with a path of
	 * <code>/</code>.
	 */
	
	public Result showPage() {
		Cookie cookie = request().cookie("sessionId");
		String studentId = session(cookie.value());
		Student student = Student.find.byId(studentId);
		
		List<Activity> activityNotifications = new LinkedList<Activity>();
		List<Message> messages = new LinkedList<Message>();

		for (Belongto b : student.belongtos) {
			activityNotifications.addAll(b.department.activities);
			messages.addAll(b.department.messages);
		}

		HomePage page = new HomePage();
		page.activityNotifications = new LinkedList<Activity>();
		page.attendedActivites = activityNotifications;
		page.messages = messages;
		page.user = student;
		page.title = "主页";
		return ok(home.render(page));
	}
}
