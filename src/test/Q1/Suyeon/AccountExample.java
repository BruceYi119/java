package test.q1.Suyeon;

public class AccountExample {

	public static void main(String[] args) {
		Account ac = new Account();
		ac.setBalance(100000);
		System.out.println(ac.getBalance());
		ac.setBalance(-333);
		System.out.println(ac.getBalance());
		
	}

}
