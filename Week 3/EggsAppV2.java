public class EggsAppV2{

//Data members
private int numEggs, numBoxes, numLeftOver;

//Constructor§
public EggsAppV2(){
    numEggs = 0;
    numBoxes = 0;
    numLeftOver = 0;
    }

//Set Method(s)
public void setNumEggs(int numEggs){
    this.numEggs = numEggs;
    }

//Compute Method
public void compute(){
    numBoxes = numEggs / 12; 
    numLeftOver = numEggs % 12;   
    }

//Get Method(s)
public int getNumBoxes(){
    return numBoxes;
    }

public int getNumLeftOver(){
    return numLeftOver;
    }

}