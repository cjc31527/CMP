package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.avaje.ebean.Model;

import play.data.format.Formats;
import play.data.validation.Constraints;
import com.avaje.ebean.Model.Finder; 
/**
 * The persistent class for the activities database table.
 * 
 */
@Entity
public class Activity extends Model {
	@Id
	public int activityID;

	@Constraints.Required
	public String activityName;


	public String discription;

    @Formats.DateTime(pattern="dd/MM/yyyy")
	public Date removedDate;

	//bi-directional many-to-one association to Attend
	@OneToMany(mappedBy="activity")
	public List<Attend> attends;

	//bi-directional many-to-one association to Event
	@OneToMany(mappedBy="activity")
	public List<Event> events;

	//bi-directional many-to-many association to Department
	@ManyToMany
	public List<Department> departments = new ArrayList<Department>();
	
	public static Finder<Integer, Activity> find = new Finder<Integer,Activity>(Activity.class);
}