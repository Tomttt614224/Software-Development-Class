/*
 * PayApp.java
 */


import java.util.Scanner;

public class PayApp{

	public static void main(String args[]){

	// Declare variables
	double numOfBasicHours, numOfOvertimeHours, basicPayRate, basicPay, overtimePay, totalPay;

	// Declare and create objects
	Scanner sc = new Scanner(System.in);
	Pay myPayApp = new Pay();

	// Input
	System.out.println("Please enter the basic pay rate: ");
	basicPayRate = sc.nextDouble();
	System.out.println("Please enter the number of basic hours worked in a week: ");
	numOfBasicHours = sc.nextDouble();
	System.out.println("Please enter the number of overtime hours worked in a week: ");
	numOfOvertimeHours = sc.nextDouble();

	// Process
	myPayApp.setbasicPayRate(basicPayRate);
	myPayApp.setnumOfBasicHours(numOfBasicHours);
	myPayApp.setnumOfOvertimeHours(numOfOvertimeHours);	
	myPayApp.compute();
	basicPay = myPayApp.getbasicPay();
	overtimePay = myPayApp.getovertimePay();
	totalPay = myPayApp.getTotalPay();

	// Output
	System.out.println("The basic pay is " + basicPay + ", the overtime pay is " + overtimePay + ", and the total pay is " + totalPay);
	}
}