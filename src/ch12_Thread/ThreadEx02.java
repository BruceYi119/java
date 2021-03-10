package ch12_Thread;

// Runnable 인터페이스를 구현해서  정의하기	

public class ThreadEx02 {

	public static void main(String[] args) {
		
		YourThread your = new YourThread();
		
		//Thread(Runnable target, String name)
		Thread  yourThread = new Thread(your, "너의스레드"); //스레드 객체 생성
		//YourThread 클래스 자체가   Thread클래스가  아니므로
		//Thread클래스의  생성자를 이용해서
		//스레드 객체 생성한다
		
		yourThread.start();
		//start()메서드를 호출하면   새로운 callback을  할당받고
		//Runnable상태가  되었다가
		//스레드 스케줄러에 의해서  선택되면
		//Running상태가 되면서
		//해당 스레드의 run()가 실행된다
	}

}

//Runnable 인터페이스를 구현해서  정의하기	
//Runnable 인터페이스에는   void run() 메서드만이 있다
//아래의  클래스는  Runnable 인터페이스를 구현하는 클래스.
class  YourThread   implements  Runnable{

	public YourThread(){   }

	@Override
	public void run() {
		
		for(int i=1; i<=20; i++) { //public static
			 //Thread currentThread() : 현재 실행중인 스레드를 리턴
			 System.out.print(Thread.currentThread().getName());//현재 실행중인 스레드의 이름 출력 
			try { 
				Thread.sleep(300); //300밀리초동안 실행을 중지 
			} catch (InterruptedException e) {
				e.printStackTrace(); 
			} System.out.print("run()~~~~");
			 
			 System.out.println(); //줄바꿈
			} 
		 }
	}
















