
public class Grades2DArray{
    public static void main(String[] args){
        int total;
        double average = 0.0;
        int[][] grades = {{70, 80, 90}, {65, 75, 85}, {90, 85, 90}, {60, 70, 80}};
        
        for(int i=0; i<grades.length; i++){
            total = 0;
            for(int j=0; j<grades[i].length; j++){
                total += grades[i][j];
            }
            average = (double) total / grades[i].length;
            System.out.println("Total is " + total);
            System.out.println("Average is " + average);
        }
    }
}
