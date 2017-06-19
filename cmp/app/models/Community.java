package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import com.avaje.ebean.Model;

import play.data.validation.Constraints;
/**
 * The persistent class for the community database table.
 * 
 */
@Entity
public class Community extends Model {
	@Id
	public int communityID;

	@Constraints.Required
	public String communityName;

	@Lob
	public String description;

	//bi-directional many-to-one association to Department
	@OneToMany(mappedBy="community")
	public List<Department> departments;

	public static Finder<Integer, Community> find = new Finder<Integer,Community>(Community.class);
}