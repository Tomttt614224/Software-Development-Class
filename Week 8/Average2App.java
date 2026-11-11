// Week 7 Lab


import javax.swing.JOptionPane;

public class Average2App{
    public static void main (String[] args){
        // Declare variables
        int [] numbers = new int[5];
        double average;
        average = 0.0;
        // Added for max
        int max;
        // Added for min
        int min;

        // Declare and create objects
        Average2 myAverage = new Average2();
        // Added for max
        AvgMax myMax = new AvgMax();
        // Added for min
        AvgMaxMin myMin = new AvgMaxMin();

        // Input
        for(int i = 0; i < 5; i++){
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number for " + (i+1)));
        }

        // Process
        myAverage.setNumbers(numbers);
        myAverage.compute();
        average = myAverage.getAverage();
        // Added for max
        myMax.setNumbers(numbers);
        myMax.compute();
        max = myMax.getMax();
        // Added for min
        myMin.setNumbers(numbers);
        myMin.compute();
        min = myMin.getMin();

        JOptionPane.showMessageDialog(null, "The average is " + average + " and the maximum is " + max + " and the minimum is " + min);

    }
}
