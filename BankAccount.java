
public class BankAccount {
	
	int balance = 0;	// ¿¹±Ý ÀÜ¾×
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
	public int checkMyBalance() {
		System.out.println("ÀÜ¾× : " + balance);
		return balance;
	}
}
