package ch08;

public class Account {
	private long balance;  //잔고
	
	//생성자
	public Account() {}
	
	//잔고조회
	public long getBalance() {
		return balance;
	}
	
	//입금
	public void deposit(int money) {
		balance += money;
	}

	
	//출금
	//throws BalanceInsufficientException => 사용자정의 예외 떠넘기기
	public void withDraw(int money) throws BalanceInsufficientException {
		if(balance<money) {
			//사용자 정의  예외 발생
			throw new BalanceInsufficientException("잔고부족 : "+(money-balance)+" 모자랍니다"); 
		}
		balance -= money;
	}
	
}












