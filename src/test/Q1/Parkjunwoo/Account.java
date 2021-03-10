package test.q1.Parkjunwoo;
//Account클래스는
//은행 계좌 객체인 Account객체는 잔고(balance)필드를 가지고 있다
//잔고(balance)필드는 음수값이 될 수 없고, 최대 100만원까지만 저장할 수 있다.
//외부에서 balance필드를 마음대로 변경하지 못하도록 하고,
//0<= balance <=1000000 범위의 값만 가질 수 있도록 
//Account클래스를 작성하시오
//1. setter & getter 이용
//2. 0과 1000000은 MIN_BALANCE와 MAX_BALANCE상수를 선언해서 이용
//3. setter의 매개값이 음수이거나 백만원을 초과하면 현재 balance값을 유지
//
//Account클래스와 실행클래스인 AccountExample클래스생성하시오.
public class Account {
	final private int MIN_BALANCE = 0;
	final private int MAX_BALANCE = 1000000;
	int balance = 0;

	public Account() {};

	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance; //comment: 불필요한 공백은 제거하는게 좋아요
			
		}
	}
	public int getBalance() {
		return this.balance;
	}

}



