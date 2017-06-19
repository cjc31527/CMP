package models.forms;

import play.data.validation.Constraints.Required;

public class MessageEditForm {
    @Required
    public String title;
    
    @Required
    public String content;
    
}
