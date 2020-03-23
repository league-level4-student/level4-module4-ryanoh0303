package _04_hospital;

import java.util.ArrayList;

public class GeneralPractitioner extends Doctor{
	

	public boolean makesHouseCalls() {
		return true;
	}
	public void assignPatient(Patient patient) {
		arr.add(patient);
	}
	public ArrayList<Patient> getPatients() {
		return arr;
	}

   public void doMedicine() {
	  System.out.println("GENERAL RUNNING");
	  care = true;
	}

}
