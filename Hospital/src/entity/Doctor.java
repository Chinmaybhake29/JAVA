package entity;

public class Doctor {
	static long id = 2000;
	String doctorid;
	String name;
	String specialization;
	String contactnumber;
	boolean isAvailabel;

	public Doctor(String name, String specialization, String contactnumber) {
		super();
		this.doctorid = "D" + ++id;
		this.name = name;
		this.specialization = specialization;
		this.contactnumber = contactnumber;
		this.isAvailabel = true;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public boolean isAvailabel() {
		return isAvailabel;
	}

	public void setAvailabel(boolean isAvailabel) {
		this.isAvailabel = isAvailabel;
	}

	public String getDoctorid() {
		return doctorid;
	}

	public String getName() {
		return name;
	}

}
