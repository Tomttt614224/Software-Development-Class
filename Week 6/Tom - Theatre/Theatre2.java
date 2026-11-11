/* 
    Theatre2.java
*/

public class Theatre2{

    //Data members
    private
    String days;
    int age, cost;
     

    //Constructor
    public Theatre2(){
        age = 0;
        cost= 0;
    }

    //Set Method(s)
    public void setDays(String days){
        this.days = days;
    }
    public void setAge(int age){
        this.age = age;
    }



    //Compute Method
    public void compute(){
        if(days.equals("Monday") || days.equals("Tuesday") || days.equals("Wednesday") || days.equals("Thursday")){
            if(age < 10 || age > 65){
            cost = 0;
            }
            else{
            cost = 10;
            }
        }
        else{
            if(age < 10){
            cost = 20;
            }
            else if (age > 65){
            cost = 10;
            }
            else{
            cost = 30;
        }
        }
    }
    //Get Method(s)
    public int getCost(){
        return cost;
    }
}
