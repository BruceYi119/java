package test.q2.JiSeungWon;

import java.util.Scanner;

public class BankApplication {

	//field
	//정적변수 계좌수를 저장	 
	static Account[] ac = new Account[100];
	//정적변수 				
	static Scanner sc = new Scanner(System.in);
	//진입함수
	public static void main(String[] args) {
		//프로그램 of/off 
		boolean run = true;	
		
		//반복문
		while(run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");
			
			//번호입력받기
			int n = sc.nextInt();
			
			//입력받은 값에 따라 각 각의  함수호출
			switch (n) {
			case 1: {createAccount(); break;}
			case 2: {accountList();	break;}
			case 3: {deposit();	break;}
			case 4: {withdraw(); break;}
			case 5: {
				System.out.println("프로그램 종료");
				run = false;}
			default: break;}
		}
	}
	
	//계좌생성하기
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println("계좌생성");
		System.out.println("--------------");
						
		//계좌번호, 계좌주: 초기입금액 입력받아 저장
		String fake = sc.nextLine();
		System.out.println("계좌번호를 입력하세요");
		String inputAno = sc.nextLine();
		System.out.println("계좌주 이름을 입력하세요");
		String inputOwner = sc.nextLine();
		System.out.println("초기 입금액을 입력하세요");
		int inputBal = Integer.parseInt(sc.nextLine());
		System.out.println("--------------");
		
		//Account클래스 객체생성
		for (int i = 0; i < ac.length; i++) {
			if (ac[i]==null) {
				ac[i] = new Account(inputAno, inputOwner, inputBal);
				 //comment: println을 이용하면 계좌번호:출력하는데 1줄소요
				//comment: 계좌번호 입력하는데 1줄소요
				//comment: 총 2줄소요
				//comment: 총 소요 line 수 = 항목*2
				//comment: 항목이 많아질수록   많은 줄이 소요되니  불편할 수 있어요
				System.out.println("계좌번호: "+ac[i].getAno());
				System.out.println("계좌주: "+ac[i].getOwner());
				System.out.println("초기입금액: "+ac[i].getBalance());
				break;
			}
		}
	}
	
	//계좌목록보기
	private static void accountList() {
		System.out.println("--------------");
		System.out.println("계좌목록");
		System.out.println("--------------");
		
		//계좌수만큼 반복하여 계좌번호, 계좌주, 잔고 출력
		for (int i = 0; i < ac.length; i++) {
			if (ac[i]!=null) {
				System.out.printf("%s     %s      %d\n",
						ac[i].getAno(), ac[i].getOwner(), ac[i].getBalance());
			} else {
				break;
			}
		}
	}
	
	//예금하기
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("예금");
		System.out.println("--------------");
		
		//계좌번호, 예금액입력받아 변수에 저장
		System.out.println("계좌번호를 입력하세요");
		String fake = sc.nextLine();
		String inputAno = sc.nextLine();
		System.out.println("예금액을 입력하세요");
		int inputDep = Integer.parseInt(sc.nextLine());
		
		int n = 0;
		for (int i = 0; i < ac.length; i++) {
			if (ac[i]==null) {
				n = i;
				break;
			} else {
				continue;
			}
		}
		
		boolean isNoano = true;
		for (int i = 0; i < n; i++) {
			if (ac[i].getAno().equals(inputAno)) {
				//해당계좌의 잔고조회하여 출력
				//결과: 예금이 성공되었습니다.출력
				ac[i].setBalance(ac[i].getBalance()+inputDep);
				System.out.println("--------------");
				System.out.println("계좌번호 : "+ac[i].getAno());
				System.out.println("예금액 : "+inputDep);
				System.out.println("결과 : 예금이 성공되었습니다");
				isNoano = false;
				break;		
			} else {
				continue;
			}
		}
		//해당계좌가 없으면 결과: 계좌가 없습니다.출력
		if (isNoano) {
			System.out.println("--------------");
			System.out.println("결과 : 계좌가 없습니다");
		}
	}
	
	//출금하기
	private static void withdraw() {
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");
		
		//계좌번호, 출금액입력받아 변수에 저장
		System.out.println("계좌번호를 입력하세요");
		String fake = sc.nextLine();
		
		//comment: Scanner클래스에  입력값을 정수타입으로 받는 메소드가 있어요  
		//comment: S그 함수를 사용하면 결과는 동일하지만  아래와 다른 코드가 나올 수 있지요
		//comment: S참고로 Integer.parseInt()도   자주. 많이. 사용되는 메소드입니다.
		//comment: S여기에서는 Scanner클래스를 사용하기에 다른 메소드를 말씀드렸어요
		String inputAno = sc.nextLine();
		System.out.println("출금액을 입력하세요");
		int inputWid = Integer.parseInt(sc.nextLine());
	
		int n = 0;
		for (int i = 0; i < ac.length; i++) {
			if (ac[i]==null) {
				n = i;
				break;
			} else {
				continue;
			}
		}
		//계좌번호로 계좌조회
		boolean isNoano = true;
		for (int i = 0; i < n; i++) {
			if (ac[i].getAno().equals(inputAno)) {
				//해당계좌의 잔고조회하여 출력
				//결과: 예금이 성공되었습니다.출력
				ac[i].setBalance(ac[i].getBalance()-inputWid);
				System.out.println("--------------");
				System.out.println("계좌번호 : "+ac[i].getAno());
				System.out.println("출금액 : "+inputWid);
				System.out.println("결과 : 출금이 성공되었습니다");
				isNoano = false;
				break;		
			} else {
				continue;
			}
		}
		//해당계좌가 없으면 결과: 계좌가 없습니다.출력
		if (isNoano) {
			System.out.println("--------------");
			System.out.println("결과 : 계좌가 없습니다");
		}
	}	
	
	//계좌번호로 계좌조회
	private static Account findAccount (String ano) {
		for (int i = 0; i < ac.length; i++) {
			if (ac[i].getAno().equals(ano)) {
				return ac[i];
			} else {
				continue;
			}
		}
		return null;
	}
}
