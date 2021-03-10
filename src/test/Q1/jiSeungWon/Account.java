package test.q1.jiSeungWon;

public class Account {
	//field
	private int balance = 0;
	private final int MIN_BALANCE = 0;
	private final int MAX_BALANCE = 1000000;
	
	//constructor
	
	//method
	public void setBalance(int bal) {
		if (bal>=MIN_BALANCE && bal<=MAX_BALANCE) {
			this.balance = bal;
		} 
		//setter함수에서는 무결성검사를 하여  결함을 제거하도록 합니다
		//이때 결함이 있으면 다른 값으로 대체하거나  함수를 종료하게끔 할 수 있어요
		//여기에서는 if조건을 충족하지않는 경우에는 아무일도 하지 않는 다는....
		//고로 무엇인가를 할 수 있게해주는 것이 좋겠지요?
	}
	
	public void getBalance() {
		System.out.println(this.balance);
		
	}
}
