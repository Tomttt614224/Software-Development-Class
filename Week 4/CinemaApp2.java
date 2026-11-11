

import java.util.Scanner;

public class CinemaApp2{
    public static void main(String[] args)
    {
        int age;
        double under14 = 15.00, over14 = 30.00;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the age: ");
        age = sc.nextInt();

        if(age <= 14){
            System.out.println("The customer's ticket cost is " + under14 + ".");
            under14 = sc.nextDouble();
        }
        else{
            System.out.println("The customer's ticket cost is " + over14 + ".");
            over14 = sc.nextDouble();
        }
    }
}