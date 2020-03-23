package _04_hospital;

import java.util.ArrayList;

public class Doctor extends Hospital{
	ArrayList<Patient> arr = new ArrayList<>();
	boolean care = false;

	public boolean performsSurgery() {
		return false;
	}

	public void assignPatient(Patient patient) {
		arr.add(patient);

	}
	public void doMedicine() {
		System.out.println("DOCTOR");
		care = true;
		//System.out.println("AFTER MEDICINE :"+care);
	}


	public boolean makesHouseCalls() {
		return false;
	}

	
	
	
	



}
