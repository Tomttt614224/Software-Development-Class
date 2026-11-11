/*
* CinemaApp4.java
* @author jpower
* 8/10/26
*/

import javax.swing.JOptionPane;

public class CinemaApp4{

	public static void main (String args[]){

		// Declare variables
		int age;
		double cost;

		// Declare and create objects
		Cinema4 myCinema = new Cinema4();

		// Input
		age = Integer.parseInt(JOptionPane.showInputDialog(null, "How old are you"));

		// Process
		myCinema.setAge(age);
		myCinema.compute();

		// Output
		cost = myCinema.getCost();

		JOptionPane.showMessageDialog(null, "The cost is " + cost);
	}
}
