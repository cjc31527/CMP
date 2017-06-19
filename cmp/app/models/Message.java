package models;

import javax.persistence.Entity;
import com.avaje.ebean.Model.Finder; 
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import com.avaje.ebean.Model;
/**
 * The persistent class for the messages database table.
 * 
 */
@Entity
public class Message extends Model {
	@Id
	public int textID;

	@Lob
	public String content;

	//bi-directional many-to-one association to Department
	@ManyToOne
	@JoinColumn(name="DepartmentID")
	public Department department;
	

	public static Finder<Integer, Message> find = new Finder<Integer,Message>(Message.class);
}