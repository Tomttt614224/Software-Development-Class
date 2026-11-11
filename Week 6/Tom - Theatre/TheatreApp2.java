/*
  TheatreApp2.java
 */


import javax.swing.JOptionPane;

public class TheatreApp2{

	public static void main(String args[]){

	// Declare variables
	String days;
	int age, cost;

	// Declare and create objects
	Theatre2 myTheatre2 = new Theatre2();

	
	// Input
	days = JOptionPane.showInputDialog(null, "Please enter a day of the week (e.g., Monday).");
	age = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the cutomer's age: "));
	
	
	// Process
	myTheatre2.setDays(days);
	myTheatre2.setAge(age);
	myTheatre2.compute();
	cost = myTheatre2.getCost();

	//Output
	JOptionPane.showMessageDialog(null, "The cost is €" + cost + ".");
	}
}
