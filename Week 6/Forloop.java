//forloop 


public class Forloop{
    public static void main (String[] args){

        //print numbers between 1 and 10
        for(int i = 0; i <= 10; i++){ //vnote i++ is shortend for i=i+1
           System.out.println(i);
        }
        System.out.println("*****");
        //print numbers from 10 to 1 
        for (int i = 10; i >= 1; i--){ // note i-- is shortend for i=i-1
            System.out.println(i);
        }
        System.out.println("*****");
        //print even numbers between 1 and 20
        for (int i = 2; i <= 20; i=i+2){ // or could say i+=2 instead of i=i+2
            System.out.println(i);
        }
        System.out.println("*****");
        //print the numbers 100, 90, 80, 70, 60
        for (int i = 100; i >=60; i=i-10){ // or could say i-=10 instead of i=i-10
            System.out.println(i);
        }
        System.out.println("*****");
        //calculate the sum of numbers between 1 and 10 
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            sum = sum + i;
            System.out.println("The running total is " + sum);
        }
            System.out.println("The overall total is " + sum);
        
        System.out.println("*****");

        {int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }}

    }

}
