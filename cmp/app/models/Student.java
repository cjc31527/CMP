package models;

import java.util.Date;
import java.util.List;
import com.avaje.ebean.Model.Finder; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.avaje.ebean.Model;

import play.data.validation.Constraints;
import play.data.validation.Constraints.Required;
/**
 * The persistent class for the students database table.
 * 
 */
@Entity
public class Student extends Model {
	public static final byte MALE = 1;
	public static final byte FEMALE = 0;
	
	@Id
	@Column(name="studentID")
	@Constraints.Required
	public String studentID;

	public int grade;

	public String major;
	
	@Constraints.Required
	public String password;

	@Column(columnDefinition = "integer CHECK(sex = 1 or sex = 0)")  
	public int sex;

	public Date lastLoginDate;
	
	public String studentName;

	//bi-directional many-to-one association to Attend
	@OneToMany(mappedBy="student")
	public List<Attend> attends;
   
	//bi-directional many-to-one association to Belongto
	@OneToMany(mappedBy="student")
	public List<Belongto> belongtos;

	public static Finder<String, Student> find = new Finder<String,Student>(Student.class);
}