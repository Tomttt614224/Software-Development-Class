/*
  TheatreApp1.java
 */


import javax.swing.JOptionPane;

public class TheatreApp1{

	public static void main(String args[]){

	// Declare variables
	String days;
	int cost;

	
	// Input
	days = JOptionPane.showInputDialog(null, "Please enter a day of the week (e.g., Monday).");


	// Process
	switch(days){
		case "Monday", "Tuesday", "Wednesday", "Thursday":
			cost = 10;
			break;
		default:
			cost = 20;
	}

	//Output
	JOptionPane.showMessageDialog(null, "The cost is €" + cost + ".");
	}
}

