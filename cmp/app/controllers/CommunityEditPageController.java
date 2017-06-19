package controllers;

import javax.inject.Inject;

import models.Community;
import models.Student;
import models.pages.CommunityEditPage;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http.Cookie;
import play.mvc.Result;

import views.html.*;

public class CommunityEditPageController extends Controller{
	
	private FormFactory formFactory;

	@Inject
	public void MessageEditPageController(play.data.FormFactory formFactory) {
		this.formFactory = formFactory;
	}
	
	public Result edit(int id) {
		return redirect("/home");
	}
	
	public Result showPage(int id) {
		Community community = Community.find.byId(id);
		CommunityEditPage page = new CommunityEditPage();
		page.community = community;
		page.title = "编辑 | " + community.communityName;
		page.user = Student.find.byId(session(request().cookie("sessionId").value()));
		return ok(community_edit.render(page));
	}
}
