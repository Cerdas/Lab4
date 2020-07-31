import java.util.Random;

public class Card {
	
	// Creating variables
	int value = 0;
	int suit = 0;
	
	// Creating constructor and setting value and suit
	public Card() {
		Random num = new Random();
		this.value = num.nextInt(13) + 1;
		this.suit = num.nextInt(4) + 1;
	}
	
	// Method for returning a string 
	public String toString() {
		return value() + " of " + suit();
	}
	
	// Method for determining suit
	public String suit() {
		if(suit == 1) {
			return "Hearts";
		}else if(suit == 2){
			return "Spades";
		}else if(suit == 3){
			return "Clubs";
		}else {
			return "Diamonds";
		}
	
	}

	// Method for determining value
	public String value() {
		if(value == 1) {
			return "Ace";
		}else if (value == 11){
			return "Jack";
		}else if(value == 12) {
			return "Queen";
		}else if(value == 13) {
			return "King";
		}else {
			return Integer.toString(value);
		}
		
	}



}

