package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

	ArrayList<Doctor> doctor = new ArrayList<>();
	ArrayList<Patient> patient = new ArrayList<>();
	ArrayList<Hospital> hospital = new ArrayList<>();
	public void assignPatientsToDoctors() {
		int counter = 0;
		/*
			for(int i=0; i<patient.size(); i++) {
				for(int j=0; i<doctor.size(); j++) {
					try {
						doctor.get(i).assignPatient(patient.get(i));
					} catch (Exception e) {
						// TODO Auto-generated catch block
					
					}
				}
			}
			*/
		for(int i=0; i<patient.size(); i++) {
			for(int j=0; i<doctor.size(); j++) {
			try {
				doctor.get(i).assignPatient(patient.get(i));
			} catch (Exception e) {
			}
		}
		}
		System.out.println("COUNTER: "+counter);
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
