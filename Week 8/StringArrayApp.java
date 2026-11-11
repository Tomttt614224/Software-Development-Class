// Week 7 Lab


import javax.swing.JOptionPane;

public class StringArrayApp{
    public static void main (String[] args){
        // Declare variables
        String [] sentences = new String[5];

        // Declare and create objects
        StringArray myAverage = new StringArray();

        // Input
        for(int i = 0; i < 5; i++){
            sentences[i] = JOptionPane.showInputDialog("Please enter the sentence with " + (i+1) + "words");
        }

        // Process
        myAverage.setSentences(sentences);
        myAverage.compute();
        first = myAverage.getFirstWord();
        second = myAverage.getSecondWord();
        third = myAverage.getThirdWord();
        fourth = myAverage.getFourthWord();
        fifth = myAverage.getFifthWord();

        JOptionPane.showMessageDialog(null, "The word no.1 is " + first + " and the word no.2 is " + second + " and the word no.3 is " + third + " and the word no.4 is " + fourth + " and the word no.5 is " + fifth);


    }
}
