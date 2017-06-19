package models;

import java.util.*;

import javax.persistence.*;

import com.avaje.ebean.Model;
/**
 * The primary key class for the belongto database table.
 * 
 */
@Embeddable
public class BelongtoPK extends Model {
	@Column(insertable=false, updatable=false)
	public String studentID;

	@Column(insertable=false, updatable=false)
	public int departmentID;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + departmentID;
		result = prime * result + ((studentID == null) ? 0 : studentID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongtoPK other = (BelongtoPK) obj;
		if (departmentID != other.departmentID)
			return false;
		if (studentID == null) {
			if (other.studentID != null)
				return false;
		} else if (!studentID.equals(other.studentID))
			return false;
		return true;
	} 

	
}