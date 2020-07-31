
public class Numbers {

	// Method for finding the next largest number
	public static int nextLargest(int[] a, int c) {

		// Creating variable for place holder
		int next = 0;

		// Creating for loop to find next largest number
		for (int i = 0; i < a.length; i++) {

			// If statement to find the next biggest number
			if (c < a[i] && ((a[i] < next || next == 0))) {
				next = a[i];
			}

			if (next == 0) {
				next = Integer.MAX_VALUE;
			}

		}
		return next;
	}

	public static void main(String[] args) {
		
		// Creating array
		int[] num = { 78, 22, 56, 99, 12, 14, 17, 15, 1, 144, 37, 23, 47, 88, 3, 19 };

		// printing out next largest number using nextLargest method
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + ": " + nextLargest(num, num[i]));
			System.out.println();
		}
	}

}
