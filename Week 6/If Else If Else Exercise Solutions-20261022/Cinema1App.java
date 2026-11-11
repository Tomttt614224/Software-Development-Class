/*
* Cinema1App.java
* @author jpower
* 8/10/26
*/

import javax.swing.JOptionPane;

public class Cinema1App{

	public static void main (String args[]){

		int age;

		// Input
		age = Integer.parseInt(JOptionPane.showInputDialog(null, "How old are you?"));

		// Output
		if(age == 100){
			JOptionPane.showMessageDialog(null, "Congratulations you've just won a golden ticket!");
		}
	}
}