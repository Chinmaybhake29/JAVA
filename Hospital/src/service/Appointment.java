package service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import entity.Doctor;
import entity.Patient;
import entity.appointment;

public class Appointment {
	ArrayList<Appointment> appointments=new ArrayList<Appointment>();
	Hospital hospital;
	final String logfile="D://logfile.txt";
	public Appointment( Hospital hospital) {
		super();
		this.hospital = hospital;
	}
	void logAppointment(String message) {
		try {
			BufferedWriter writer=new BufferedWriter(new FileWriter(logfile, true)) ;
			writer.write(message);
			writer.newLine();
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	void scheduleAppointments(String doctorid, String patientid) {
		Doctor doctor=hospital.getDoctor(doctorid);
		Patient p=hospital.getPatient(patientid);
		
		appointment appointment1=new appointment(doctorid, patientid);
		appointments.add(appointment1);
		
		
	}
	
	
}
