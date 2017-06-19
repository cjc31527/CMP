package models;

import java.util.Date;
import com.avaje.ebean.Model.Finder; 

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.avaje.ebean.Model;

/**
 * The persistent class for the event database table.
 * 
 */
@Entity
public class Event extends Model {
	@EmbeddedId
	public EventPK id;

	@Lob
	public String description;

	@Temporal(TemporalType.DATE)
	public Date endDate;

	@Temporal(TemporalType.DATE)
	public Date startDate;

	//bi-directional many-to-one association to Activity
	@ManyToOne
	@JoinColumn(name="ActivityID")
	public Activity activity;

	public static Finder<EventPK, Event> find = new Finder<EventPK,Event>(Event.class);
}