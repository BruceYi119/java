package test.q1.LeeJeongSam;

public class Account {

	private int balance=0;
	private static final int MIN_BALANCE=0;
	private static final int MAX_BALANCE=1000000;
	
	public int getBalance() {
		//comment: 불필요한 공백은 제거하는게 좋아요
		return balance;
	}
	
	public void setBalance(int balance) {

		if(balance<MIN_BALANCE||balance>MAX_BALANCE) {
			return;
		}else {		
			this.balance=balance;
		}
	}
	
}
