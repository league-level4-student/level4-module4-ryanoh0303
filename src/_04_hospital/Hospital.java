package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

	ArrayList<Doctor> doctor = new ArrayList<>();
	ArrayList<Patient> patient = new ArrayList<>();
	public void assignPatientsToDoctors() {
	
		
	}

	public void addPatient(Patient pat) {
		patient.add(pat);
		
	}


	public ArrayList<Patient> getPatients() {
		return patient;
	}

	public ArrayList<Doctor> getDoctors() {
		return doctor;
	}

	public void addDoctor(Doctor doc) {
		doctor.add(doc);
		
	}

	


	
	

}
