package test.q1.JinWooRam;
public class AccountExample {

	public static void main(String[] args) {
		Account ac=new Account();//Account클래스 객체 생성
		
		ac.setBalance(-100);
		System.out.println(ac.getBalance());
		ac.setBalance(999999);
		System.out.println(ac.getBalance());
		ac.setBalance(1000001);
		System.out.println(ac.getBalance());
		
		//Account클래스의 setter함수호출
		//Account클래스의 getter함수호출하여 잔고확인
	}
}
