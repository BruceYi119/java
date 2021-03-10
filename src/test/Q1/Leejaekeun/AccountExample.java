package test.q1.Leejaekeun;

public class AccountExample {
	public static void main(String[] args) {
		//Account클래스 객체 생성
		Account abc = new Account();
		
		//Account클래스의 setter함수호출
		abc.setBalance(-100);
		
		//Account클래스의 getter함수호출하여 잔고확인
		System.out.println("잔고는"+abc.getBalance()+"원");
		
		
		
		

	}
}

