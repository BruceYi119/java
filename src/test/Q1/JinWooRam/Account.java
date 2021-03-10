package test.q1.JinWooRam;

public class Account {
	
	//filed [접근제어자][속성] 데이터타입 변수명[=초기값]
	private final int MIN_BALANCE = 0;
	private final int MAX_BALANCE = 1000000;
	private int balance;
	
	//[접근제어자][속성] 리턴함수 메소드명 (매개변수리스트);
	//비교를 할때는 보통  기준이되는 값을 비교연산자의 왼편에  비교대상이 되는 것을 오른편에 사용합니다
	void setBalance(int balance) {
		if(MAX_BALANCE>=balance&&MIN_BALANCE<=balance) {
		this.balance=balance;
		}
	}

	public int getBalance() {	
	return this.balance; //들여쓰기를 해주는 습관을 가지세요
	}

}
