package _04_hospital;

public class Patient extends Doctor{
	
	public boolean feelsCaredFor() {
		System.out.println(care);
		return care;
	}
	public void checkPulse() {
		care = true;
	}
	public void doMedicine() {
		System.out.println("Patient");
		care = true;
	}
	



}
