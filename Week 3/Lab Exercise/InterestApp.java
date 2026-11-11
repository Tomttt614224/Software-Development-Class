/*
 * InterestApp.java
 */



import javax.swing.JOptionPane;

public class InterestApp{

	public static void main(String args[]){

	// Declare variables
	int numMonths;
	double numMoney, numRepaid;

	// Declare and create objects
	Interest myInterest = new Interest();

	// Input
	numMonths = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of months"));
	myInterest.setnumMonths(numMonths);
	numMoney = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter how much money you borrowed"));
	myInterest.setnumMoney(numMoney);

	// Process
	myInterest.compute();

	// Output
	numRepaid = myInterest.getnumRepaid();
	JOptionPane.showMessageDialog(null, "Total amount after " + numMonths + " months is €" + numRepaid + ".");

	}
}