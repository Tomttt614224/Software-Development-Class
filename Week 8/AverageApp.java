// Week 7 Lab


import javax.swing.JOptionPane;

public class AverageApp{
    public static void main (String[] args){
        int [] numbers = new int[5];
        double average = 0.0;
        
        for(int i = 0; i < 5; i++){
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number for " + (i+1)));
        }

        // Calculate the sum
        int sum = 0;
            for(int i = 0; i < numbers.length; i++){
                sum += numbers[i];
                }
            

        // Calculate the average
        average = (double)sum / numbers.length;
        
        JOptionPane.showMessageDialog(null, "The average is " + average);


    }
}
