package test.q2.ChoiHongJun;


import java.util.Scanner;

//comment: 이 클래스는  실행클래스
public class BankApplication {

	//comment: 계좌를 저장하기위한 배열변수 선언 및 초기화
	static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in); 
	
	public static void main(String[] args) {
	
		boolean run = true;	
		
		while(run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");
			
			int input = scanner.nextInt();
			
			if (input == 1) {
				createAccount();
			} else if (input == 2) {
				accountList();
			} else if (input == 3) {
				deposit();
			} else if (input == 4) {
				withdraw();
			} else if (input == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	//comment: 메서드역할에 대한 주석을 작성해주세요
	//comment: 계좌생성
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println("계좌생성");
		System.out.println("--------------");
		
		System.out.print("계좌번호:\n "); 
		String ano = scanner.next();
		System.out.print("계좌주:\n "); 
		String owner = scanner.next();
		System.out.print("초기입금액:\n "); 
		int balance = scanner.nextInt();
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;}
		}		
	}	
	
	//comment: 계좌목록 조회
	private static void accountList() {
		System.out.println("--------------");
		System.out.println("계좌목록");
		System.out.println("--------------");
		
		//comment: 계좌의 개수 만큼 반복하면서   계좌정보 출력
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				break;//배열에 계좌가 더 이상 존재하지 않으면  반복문을 종료해랴=>계좌목록조회 끝내라
			}
			
			//comment: 계좌번호 tab공간	계좌주 tab공간	계좌잔고
			System.out.println(
			accountArray[i].getAccno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		}
	}
		
	//comment: 입금하기
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("예금");
		System.out.println("--------------");
		
		System.out.print("계좌번호:\n "); 
		String ano = scanner.next();
		
		if (findAccount(ano) == null) {
			System.out.println("입력한 계좌번호를 찾지 못했습니다.");
		} else {
			System.out.print("예금액:\n "); 
			int balance = scanner.nextInt();  ////comment: user가 입력한 입금액이 정수로 balance변수에 저장
			//comment: findAccount(ano).setBalance(findAccount(ano).getBalance() + balance);코드는
			//comment: 메소드명().메소드명().메소드명()~~~ : 메서드체이닝
			//comment: 아래처럼 풀어서 작성할 수 있다
			Account acc=findAccount(ano); //comment: 조회한 계좌찾기
			int balance1 =findAccount(ano).getBalance()+ balance; //comment: 조회한특정계좌의 기존잔고+입금액
			acc.setBalance(balance1);
			
			System.out.println("결과: 예금이 성공되었습니다.");
		}
	}
		
	//comment: 출금하기
	private static void withdraw() {
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");
		
		System.out.print("계좌번호:\n "); 
		String ano = scanner.next();
		System.out.print("출금액:\n "); 
		int balance = scanner.nextInt();
		if (findAccount(ano) == null) {
			System.out.println("입력한 계좌번호를 찾지 못했습니다.");
		} else {		 
			if (balance > findAccount(ano).getBalance()) {
				System.out.println("잔액보다 큰 액수를 입력하셨습니다.");
			} else {
				//comment: findAccount(ano).getBalance() - balance의미는  조회한 계좌의 기존잔고 - 입력한 출금액
				findAccount(ano).setBalance(findAccount(ano).getBalance() - balance);
				System.out.println("결과: 출금이 성공되었습니다.");
			}
		}
	}	
		
	//comment: 계좌번호를 이용하여 계좌조회
	//comment: 접근제어자  속성   리턴유형   메소드명(매개변수리스트)
	private static Account findAccount(String accno) {
		
		//comment: 배열전체를 살펴보기
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) { //comment:입력받은 계좌번호에 해당하는 계좌가 존재하지않으면
				break; //comment: 반복문을 벗어나라
			}
			
			//comment:입력받은 계좌번호에 해당하는 계좌가 존재하면
			if (accountArray[i].getAccno().equals(accno)) {
				return accountArray[i]; //comment:Account클래스의 주소를 반환해랴
			}
		}
		//comment: 함수의 리턴형이  Account클래스인데
		//for문 밖이라는 것은  조회한 계좌가 없으므로  
		//클래스의 주소를 주지못해서 null리턴
		return null;
	}
}




