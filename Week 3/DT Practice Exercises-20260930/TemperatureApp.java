/*
 * EggsApp.java
 */

// This does solution in one file

import java.util.Scanner;

public class TemperatureApp{

	public static void main(String args[]){

	// Declare variables
	double tempCelsius, tempFahrenheit;

	// Declare and create objects
	Scanner sc = new Scanner(System.in);

	// Input
	System.out.println("Please enter the temperature in Celsius");
	tempCelsius = sc.nextInt();

	// Process
	tempFahrenheit = (tempCelsius * 9 / 5) + 32;

	// Output
	System.out.println("The temperature in Fahrenheit is " + tempFahrenheit );
	}
}