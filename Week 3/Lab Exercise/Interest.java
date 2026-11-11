/* 
    Interest.java
*/

public class Interest{
    
    //Data members
    private int numMonths;
    private double numMoney, numRepaid, interest;
    private final double RATE = 0.03;


    //Constructor
    public Interest(){
        numMonths = 0;
        numMoney = 0.00;
        numRepaid = 0.00;
        interest = 0.00;
    }

    //Set Method(s)
    public void setnumMonths(int numMonths){
        this.numMonths = numMonths;
    }
    public void setnumMoney(double numMoney){
        this.numMoney = numMoney;
    }

    //Compute Method
    public void compute(){
        interest = numMoney * (numMonths * RATE); 
        numRepaid = numMoney + interest; 
    }

    //Get Method(s)
    public double getnumRepaid(){
        return numRepaid;
    }
}
