/*
* CinemaApp2new.java
* @author ttoi
*/

import javax.swing.JOptionPane;

public class CinemaApp2new{

	public static void main (String args[]){

		// Declare variables
		int age;
		int cost;

		// Declare and create objects
		Cinema2new myCinema = new Cinema2new();

		// Input
		for (int i = 1; i <= 2; i++){
		age = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter an age for ticket"));
	

		// Process
		myCinema.setAge(age);
		myCinema.compute();

		// Output
		cost = myCinema.getCost();

		JOptionPane.showMessageDialog(null, "The cost is " + cost);
		}
	}
}
