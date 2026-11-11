import javax.swing.JOptionPane;

public class Circle5
{
   public static void main(String[] args)
   {
      String inputDiameter;
      inputDiameter = JOptionPane.showInputDialog(null, "Enter diameter:");
      
      int diameter;
      diameter = Integer.parseInt(inputDiameter);

      JOptionPane.showMessageDialog(null, "Diameter is " + diameter + "!");
      
   }
}