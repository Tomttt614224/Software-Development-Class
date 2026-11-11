/*
* Cinema4.java
* @author jpower
* 8/10/26
*/

public class Cinema4{

	// Data Members
	private int age;
	private int cost;

	// Constructor
	public Cinema4(){
		age = 0;
		cost = 0;
	}

	// Setter
	public void setAge(int age){
		this.age = age;
	}

	// Compute Method
	public void compute(){
		if(age < 5){
			cost = 0;
		} // age < 5
		else if(age >= 5 && age < 15){
			cost = 5;
		}
		else if(age >= 15 && age < 66){
			cost = 10;
		}
		else{
			cost = 0;
		}
	}

	// Getter
	public int getCost(){
		return cost;
	}
}

