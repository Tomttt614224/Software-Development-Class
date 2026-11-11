/*
  DayWithSwitch.java
 */


import java.util.Scanner;

public class DayWithSwitch{

	public static void main(String args[]){

	// Declare variables
	int day;

	// Declare and create objects
	Scanner sc = new Scanner(System.in);
	
	// Input
	System.out.print("Please enter a day number: ");
	day = sc.nextInt();

	// Process & Output
	switch(day){
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid day number.");
	}
	}
}


