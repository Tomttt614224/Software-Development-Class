import java.util.Scanner;

public class AgeWithInput
{
   public static void main(String[] args)
   {
      int age;

      //declare and create an object
      Scanner sc = new Scanner(System.in);

      //input
      System.out.print("Please enter your age");
      age = sc.nextInt();
      
      //output
      System.out.println("Your age is " + age);
   }
}