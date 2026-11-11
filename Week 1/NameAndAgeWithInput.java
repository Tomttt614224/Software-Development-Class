import java.util.Scanner;

public class NameAndAgeWithInput
{
   public static void main(String[] args)
   {
      String name;
      int age;

      //declare and create an object
      Scanner sc = new Scanner(System.in);

      //input
      System.out.print("Please enter your name: ");
      name = sc.nextLine();
      
      System.out.print("Please enter your age: ");
      age = sc.nextInt();

      //output
      System.out.println("Your name is " + name + " and your age is " + age);
   }
}