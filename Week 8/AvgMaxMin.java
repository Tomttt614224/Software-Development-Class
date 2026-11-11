
public class AvgMaxMin{

	// Data Members
	private int[] numbers;
	private int min;


	// Constructor
	public AvgMaxMin(){
		numbers = new int[0];
	}

	// Setter
	public void setNumbers(int[] numbers){
		this.numbers = numbers;
    }


	// Compute Method
	public void compute(){
        	min = numbers[0];
		for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < min){
               min = numbers[i];
            }
        }
    }

    // Calculate the min
    public int getMin(){
		return min;
	}
}