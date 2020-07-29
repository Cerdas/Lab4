
public class Box2 {

	// Creating size variable in Box class
	// and initializing at 0
	int size = 0;

	// Creating method to print star Box
	public void printBox() {

		// Creating for loop to start box
		// Creating a column for loop in a row for loop
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {

				// Placing a star on the beginning and end
				// of the box using size and spaces in between
				if ((row == 1) || (row == size) || (col == 1) || (col == size)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			// Required to make the box by
			// moving down the row
			System.out.println();
		}

	}

	// Overload printBox
	public void printBox(char c) {

		// Creating box using char to make the shape
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				if ((row == 1) || (row == size) || (col == 1) || (col == size)) {
					System.out.print(c);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		// Creating object
		Box2 starbox = new Box2();

		// Creating char variable
		char a = 'a';

		// Changing size by using dot operator
		starbox.size = 5;

		// Printing star box by using dot operator
		starbox.printBox();

		// Printing star box with char variable
		starbox.printBox(a);

	}

}
