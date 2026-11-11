/* 
    Temperature.java
*/

public class Temperature{

    //Data members
    private double tempCelsius, tempFahrenheit;

    //Constructor
    public Temperature(){
        tempCelsius = 0;
        tempFahrenheit = 0;
    }

    //Set Method(s)
    public void setTempCelsius(double tempCelsius){
        this.tempCelsius = tempCelsius;
    }

    //Compute Method
    public void compute(){
        tempFahrenheit = (tempCelsius * 9/5) + 32;
    }

    //Get Method(s)
    public double getTempFahrenheit(){
        return tempFahrenheit;
    }
}
