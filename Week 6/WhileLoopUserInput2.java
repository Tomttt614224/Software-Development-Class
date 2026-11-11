
import javax.swing.JOptionPane;

public class WhileLoopUserInput2{
    public static void main (String[] args){
        String answer = "Yes";
        int num = -1, sum = 0;

        while (answer.equalsIgnoreCase("Yes")) {
            num = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter a number "));
            sum = sum + num;
            answer = JOptionPane.showInputDialog(null,"Do you want to enter another number, Yes or No?");
        }
        JOptionPane.showMessageDialog(null,"Your answer is " + sum);
    


    }
}