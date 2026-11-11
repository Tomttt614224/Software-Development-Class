

import java.util.Scanner;

public class number{
    public static void main(String[] args){

        int number;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        number = sc.nextInt();

        if(number > 0){
            System.out.println("The number is positive.");
        }
        else if(number < 0){
            System.out.println("The number is negative.");
        }
        else{
            System.out.println("The number is zero.");
        }



        


        
    }
}