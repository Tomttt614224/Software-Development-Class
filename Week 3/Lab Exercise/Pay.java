/* 
    Pay.java
*/

public class Pay{

    //Data members
    private double numOfBasicHours, numOfOvertimeHours, basicPayRate, basicPay, overtimePay, totalPay;

    //Constructor
    public Pay(){
        numOfBasicHours = 0;
        numOfOvertimeHours = 0;
	    basicPayRate = 0;
	    basicPay = 0;
	    overtimePay = 0;
	    totalPay = 0;
    }

    //Set Method(s)
    public void setbasicPayRate(double basicPayRate){
        this.basicPayRate = basicPayRate;
    }
    public void setnumOfBasicHours(double numOfBasicHours){
        this.numOfBasicHours = numOfBasicHours;
    }
    public void setnumOfOvertimeHours(double numOfOvertimeHours){
        this.numOfOvertimeHours = numOfOvertimeHours;
    }

    //Compute Method
    public void compute(){
        basicPay = numOfBasicHours * basicPayRate;
        overtimePay = numOfOvertimeHours * (basicPayRate * 1.5);
        totalPay = basicPay + overtimePay;
    }

    //Get Method(s)
    public double getbasicPay(){
        return basicPay;
    }
    public double getovertimePay(){
        return overtimePay;
    }
    public double getTotalPay(){
        return totalPay;
    }
}
