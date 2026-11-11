/*
 * EggsApplication.java
 */

// This does solution in one file

import java.util.Scanner;

public class EggsApplication{

	public static void main(String args[]){

	// Declare variables
	int numEggs, numBoxes, numLeftOver;

	// Declare and create objects
	Scanner sc = new Scanner(System.in);

	// Input
	System.out.println("How many eggs did you collect?");
	numEggs = sc.nextInt();

	// Process
	numBoxes = numEggs/12;
	numLeftOver = numEggs%12;

	// Output
	System.out.println("The number of eggs is " + numEggs + " which fills " + numBoxes + " boxes with " + numLeftOver + " eggs left over");
	}
}