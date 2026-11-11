/*
  MonthWithSwitch.java
 */


import java.util.Scanner;

public class MonthWithSwitch{

	public static void main(String args[]){

	// Declare variables
	int monthNum,numDays;

	// Declare and create objects
	Scanner sc = new Scanner(System.in);
	
	// Input
	System.out.print("Please enter a month number(e.g 1 for January, 2 for February): ");
	monthNum = sc.nextInt();

	// Process
	switch(monthNum){
		case 1,3,5,7,8,10,12:
			numDays = 31;
			break;
		case 4,6,9,11:
			numDays = 30;
			break;
		case 2:
			numDays = 28;
			break;
		default:
			numDays = 0;
	}
	// Output
	if(numDays > 0){
		System.out.println("The month has " + numDays + " days.");
	}
	else{
		System.out.println("Invalid month number.");
	}
}
}


