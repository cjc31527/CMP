package controllers;

import javax.inject.Inject;

import models.Message;
import models.Student;
import models.pages.MessageEditPage;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.*;
public class MessageEditPageController extends Controller {
    
	private FormFactory formFactory;

	@Inject
	public MessageEditPageController(play.data.FormFactory formFactory) {
		this.formFactory = formFactory;
	}
	
	public Result edit(int id) {
		
		return redirect("/home");
	}
	
	public Result showPage(int id) {
		Student user = Student.find.byId(session(request().cookie("sessionId").value()));
		MessageEditPage page = new MessageEditPage();
		Message message = Message.find.byId(id);
		page.department = message.department;
		page.title = "编辑";
		page.user = user;
    	return ok(message_edit.render(page));
    }
}
