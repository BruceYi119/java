package test.q1.Parkjunwoo;

public class AccountExample {

	public static void main(String[] args) {
		Account a = new Account();
		a.setBalance(-100);
		System.out.println(a.getBalance());
		a.setBalance(1000000000);
		System.out.println(a.getBalance());
		a.setBalance(55555);
		System.out.println(a.getBalance());

	}

}
