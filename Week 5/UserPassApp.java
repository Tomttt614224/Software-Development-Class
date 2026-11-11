/*
  UserPassApp.java
 */


import javax.swing.JOptionPane;

public class UserPassApp{

	public static void main(String args[]){

	// Declare variables
	String username, password;

	
	// Input
	username = JOptionPane.showInputDialog(null, "Please enter your username: ");
	password = JOptionPane.showInputDialog(null, "Please enter your password: ");

	// Process & Output
	if (username.equals("ttoi")){
		if(password.equals("Welcome123")){
		JOptionPane.showMessageDialog(null, "Login successful!!");
		}
		else{
			JOptionPane.showMessageDialog(null, "Incorrect password.");
		}
	}
	else if(password.equals("Welcome123")){
			JOptionPane.showMessageDialog(null, "Incorrect username.");
	}
	else{
		JOptionPane.showMessageDialog(null, "Login failed.");
	}
	}
}

