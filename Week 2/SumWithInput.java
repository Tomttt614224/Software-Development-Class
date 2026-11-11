import java.util.Scanner;

public class SumWithInput
{
   public static void main(String[] args)
   {
      //declare variables
      int num1, num2, result;

      //declare vand create objects
      Scanner sc = new Scanner(System.in);

      //input
      System.out.print("Please enter num1: ");
      num1 = sc.nextInt();

      System.out.print("Please enter num2: ");
      num2 = sc.nextInt();
      
      //process
      result = num1+num2;

      //output
      System.out.println("The result is " + (result));
   }
}