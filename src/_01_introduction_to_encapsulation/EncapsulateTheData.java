package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */



public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	
	public static void main(String[] args) {
		
	}
	public int getitemsReceived() {
		return itemsReceived;
	}
	public void setitemsReceived(int i) {
		if(i<0) {
			i=0;
		}
		itemsReceived = i;
	}
	public float getdegreesTurned() {
		return degreesTurned;
	}
	public void setdegreesTurned(float x) throws Exception {
		if(0.0<=x && x<=360) {
			degreesTurned = x;
		}
		else {
			throw new Exception();
		}
	}
	public String getNomenclature() {
		return nomenclature;
	}
	public void setNomenclature(String x)  throws Exception{
		if(x.length()!=0) {
			throw new Exception();
		}
		else {
			nomenclature = x;
		}
	}
	public Object getmemberObj() {
		return memberObj;
	}
	public void setmemberObj(Object x) throws Exception {
		if(x instanceof String) {
			throw new Exception();
		}
		else {
			memberObj= x;
		}
	}
}
