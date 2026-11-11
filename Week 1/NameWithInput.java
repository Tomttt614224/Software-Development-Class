import java.util.Scanner;

public class NameWithInput
{
   public static void main(String[] args)
   {
      String name;

      //declare and create an object
      Scanner sc = new Scanner(System.in);

      //input
      System.out.print("Please enter your name: ");
      name = sc.nextLine();
      
      //output
      System.out.println("Your name is " + name);
   }
}