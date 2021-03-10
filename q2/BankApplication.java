package test.q2.YiSeungJun;

import java.util.Scanner;


//comment: 여기에서 BankApplication클래스는 상속관계보다는  Account클래스를 사용하는 실행클래스로서 클래스를 선언해주시는게 좋습니다
public class BankApplication extends Account {

	public Scanner scan = new Scanner(System.in);
	public int menu;
	public boolean stat = false;

	public BankApplication() {
		super();
	}

	public static void main(String[] args) {
		//comment : main함수가 진입함수로서  생성자와  시작함수를 호출해주는 형태로
		//코드를 구현하셨군요. 아주 잘 하셨어요!!!! ^-^ 
		BankApplication app = new BankApplication();

		while (app.start());
	}

	private boolean start() {
		this.stat = true;
		System.out.printf("----------------------------------------------------------\n");
		System.out.printf("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료\n");
		System.out.printf("----------------------------------------------------------\n");
		System.out.printf("선택>");

		if (!this.checkInt()) {
			this.start();
			return this.stat;
		}

		this.menu = scan.nextInt();
		this.setMenu();

		return this.stat;
	}

	private void setMenu() {
		switch(this.menu) {
			case 1 :
				this.setAccount();
				break;
			case 2 :
				this.getList();
				break;
			case 3 :
				this.deposit();
				break;
			case 4 :
				this.withdraw();
				break;
			case 5 :
				this.end();
				break;
		};
	}

	private void end() {
		this.stat = false;
		this.scan.close();
		System.out.println("프로그램 종료");
	}

	private void setAccount() {
		System.out.printf("------------\n");
		System.out.printf("계좌생성\n");
		System.out.printf("------------\n");
		System.out.printf("계좌번호 : ");
		String a = this.scan.next();
		System.out.printf("계좌주 : ");
		String b = this.scan.next();
		System.out.printf("초기입금금액 : ");

		if (!this.checkInt()) {
			this.start();			
			return;
		}

		Account acc =  this.searchAccount(a);
		if (acc != null) {
			System.out.printf("결과: 등록된 계좌입니다.\n");
			this.start();
			return;
		}

		int c = this.scan.nextInt();

		//무결성 검사! 좋아요!! ^-^
		if (c <= 0) {
			System.out.printf("결과: 0원보다 큰 금액을 입금하세요.\n");
		} else {
			this.accList.add(new Account(a, b, c));
			System.out.printf("결과: 계좌가 생성되었습니다.\n");
		}

		this.start();
		
	};

	private void getList() {
		int i = 0;

		System.out.printf("------------\n");
		System.out.printf("계좌목록\n");
		System.out.printf("------------\n");

		if (this.accList.size() > 0) {
			for (Account a : this.accList)
				System.out.printf("%s       %s       %d\n",a.getACCNO(), a.getACNAME(), a.getBalance());
		} else {
			System.out.printf("등록된 계좌가 없습니다\n");
		}

		i++;
		this.start();
	}

	private void deposit() {
		System.out.printf("------------\n");
		System.out.printf("예금\n");
		System.out.printf("------------\n");
		System.out.printf("계좌번호 : ");
		String a = this.scan.next();
		System.out.printf("예금액 : ");

		if (!this.checkInt()) {
			this.start();			
			return;
		}

		int b = this.scan.nextInt();

		if (b <= 0) {
			System.out.printf("결과: 0원보다 큰 금액을 입금하세요.\n");
		} else {
			Account acc =  this.searchAccount(a);
			if (acc == null) {
				System.out.printf("결과 : 해당 계좌정보가 없습니다.\n");
				this.start();
				return;
			}

			acc.setBalance(acc.getBalance() + b);
			System.out.printf("결과 : 예금이 성공되었습니다.\n");
		}

		this.start();
	}

	//메서드 선언시 해당 메서드의 기능을 주석으로 작성해주시길 권해요~
	private void withdraw() {
		System.out.printf("------------\n");
		System.out.printf("출금\n");
		System.out.printf("------------\n");
		System.out.printf("계좌번호 : ");
		String a = this.scan.next();
		System.out.printf("출금액 : ");

		if (!this.checkInt()) {
			this.start();			
			return;
		}

		int b = this.scan.nextInt();

		//입력값의 무결성 검사! 좋아요!! ^-^
		if (b <= 0) {
			System.out.printf("결과: 0원보다 큰 금액을 입금하세요.\n");
		} else {
			Account acc =  this.searchAccount(a);
			if (acc == null) {
				System.out.printf("결과 : 해당 계좌정보가 없습니다.\n");
				this.start();
				return;
			}
			
			int balance = acc.getBalance();
			if (balance < b) {
				System.out.printf("결과 : 잔액이 부족합니다.\n");
			} else {
				acc.setBalance(balance - b);
				System.out.printf("결과 : 출금이 성공되었습니다.\n");			
			}			
		}

		this.start();
	}

	//comment : 입력값 무결성검사기능을  작성하셨군요. 아주 좋아요!! ^-^
	private boolean checkInt() {
		boolean result = true;

		if (!this.scan.hasNextInt()) {
			result = false;
			System.out.println("숫자를 입력하세요");
			this.scan.next();
		}

		return result;
	}

}