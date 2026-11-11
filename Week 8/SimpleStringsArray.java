//week 7
//SimpleStringArray

import javax.swing.JOptionPane;

public class SimpleStringsArray{
    public static void main (String[] args){

        //declare, create and populate an array of strings
        String [] counties = {"Dublin", "Cork", "Wicklow", "Galway"};

        //print out all the counties
        for(int i = 0; i < counties.length; i++){
            System.out.println("County " + (i+1) + ": " + counties[i]);
        }
    }
}
        