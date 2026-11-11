/*
* IfElseStatement.java
* @author jpower
* 8/10/26
*/

import java.util.Scanner;

public class IfElseStatements {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
