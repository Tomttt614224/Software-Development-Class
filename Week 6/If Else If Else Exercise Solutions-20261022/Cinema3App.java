/*
* Cinema3App.java
* @author jpower
* 8/10/26
*/

import javax.swing.JOptionPane;

public class Cinema3App{

	public static void main (String args[]){

			// Declare Variables
			int age;
			int cost;

			// Input
			age = Integer.parseInt(JOptionPane.showInputDialog(null, "How old are you?"));

			// Process
			if(age < 5){
				cost = 0;
			}
			else if(age >= 5 && age < 15){
				cost = 5;
			}
			else if(age >= 15 && age < 66){
				cost = 10;
			}
			else{
				cost = 0;
			}

			// Output
			JOptionPane.showMessageDialog(null, "The cost is " + cost);
	}
}
