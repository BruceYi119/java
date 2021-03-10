package ch12_Thread;

//동기화 코드
//여기에서는 열차예매시스템이라고 가정한후
//	여러 매표소에서  스레드를 이용해서  좌석을 예매하고
//	현재  잔여 좌석이  1개 남아있을 경우
//	여러 스레드에서  동시에  열차를 예매하는  메소드에 접근할 수 있다고 가정하자
//	=> 잔여 좌석은 1개인데    여러 스레드에서  동시에   메소드에  접근해서  예매처리가 된다
//	   이런 경우의 작업을  처리할 때는   한 스레드가      메서드에 접근해서  예매 작업을 실행할때에는
//	  다른 스레드에서는   해당 메서드에 접근할 수 없게  처리하는 작업이 필요하다
//		==> 이런 작업을 동기화 작업(Synchronized)라고 한다.

//동기화를 지정한 경우
public class SynchronizedEx02 {

	public static void main(String[] args) {
		Ticket02 tck = new Ticket02();
		Thread tr1 = new Thread(tck, "hong구매자");
		Thread tr2 = new Thread(tck, "GD구매자");
		tr1.start();
		tr2.start();
	}

}

//예매작업
class Ticket02  implements  Runnable{

	int ticketNum = 10; //잔여좌석수
	
	@Override
	public void run() {
		for(int i=1; i<=10 ;i++) {
			try {
				Thread.sleep(1000);
				getTicket();//티켓구매함수호출
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}//run
	
	//동기화를 지정하지않은 예매작업
	public   void getTicket() {	
		ticketNum -= 1;
		System.out.print(Thread.currentThread().getName()+" 구매 -");
		if( ticketNum<=0 ) {
			System.out.println("잔여 좌석이 없어요!");
			return;
		}
		System.out.println("현재 잔여 좌석수 : "+ticketNum);
	}
	
}































