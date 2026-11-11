import java.util.Scanner;

public class EggsAppWithScanner
{
   public static void main(String[] args)
   {
      //declare variables
      int numEggs, numBoxes, numLeftOver;

      //declare and create objects
      Scanner sc = new Scanner(System.in);

      //input
      System.out.print("Please enter the number of eggs: ");
      numEggs = sc.nextInt();

      //process
      numBoxes = numEggs / 12;
      numLeftOver = numEggs % 12;

      //output
      System.out.println("You have collected the number of eggs is " + numEggs + ", which fills " + numBoxes + " box(es) with " + numLeftOver + " egg(s) leftover!");
   }
}