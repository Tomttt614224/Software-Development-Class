/*
  TheatreApp3.java
 */


import javax.swing.JOptionPane;

public class TheatreApp3{

	public static void main(String args[]){

	// Declare variables
	String days;
	int cost;

	// Declare and create objects
	Theatre3 myTheatre3 = new Theatre3();

	
	// Input
	days = JOptionPane.showInputDialog(null, "Please enter a day of the week (e.g., Monday).");
	
	
	// Process
	myTheatre3.setDays(days);
	myTheatre3.compute();
	cost = myTheatre3.getCost();

	//Output
	JOptionPane.showMessageDialog(null, "The cost is €" + cost + ".");
	}
}
