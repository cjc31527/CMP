package models;

import java.util.*;
import com.avaje.ebean.Model.Finder; 
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;
/**
 * The primary key class for the attend database table.
 * 
 */
@Embeddable
public class AttendPK extends Model{

	@Column(insertable=false, updatable=false)
	public int activityID;

	@Column(insertable=false, updatable=false)
	public String studentID;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + activityID;
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
		AttendPK other = (AttendPK) obj;
		if (activityID != other.activityID)
			return false;
		if (studentID == null) {
			if (other.studentID != null)
				return false;
		} else if (!studentID.equals(other.studentID))
			return false;
		return true;
	}

}