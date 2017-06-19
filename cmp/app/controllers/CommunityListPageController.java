package controllers;

import java.util.LinkedList;
import java.util.List;

import models.Belongto;
import models.Community;
import models.Student;
import models.pages.CommunityListPage;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http.Cookie;

import views.html.*;

public class CommunityListPageController extends Controller{
    
	public Result showPage() {
		Cookie cookie = request().cookie("sessionId");
		String studentId = session(cookie.value());
		
		CommunityListPage page = new CommunityListPage();
		
		List<Belongto> a = Student.find.byId(studentId).belongtos;
		List<Community> c = new LinkedList<Community>();
		for (Belongto b : a) {
			c.add(b.department.community);
		}
		page.communityList = c;
		page.user = Student.find.byId(studentId);
		page.title = "社团列表";
		return ok(community_list.render(page));
	}
}
