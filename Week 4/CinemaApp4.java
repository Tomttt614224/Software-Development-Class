/*
  CinemaApp4.java
 */


import javax.swing.JOptionPane;

public class CinemaApp4{

	public static void main(String args[]){

	// Declare variables
	int age;
	double cost;

	// Declare and create objects
	Cinema4 myCinema4 = new Cinema4();

	// Input
	age = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the cutomer's age: "));
	
	// Process
	myCinema4.setAge(age);
	myCinema4.compute();
	cost = myCinema4.getCost();
	
	// Output
	JOptionPane.showMessageDialog(null, "The cost is €" + cost + ".");
	}
}