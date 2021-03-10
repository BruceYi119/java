package test.q1.Suyeon;

public class Account {
	private int balance;
	
	//comment: 접근제어자 속성 타입 변수명 순으로 일반적으로 작성합니다
	//예)private final int MIN_BALANCE = 0;
	final private int MIN_BALANCE = 0;
	
	final private int MAX_BALANCE = 1000000;
	
	public void setBalance(int balance) {
		if(balance>=MIN_BALANCE && balance<=MAX_BALANCE) {
			this.balance = balance;
		} else {
			balance = 0;
		}
	
	}
	public int getBalance(){
		return balance;
	}
		
}
