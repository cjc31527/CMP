package controllers;

import models.Student;
import models.pages.CommunityManagementPage;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.community_management;

public class CommunityManagementPageController extends Controller {
    
	public Result showPage(int id) {
		String studentId = session(request().cookie("sessionId").value());
		Student student = Student.find.byId(studentId);
		CommunityManagementPage page = new CommunityManagementPage();
		page.title = "社团管理页面";
		page.user = student;
		return ok(community_management.render(page));
	}
}
