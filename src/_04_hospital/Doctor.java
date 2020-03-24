package _04_hospital;

import java.util.ArrayList;

public class Doctor extends Hospital{
	ArrayList<Patient> arr = new ArrayList<>();
	boolean care = false;
	public boolean performsSurgery() {
		return false;
	}

	public void assignPatient(Patient patient) throws Exception{
		if(arr.size() <3 ) {
			arr.add(patient);
		}
		else {
			throw new Exception("DoctorFullException");
		}
	
	}
	public void doMedicine() {
		System.out.println("SDFSDF");
		for(int i=0; i<arr.size(); i++) {
			arr.get(i).care = true;
		}
		//System.out.println("AFTER MED.ICINE :"+care);
	}
	public ArrayList<Patient> getPatients() {
		return arr;
	}


	public boolean makesHouseCalls() {
		return false;
	}

	
	
	
	



}
