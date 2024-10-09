package service;

import entity.*;
import java.util.HashMap;
public class Hospital {
	HashMap<String, Patient> patients;
	HashMap<String, Doctor> doctors;
	
	public void addPatient(Patient p) {
		patients.put(p.getPatientname(), p);
	}
	public void removePatient(String patientId) {
		patients.remove(patientId);
	}
	public void upadtePatient(String patientId, Patient p) {
		patients.replace(patientId, p);
	}
	public void displayAllPatient() {
		for (Patient p : patients.values()) {
			System.out.println(p);
		}
	}
	public Patient getPatient(String patientid) {
		return patients.get(patientid);
	}
	public void addDoctor(Doctor d) {
		doctors.put(d.getName(), d);
	}
	public void removeDoctor(String doctorId) {
		doctors.remove(doctorId);
	}
	public void updateDoctor(String doctorId, Doctor d) {
		doctors.replace(doctorId, d);
	}
	public void displayAllDoctor() {
		for (Doctor d : doctors.values()) {
			System.out.println(d);
		}
	}
	public Doctor getDoctor(String doctorid) {
		return doctors.get(doctorid);
	}
	
}
