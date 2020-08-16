/*
 * This is the card class. Each card has a specific value and a specific suite.
 * 52 instances of this class are created when initializing a deck object.
 * 
 * */
public class Card {
	private int value;
	private String suite;
	Card(){
		this.value = -1;
		this.suite = "null";
	}
	Card(int value, String suite){
		this.value = value;
		this.suite = suite;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getSuite() {
		return suite;
	}
	public void setSuite(String suite) {
		this.suite = suite;
	}
	public String toString() {
		return ("The suite is " + this.getSuite() + "\nThe value is " + this.getValue() );
	}
}
