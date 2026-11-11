

import java.util.Scanner;

public class CinemaApp3{
    public static void main(String[] args)
    {
        int age;
        double cost5to14 = 5.00, cost15to65 = 10.00;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the age: ");
        age = sc.nextInt();

        if(age > 65 || age < 5){
            System.out.println("The customer is free to enter.");
        }
        else if(age >= 15){
            System.out.println("The customer's ticket cost is " + cost15to65 + ".");
            cost15to65 = sc.nextDouble();
        }
        else if(age >= 5){
            System.out.println("The customer's ticket cost is " + cost5to14 + ".");
            cost5to14 = sc.nextDouble();
        }
    }
}