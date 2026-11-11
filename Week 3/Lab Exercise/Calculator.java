/* 
    Calculator.java
*/

public class Calculator{

    //Data members
    private double num1, num2, sum, difference;

    //Constructor
    public Calculator(){
        num1 = 0;
        num2 = 0;
        sum = 0;
        difference = 0;
    }

    //Set Method(s)
    public void setnum1(double num1){
        this.num1 = num1;
    }
    public void setnum2(double num2){
        this.num2 = num2;
    }
    public void setsum(double sum){
        this.sum = sum;
    }
    public void setdifference(double difference){
        this.difference = difference;
    }

    //Compute Method
    public void compute(){
        sum = num1 + num2;
        difference = num1 - num2;
    }

    //Get Method(s)
    public double getsum(){
        return sum;
    }
    public double getdifference(){
        return difference;
    }
}
