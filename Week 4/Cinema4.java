/* 
    Cinema4lculator.java
*/

public class Cinema4{

    //Data members
    private
     int age;
     double cost;

    //Constructor
    public Cinema4(){
        age = 0;
        cost= 0;
    }

    //Set Method(s)
    public void setAge(int age){
        this.age = age;
    }

    //Compute Method
    public void compute(){
        if(age > 65 || age < 5){
            cost = 0.00;
        }
        else if(age >= 15){
            cost = 10.00;
        }
        else if(age >= 5){
            cost = 5.00;
        }   
    }

    //Get Method(s)
    public double getCost(){
        return cost;
    }
}
