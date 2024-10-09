package entity;

public class Patient {
	private static long id=1000;
	private String patientid;
	private String patientname;
	private int age;
	private String gender;
	private String contactno;
	
	public Patient(String patientname, int age, String gender, String contactno) {
		super();
		this.patientname = patientname;
		this.age = age;
		this.gender = gender;
		this.contactno = contactno;
		this.patientid="P"+ ++id;
	}
	public String getPatientname() {
		return patientname;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	
	public String getContactno() {
		return contactno;
	}
	
	
	
}
