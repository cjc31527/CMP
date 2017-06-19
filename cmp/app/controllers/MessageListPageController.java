package controllers;

import java.util.LinkedList;
import java.util.List;

import models.Belongto;
import models.Message;
import models.Student;
import models.pages.MessageListPage;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.*;

public class MessageListPageController extends Controller {
    
	public Result showPage() {
		Student user = Student.find.byId(session(request().cookie("sessionId").value()));
		
		List<Message> messages = new LinkedList<Message>();
		for (Belongto b : user.belongtos) {
			messages.addAll(b.department.messages);
		}
		
		MessageListPage page = new MessageListPage();
		page.messages = messages;
		page.title = "消息盒子";
		page.user = user;
		return ok(message_list.render(page));
	}
}
