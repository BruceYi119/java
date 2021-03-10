package test.q2;

public class BankApplication {
	
	//field
	//정적변수 계좌수를 저장	 Account[] = new Account[100];
	//정적변수 				 Scanner    = new Scanner(System.in); 
	
	//진입함수
	public static void main(String[] args) {
		//boolean run변수 = true; //반복실행여부를 저장하기위한 변수
		boolean run = true;	
		
		//반복문
		while(run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");
			
			//번호입력받기
			
			//입력받은 값에 따라 각 각의  함수호출
			/*예) 1이면  계좌생성 함수호출
			     2이면  계좌목록조회 함수호출
			*/
		}
	}
	
	
	
	
	//계좌생성하기
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println("계좌생성");
		System.out.println("--------------");
		
		//계좌번호, 계좌주: 초기입금액 입력받아 저장
		
		//Account클래스 객체생성
		
		//필요시 계좌반복 개설
		
	}
	
	//계좌목록보기
	private static void accountList() {
		System.out.println("--------------");
		System.out.println("계좌목록");
		System.out.println("--------------");
		
		//계좌수만큼 반복하여 계좌번호, 계좌주, 잔고 출력
	}
	
	//예금하기
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("예금");
		System.out.println("--------------");
		
		//계좌번호, 예금액입력받아 변수에 저장
		
		//계좌번호로 계좌조회
		
		//해당계좌가 없으면 결과: 계좌가 없습니다.출력
		
		//해당계좌의 잔고조회하여 출력
		
		//결과: 예금이 성공되었습니다.출력
	}
	
	//출금하기
	private static void withdraw() {
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");
		
		
		//계좌번호, 출금액입력받아 변수에 저장
		
		//계좌번호로 계좌조회
		
		//해당계좌가 없으면 결과: 계좌가 없습니다.출력
		
		//해당계좌의 잔고조회하여 출력
		
		//결과: 예금이 성공되었습니다.출력
	}	
	
	
	//계좌번호로 계좌조회
	//Account 배열에서 ano와 동일한 Account 객체 찾기 메소드
	private static Account findAccount(String ano) {
		
		//계좌수만큼 반복출력
		return null; //comment: 여기에서는 컴파일에러 발생을 막기위해 임시로 null을 리턴하였어요
	}
	
}
