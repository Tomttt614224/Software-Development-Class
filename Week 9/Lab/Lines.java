

import java.util.Scanner;

public class Lines{

    public static void main(String args[]){
        String message;
       
        Scanner cs = new Scanner(System.in);
        message = cs.nextLine();

        int length = message.length();
        for (int i = 0; i < length; i++) {
            System.out.println(message.charAt(i));
        }
    System.out.println();
    }
}



