package controllers;

import javax.inject.Inject;

import models.Activity;
import models.Message;
import models.Student;
import models.forms.MessageEditForm;
import models.pages.ActivityEditPage;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.*;

public class ActivityEditPageController extends Controller{

	private play.data.FormFactory formFactory;
	
	@Inject
	public ActivityEditPageController(play.data.FormFactory formFactory) {
		this.formFactory = formFactory;
	}
	
	public Result edit(int id) {

		return redirect("/home");
	}

	public Result showPage(int id) {
		Student user = Student.find.byId(session(request().cookie("sessionId").value()));
		ActivityEditPage page = new ActivityEditPage();
		page.activity = Activity.find.byId(id);
		page.title = page.activity.activityName;
		page.user = user;
		return ok(activity_edit.render(page));
	}
}
