package test.q1.ChoiHongJun;

public class Account {
	private int balance;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000 ;
	
	
	public int getbalace() {
		return balance;
	}
	public int setbalce(int balance) {
		if(balance < 0 ) {
			balance = MIN_BALANCE;
		}                  
		else if(balance > 1000000) { 
			//comment : balance > 1000000이라는 조건을 충족하면
			//balance가  MAX_BALANCE로 변경된다는 의미인데
			//함수호출할 때 넣은 값과는 무관하게  MAX_BALANCE인 1000000으로 조정된다는 뜻이 되버리넹
			//예를 들어 setbalce(int balance)가   입금용이라면  내가  1999000을 입금했는데  
			//1000000으로 조정된다는 뜻이 되어버리면   억울하지 않을까??
			balance = MAX_BALANCE;
		}
		return this.balance = balance;
	}
}
