//WhileLoopNumbers


import javax.swing.JOptionPane;

public class WhileLoopUserInput{
    public static void main (String[] args){
        
        //declare variables
        int num = -1, sum = 0;

        while (num!=0) {
            num = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter a number or 0 to EXIT"));
            sum = sum + num;
        }
        JOptionPane.showMessageDialog(null,"The sum of the numbers is " + sum);
    

    }

}
