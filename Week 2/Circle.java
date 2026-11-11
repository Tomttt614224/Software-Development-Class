import java.util.Scanner;

public class Circle
{
   public static void main(String[] args)
   {
      //declare variables
      final double PI = 3.14;
      int radius;
      double area, circumference;

      //declare and create objects
      Scanner sc = new Scanner(System.in);

      //input
      System.out.print("Please enter radius: ");
      radius = sc.nextInt();
      
      //process
      area = radius*radius*PI;
      circumference = 2*radius*PI;

      //output
      System.out.printf("The area is " + area + " and the circumference is " + circumference + ".");
   }
}