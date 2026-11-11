public class Average2{

	// Data Members
	private int[] numbers;
	private double average;
	

	// Constructor
	public Average2(){
		numbers = new int[0];
		average = 0.0;
	}

	// Setter
	public void setNumbers(int[] numbers){
		this.numbers = numbers;
	}
	public void setaverage(double average){
        this.average = average;
    }


	// Compute Method
	public void compute(){
		int sum = 0;
		for(int i = 0; i < numbers.length; i++){
                sum += numbers[i];
            }

    // Calculate the average
    average = (double)sum / numbers.length;
		}
	
	public double getAverage(){
		return average;
	}
}