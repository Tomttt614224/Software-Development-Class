/*
* Cinema2App.java
* @author jpower
* 8/10/26
*/

import javax.swing.JOptionPane;

public class Cinema2App{

	public static void main (String args[]){

		int age;

		// Input
		age = Integer.parseInt(JOptionPane.showInputDialog(null, "How old are you?"));

		// Process and Output
		if(age < 14){
			JOptionPane.showMessageDialog(null, "The cost is 15 euros");
		}
		else{
			JOptionPane.showMessageDialog(null, "The cost is 30 euros");
		}
	}
}