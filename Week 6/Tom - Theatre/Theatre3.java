/* 
    Theatre3.java
*/

public class Theatre3{

    //Data members
    private
    String days;
    int cost;
     

    //Constructor
    public Theatre3(){
        cost= 0;
    }

    //Set Method(s)
    public void setDays(String days){
        this.days = days;
    }


    //Compute Method
    public void compute(){
        switch(days){
		case "Monday","Tuesday":
			cost = 5;
			break;
		case "Wednesday","Thursday":
			cost = 10;
			break;
		case "Saturday","Sunday":
			cost = 30;
			break;
		default:
			cost = 20;
        }
	}
        
    //Get Method(s)
    public int getCost(){
        return cost;
    }
}

