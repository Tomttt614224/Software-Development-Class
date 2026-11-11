/*
* MakingChangeAppEx.java
* @author Julie Power
* 28/9/26
*/
import javax.swing.JOptionPane;

public class MakingChangeAppEx{

	public static void main (String args []){

		// Declare variables
		double cost, cash, change;
		int num50, num20, num10, num5, num2, num1;

		// Input
		cost = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the cost of the item"));
		cash = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the cash tendered"));

		// Process
		change = cash - cost;

		num50 = (int)change/50;
		change 	= change % 50;

		num20 = (int)change / 20;
		change = change % 20 ;

		num10 = (int)change / 10;
		change = change % 10 ;

		num5 = (int)change / 5;
		change = change % 5 ;

		num2 = (int)change / 2;
		change = change % 2 ;

		num1 = (int)change;

		// Output
		JOptionPane.showMessageDialog(null, "Cash: " + cash + ", Cost: " + cost
								    		+ "\nnum50: " + num50 + "\nnum20: " + num20 + "\nnum10: " + num10
								    		+ "\nnum5: " + num5 + "\nnum2: " + num2 + "\nnum1: " + num1);
	}
}