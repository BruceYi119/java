package test.q2.LeeJeongSam;

import java.util.ArrayList;
import java.util.Scanner;

//comment : 코드를 깔끔하게 잘 구현하셨어요!! ^-^
public class BankApplication {

static Scanner s;
static ArrayList<Account> accounts=new ArrayList<Account>();
	
	public static void main(String[] args) {

		//메뉴 무한반복문
		while(true) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택 > ");
			
			s=new Scanner(System.in);
			
			int choice=s.nextInt();
			
			//메뉴선택
			switch(choice) {
				case 1: //계좌생성 
					createAccount();
					break;
				case 2: //계좌목록
					accountList();
					break;
				case 3: //예금
					deposit();
					break;
				case 4: //출금
					withdraw();
					break;
				case 5: //프로그램 종료
					System.out.println("프로그램을 종료합니다");
					System.exit(0);
					break;
				default: //잘못된 입력
					System.out.println("잘못된 입력입니다");
					break;
			}
		}
		
	}
	
	public static void createAccount() {
		
		System.out.println("-------------------");
		System.out.println("계좌 생성");
		System.out.println("-------------------");
		
		//계좌번호, 예금주, 입금액 입력받기
		System.out.print("계좌 번호 : ");
		String ano=s.next();
		System.out.print("예금주 : ");
		String owner=s.next();
		System.out.print("초기입금액 : ");
		int balance=s.nextInt();
		System.out.println();
		
		//계좌 객체 생성
		Account a=new Account(ano,owner,balance);
		
		//계좌 객체 arrayList accounts에 추가
		accounts.add(a);
		System.out.println("결과 : 계좌가 생성되었습니다.");
		
		
	}
	
	public static void accountList() {
		
		System.out.println("-------------------");
		System.out.println("계좌 목록");
		System.out.println("-------------------");
		
		//arrayList accounts의 모든 목록 출력
		for(int i=0;i<accounts.size();i++) {
			
			String ano=accounts.get(i).getAno();
			String owner=accounts.get(i).getOwner();
			int balance=accounts.get(i).getBalance();
			
			System.out.printf("%s\t%s\t%d",ano,owner,balance);
			System.out.println();
			
		}
		
	}
	
	public static void deposit() {
		
		System.out.println("-------------------");
		System.out.println("예금");
		System.out.println("-------------------");
		
		//계좌번호, 입금액 입력받기
		System.out.print("계좌 번호 : ");
		String ano=s.next();
		System.out.print("입금액 : ");
		int won=s.nextInt();
		
		//계좌 객체를 찾아서 입금
		Account a=findAccount(ano);
		int balance=a.getBalance()+won;
		a.setBalance(balance);
		
		System.out.println("결과 : 예금이 성공되었습니다");
	}
	
	public static void withdraw() {
		
		System.out.println("-------------------");
		System.out.println("출금");
		System.out.println("-------------------");
		
		//계좌번호, 출금액 입력받기
		System.out.print("계좌 번호 : ");
		String ano=s.next();
		System.out.print("출금액 : ");
		int won=s.nextInt();
		
		//계좌에서 출금처리, 출금액이 예금액을 넘기면 그대로 유지
		Account a=findAccount(ano);
		int balance=0;
				if(a.getBalance()-won>=0) {
					balance=a.getBalance()-won;
				}
				else {
					System.out.println("결과 : 예금액이 부족합니다");
					return;
				}
				a.setBalance(balance);
			
		
		
		System.out.println("결과 : 출금이 성공되었습니다");
	}
	
	//comment :  리턴값으로 null을 주는 것은 되도록 피하는 것이 좋습니다
	// 코드작성시  null때문에  에러가 많이 발생하여  null이 안들어가도록 코드를 작성하기 때문이죠
	public static Account findAccount(String ano) {
		
		//ArrayList accounts에서 계좌번호로 계좌 탐색
		for(int i=0;i<accounts.size();i++) {
			
			if(ano.equals(accounts.get(i).getAno())) {
				return accounts.get(i);
			}
			
		}
		return null;
	}

}
