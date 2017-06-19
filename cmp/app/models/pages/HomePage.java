package models.pages;

import java.util.LinkedList;
import java.util.List;

import models.Activity;
import models.Message;

public class HomePage extends Page{
    public List<Activity> attendedActivites = new LinkedList<Activity>();
    public List<Activity> activityNotifications = new LinkedList<Activity>();
    public List<Message> messages = new LinkedList<Message>();
}
