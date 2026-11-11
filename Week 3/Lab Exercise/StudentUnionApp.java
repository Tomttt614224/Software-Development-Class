/*
 * StudentUnionApp.java
 */


import javax.swing.JOptionPane;

public class StudentUnionApp{

	public static void main(String args[]){

	// Declare variables
	int numCap, numShirts, numHoodies; 
	double totalCost;

	// Declare and create objects
	StudentUnion myStudentUnion = new StudentUnion();

	// Input
	numCap = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the quantity of caps: "));
		myStudentUnion.setnumCap(numCap);
	numShirts = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the quantity of shirts: "));
		myStudentUnion.setnumShirts(numShirts);
	numHoodies = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the quantity of hoodies: "));
		myStudentUnion.setnumHoodies(numHoodies);

	// Process
	myStudentUnion.compute();
	
	// Output
	totalCost = myStudentUnion.gettotalCost();
	JOptionPane.showMessageDialog(null, "The total cost is €" + totalCost);
	}
}