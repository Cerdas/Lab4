import java.util.Random;

public class CardDriver {

	public static void main(String[] args) {
		
		// Creating object
		Card[] list = new Card[5];
		
		// Using for loop to put cards in array
		for(int i = 0; i < 5; i++) {
			Card myCard = new Card();
			list[i] = myCard;
		}
		
		// Printing out cards
		for(int i = 0; i < 5; i++) {
			System.out.print(list[i]);
			System.out.println();
		}

	}

}
