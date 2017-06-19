package models;

import java.util.List;
import com.avaje.ebean.Model.Finder; 

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.avaje.ebean.Model;

import play.data.validation.Constraints;
/**
 * The persistent class for the departments database table.
 * 
 */
@Entity
public class Department extends Model {
	@Id
	public int departmentID;

	@Constraints.Required
	public String departmentName;

	//bi-directional many-to-one association to Belongto
	@OneToMany(mappedBy="department")
	public List<Belongto> belongtos;

	//bi-directional many-to-one association to Community
	@ManyToOne
	@JoinColumn(name="CommunityID")
	public Community community;

	//bi-directional many-to-many association to Activity
	@ManyToMany(mappedBy="departments")
	public List<Activity> activities;

	//bi-directional many-to-one association to Message
	@OneToMany(mappedBy="department")
	public List<Message> messages;

	public static Finder<Integer, Department> find = new Finder<Integer,Department>(Department.class);
}