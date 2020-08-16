
public class Spade extends Suite{
	private String type;
	private int num;
	public Card[] cards = new Card[13];
	Spade(){
		super("Spade");
		this.type = "Spade";
		for	(int i = 0; i < 13; i++) {
			cards[i] = new Card(0, "Spade");
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
