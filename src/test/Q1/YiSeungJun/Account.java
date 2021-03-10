package test.q1.YiSeungJun;

public class Account {
	final private int MIN_BALANCE = 0;
	final private int MAX_BALANCE = 1000000;
	private int balance = 0;

	public Account() {};

	public void setBalance(int balance) {
		if (balance >= this.MIN_BALANCE && balance <= this.MAX_BALANCE)
			this.balance = balance;
	}

	public int getBalance() {	
		return this.balance;
	}
}