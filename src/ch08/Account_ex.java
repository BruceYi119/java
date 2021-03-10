package ch08;

//Accout클래스를 사용하는 실행클래스
public class Account_ex {

	public static void main(String[] args) {
		Account account = new Account();
		
		//입금하기
		account.deposit(1000000);
		
		//잔고확인
		System.out.println("예금 후 잔고 : "+account.getBalance());
		
		//출금하기
		try {
			account.withDraw(300000000);
		} catch (BalanceInsufficientException e) {
			String msg = e.getMessage();
			System.out.println("예외 메세지는.... "+msg);
			System.out.println();
			e.printStackTrace();
		}
		finally {
			System.out.println("출금 후 잔고 : "+account.getBalance());
		}
		
	}

}





