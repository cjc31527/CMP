package controllers;

import models.Community;
import models.Student;
import models.pages.CommunityPage;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.*;
public class CommunityPageController extends Controller {
	public Result showPage(int id) {
		Student user = Student.find.byId(session(request().cookie("sessionId").value()));
		Community com = Community.find.byId(id);
		if (com == null) {
			return notFound("<h1>404 not found</h1>").as("text/html");
		}
		CommunityPage page = new CommunityPage();
		page.community = com;
		page.title = com.communityName;
		page.user = user;
		return ok(community.render(page));
	}
}