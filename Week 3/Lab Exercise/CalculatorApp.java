/*
  CalculatorApp.java
 */


import javax.swing.JOptionPane;

public class CalculatorApp{

	public static void main(String args[]){

	// Declare variables
	double num1, num2, sum, difference;;

	// Declare and create objects
	Calculator myCalculator = new Calculator();

	// Input
	num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the first number: "));
	num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the second number: "));
	
	// Process
	myCalculator.setnum1(num1);
	myCalculator.setnum2(num2);
	myCalculator.compute();
	sum = myCalculator.getsum();
	difference = myCalculator.getdifference();

	// Output
	System.out.println("Sum is : " + sum);
	System.out.println("Difference is : " + difference);
	}
}