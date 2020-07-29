
public class Account {
	
	// Creating static variable
	static int numAccounts;
	
	// Constructor, adds 1, each time a new account is made
	public Account() {
		numAccounts++; 
	}
	
	// returns the variable numAccounts when method is called
	public static int getNumAccounts() {
		return numAccounts;
	}

	public static void main(String[] args) {

		// Creating 3 new accounts
		new Account();
		new Account();
		new Account();
		
		// Prints out number of accounts created
		System.out.print(getNumAccounts());

	}

}
