/*
 * MakingChangeApp.java
 */

// This does solution in one file

import java.util.Scanner;

public class MakingChangeApp{

	public static void main(String args[]){

	// Declare variables
	int totalCost, cash, change, note50, note20, note10, note5, coin2, coin1;

	// Declare and create objects
	Scanner sc = new Scanner(System.in);

	// Input
	System.out.println("How much is the total cost of shopping? ");
	totalCost = sc.nextInt();
	
	System.out.println("What is the amount the customer has paid ");
	cash = sc.nextInt();

	// Process
	change = cash - totalCost;
	note50 = change / 50;
	change = change % 50;
	note20 = change / 20;
	change = change % 20;
	note10 = change / 10;
	change = change % 10;
	note5 = change / 5;
	change = change % 5;
	coin2 = change / 2;
	change = change % 2;
	coin1 = change / 1;

	// Output
	System.out.println("You need to take ");
	System.out.println("€50 Note(s): " + note50);
	System.out.println("€20 Note(s): " + note20);
	System.out.println("€10 Note(s): " + note10);
	System.out.println("€5 Note(s):  " + note5);
	System.out.println("€2 Coin(s):  " + coin2);
	System.out.println("€1 Coin(s):  " + coin1);
	
	}
}