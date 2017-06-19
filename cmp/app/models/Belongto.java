package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

/**
 * The persistent class for the belongto database table.
 * 
 */
@Entity
public class Belongto extends Model {
	public static final String ADMIN = "管理员";

	public static final String COMMON_USER = "普通用户";

	@EmbeddedId
	public BelongtoPK id;

	public String contactNumber;

	public String otherInfo;

	public String priviledge;

	//bi-directional many-to-one association to Student
	@ManyToOne
	@JoinColumn(name="studentID")
	public Student student;

	//bi-directional many-to-one association to Department
	@ManyToOne
	@JoinColumn(name="DepartmentID")
	public Department department;

	public static Finder<BelongtoPK, Belongto> find = new Finder<BelongtoPK,Belongto>(Belongto.class);
}