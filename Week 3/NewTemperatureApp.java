/*
 * NewTemperatureApp.java
 */

// This does solution in one file

import java.util.Scanner;

public class NewTemperatureApp{

	public static void main(String args[]){

	// Declare variables
	double tempCelsius, tempFahrenheit;

	// Declare and create objects
	Scanner sc = new Scanner(System.in);
	Temperature myTemperature = new Temperature();

	// Input
	System.out.println("Please enter the temperature in Celsius");
	tempCelsius = sc.nextDouble();

	// Process
	myTemperature.setTempCelsius(tempCelsius);
	myTemperature.compute();
	tempFahrenheit = myTemperature.getTempFahrenheit();

	// Output
	System.out.println("The temperature in Fahrenheit is " + tempFahrenheit );
	}
}