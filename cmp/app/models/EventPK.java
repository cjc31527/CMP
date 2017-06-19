package models;

import javax.persistence.Embeddable;
import com.avaje.ebean.Model.Finder; 

import com.avaje.ebean.Model;
/**
 * The primary key class for the event database table.
 * 
 */
@Embeddable
public class EventPK extends Model {

	public int activityID;

	public int eventOrder;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + activityID;
		result = prime * result + eventOrder;
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
		EventPK other = (EventPK) obj;
		if (activityID != other.activityID)
			return false;
		if (eventOrder != other.eventOrder)
			return false;
		return true;
	}
}