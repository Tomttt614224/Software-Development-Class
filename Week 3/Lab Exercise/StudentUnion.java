/* 
    StudentUnion.java
*/

public class StudentUnion{

    //Data members
    private int numCap, numShirts, numHoodies;
    private double totalCost;

    //Constructor
    public StudentUnion(){
        numCap = 0;
        numShirts = 0;
	    numHoodies = 0;
	    totalCost = 0;
    }

    //Set Method(s)
    public void setnumCap(int numCap){
        this.numCap = numCap;
    }
    public void setnumShirts(int numShirts){
        this.numShirts = numShirts;
    }
    public void setnumHoodies(int numHoodies){
        this.numHoodies = numHoodies;
    }

    //Compute Method
    public void compute(){
        totalCost = (numCap * 5) + (numShirts * 10) + (numHoodies *20);
    }

    //Get Method(s)
    public double gettotalCost(){
        return totalCost;
    }
}
