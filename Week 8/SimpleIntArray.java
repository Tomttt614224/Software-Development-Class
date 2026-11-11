//week 7
//SimpleIntArray


import javax.swing.JOptionPane;
//import java.util.Scanner;

public class SimpleIntArray{
    public static void main (String[] args){
        //option 1 - declare, create and populate array of size 4
        //int [] ages = new int[4];
        //ages[0] = 3;
        //ages[1] = 7;
        //ages[2] = 4;
        //ages[3] = 2;

        //option 2 - declare, create and populate array of size 4 in one line
        //int [] ages = {3, 7, 4, 2};

        //option 3 - declare, create array and ask the user to input the values
        int [] ages = new int[4];
        for(int i = 0; i < 4; i++){
            ages[i] = Integer.parseInt(JOptionPane.showInputDialog("Please enter the age for No." + (i+1) + " of the children"));
        }

        //print out the value in the second position
        System.out.println("The second age is " + ages[1]);

        //update the second age
        ages[1] = 5;

        //print out the value in the second position again    
        System.out.println("The second age was updated to " + ages[1]);

        //print out length of the array
        System.out.println("The length of the array is " + ages.length);

        //print out all the ages
        for(int i = 0; i < ages.length; i++){
            System.out.println(ages[i]);
        }

    }    
    
}
