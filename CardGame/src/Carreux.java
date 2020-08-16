/*
 * This is the carreux or diamond suite class. Each suite has 13 different valued cards, and they're initialised.
 * 
 * 
 * */
public class Carreux extends Suite{
	private String type;
	public int num;
	public Card[] cards = new Card[13];
	Carreux(){
		super("Carreux");
		this.type = "Carreux";
		for	(int i = 0; i < 13; i++) {
			cards[i] = new Card(0, "Carreux");
		}
		this.num = 13;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String toString() {
		String all ="";
		for	(int i = 0; i < 13; i++) {
			all += cards[i].toString() + "\n" + "There are " + (getNum()-1) + "cards left \n";
			setNum(getNum()-1);
		}
		return all;
	}
}
/*if(choice < cc) {
	Carreux.setNum(Carreux.getNum() - 1);;				//each suite has 13 cards, i decrement the amount of cards in that suite if the it's chosen
	cards[i].setSuite("Carreux");						//sets the suite in the deck
	randint=rand.nextInt(13);							//generates a random integer from 0 to 13
	if(Carreux.cards[randint].getValue() == 1) {		//i flag the card as "chosen" in the suite class if its value is "1", so this if checks
		while(Carreux.cards[randint].getValue() == 1) {	//if the random number has been flagged or not in the suite class, if it has, then it keeps
			randint=rand.nextInt(13);					//generating random numbers till it finds a card which is not flagged ie not been chosen yet
		}
	}
	Carreux.cards[randint].setValue(1);					//flags the card as chosen in the suite class
	cards[i].setValue(randint);							//sets the value of the card in the deck as the random int thats chosen after its been found
}	*/
