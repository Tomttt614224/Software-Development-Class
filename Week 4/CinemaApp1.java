import java.util.Scanner;

public class CinemaApp1{
    public static void main(String[] args)
    {
        int age;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the age: ");
        age = sc.nextInt();

        if(age >= 100){
            System.out.println("The customer is free to enter.");
        }
    }
}


