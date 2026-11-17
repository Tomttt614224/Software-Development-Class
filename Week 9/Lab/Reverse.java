
import java.util.Scanner;

public class Reverse{

    public static void main(String args[]){
        String message;
       
        Scanner cs = new Scanner(System.in);
        message = cs.nextLine();

        int length = message.length();
        for (int i = length-1; i >= 0; i--) {
            System.out.println(message.charAt(i));
        }
    System.out.println();
    }
}



