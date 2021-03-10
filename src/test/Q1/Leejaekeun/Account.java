package test.q1.Leejaekeun;

public class Account {
	private int balance;
	private int MIN_BALANCE = 0;
	private int MAX_BALANCE = 1000000;
	
	public void setBalance(int balance) {
		if(balance <= MIN_BALANCE) {
			System.out.println(this.balance);
		}else if(balance>=MAX_BALANCE) {
			System.out.println(this.balance);
		}else {
			//comment : 위의 모든 조건을 만족하지 않을 경우  else로 들어오는데
			//위의 조건을 하나로 만들 수 있지 않을까요?
			//if문을 만들지, else if문을 만들지, if안에 && 또는 ||을 이용해서 조건을 명시할 것인지에 따라 코드는 다양하게 나옵니다
			this.balance = balance;
			System.out.println(this.balance);
		}
	}
	public int getBalance() {
		return balance;
	}
}
