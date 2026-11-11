import java.util.Scanner;

public class AreaCalculator
{
   public static void main(String[] args)
   {
      //declare variables
      int length, width, area;

      //declare and create objects
      Scanner sc = new Scanner(System.in);

      //input
      System.out.print("Please enter length: ");
      length = sc.nextInt();

      System.out.print("Please enter width: ");
      width = sc.nextInt();
      
      //process
      area = length*width;

      //output
      System.out.println("The area is " + (area) + " square units.");
   }
}