import java.util.Random;

public class Card {
	
	// Class properties will go here for value and suit
	int value = 0;
	int suit = 0;
	
	public Card() {
		Random num = new Random();
		value = num.nextInt(13) + 1;
		suit = num.nextInt(4) + 1;
	}
	
	public String toString() {
		return value() + " of " + suit();
	}
	
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

