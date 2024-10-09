package entity;

import java.time.LocalDateTime;

public class appointment {
	static long id=4000;
	String patientid;
	String doctorid;
	LocalDateTime date;
	String appointmentid;
	public appointment(String patientid, String doctorid) {
		super();
		this.patientid = patientid;
		this.doctorid = doctorid;
		this.appointmentid="APT" + ++id;
		this.date=date.now();
	}
	public String getPatientid() {
		return patientid;
	}
	public void setPatientid(String patientid) {
		this.patientid = patientid;
	}
	public String getDoctorid() {
		return doctorid;
	}
	public void setDoctorid(String doctorid) {
		this.doctorid = doctorid;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public String getAppointmentid() {
		return appointmentid;
	}
	
}
