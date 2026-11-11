//StringArray

public class StringArray{

	// Data Members
	private String[] sentences;
	private String firstWord;
	private String secondWord;
	private String thirdWord;
	private String fourthWord;
	private String fifthWord;


	// Constructor
	public StringArray(){
		sentences = new String[0];
	}

	// Setter
	public void setSentence(String[] sentences){
		this.sentences = sentences;
    }


	// Compute Method
	public void compute(){
        for(int i=0; i<sentences.length(); i++) {
        }
    }

    // Calculate the max
    public String getFirstWord(){
		return firstWord;
	}
    public String getSecondWord(){
        return secondWord;


}