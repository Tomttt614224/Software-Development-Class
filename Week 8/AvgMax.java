
public class AvgMax{

	// Data Members
	private int[] numbers;
	private int max;
	

	// Constructor
	public AvgMax(){
		numbers = new int[0];
	}

	// Setter
	public void setNumbers(int[] numbers){
		this.numbers = numbers;
    }


	// Compute Method
	public void compute(){
        	max = numbers[0];
		for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
               max = numbers[i];
            }
        }
    }

    // Calculate the max
    public int getMax(){
		return max;
	}
}