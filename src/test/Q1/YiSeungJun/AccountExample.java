package test.q1.YiSeungJun;

public class AccountExample {

	public static void main(String[] args) {
		Account a = new Account();

		a.setBalance(-100);
		System.out.println(a.getBalance());
		a.setBalance(777777);
		System.out.println(a.getBalance());
		a.setBalance(1000500);
		System.out.println(a.getBalance());
	}

}