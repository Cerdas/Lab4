import java.util.Random;

public class CardDriver {

	public static void main(String[] args) {
		
		Card[] list = new Card[5];
		for(int i = 0; i < 5; i++) {
			Card myCard = new Card();
			list[i] = myCard;
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.print(list[i]);
			System.out.println();
		}

	}

}
