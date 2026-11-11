import javax.swing.JOptionPane;

public class EggsAppV1 {
    public static void main(String[] args) 
    {
        String inputNnmberOfEggs;
        inputNnmberOfEggs = JOptionPane.showInputDialog(null, "Enter number of eggs:");

        int numberOfEggs;
        numberOfEggs = Integer.parseInt(inputNnmberOfEggs);
        
        int boxes = numberOfEggs / 12, leftoverEggs = numberOfEggs % 12;

        JOptionPane.showMessageDialog(null, "You have collected the number of eggs is " + numberOfEggs + ", which fills " + boxes + " box(es) with " + leftoverEggs + " egg(s) leftover!");


    }
}
