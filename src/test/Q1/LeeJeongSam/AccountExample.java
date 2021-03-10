package test.q1.LeeJeongSam;

public class AccountExample {

	public static void main(String[] args) {
		
		Account a=new Account();
		
		a.setBalance(1000);
		System.out.println("현재 잔고 : "+a.getBalance());
		a.setBalance(-100);
		System.out.println("현재 잔고 : "+a.getBalance());
		a.setBalance(2000000);
		System.out.println("현재 잔고 : "+a.getBalance());
		
	}

}
