import java.util.Scanner;

public class Circle2
{
   public static void main(String[] args)
   {
      //declare variables
      final double PI = 3.14;
      int diameter;
      double radius, area, circumference;

      //declare and create objects
      Scanner sc = new Scanner(System.in);

      //input
      System.out.print("Please enter diameter: ");
      diameter = sc.nextInt();
      
      //process
      radius = (double)diameter/2;
      area = radius*radius*PI;
      circumference = 2*radius*PI;

      //output
      System.out.printf("The area is " + area + " and the circumference is " + circumference + ".");
   }
}