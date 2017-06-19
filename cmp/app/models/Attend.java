package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;

/**
 * The persistent class for the attend database table.
 * 
 */
@Entity
public class Attend extends Model {

	@EmbeddedId
	public AttendPK id;

	@Temporal(TemporalType.DATE)
	public Date attendDate;

	//bi-directional many-to-one association to Activity
	@ManyToOne
	@JoinColumn(name="ActivityID")
	public Activity activity;

	//bi-directional many-to-one association to Student
	@ManyToOne
	@JoinColumn(name="studentID")
	public Student student;

	public static Finder<AttendPK, Attend> find = new Finder<AttendPK,Attend>(Attend.class);
}