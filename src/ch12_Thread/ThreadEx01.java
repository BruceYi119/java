package ch12_Thread;

public class ThreadEx01 {

	public static void main(String[] args) {
		//MyThread  myThread = new MyThread();
		//이름을 제시하지않으면   Thread-0,  Thread-1,.... 식으로  이름이 자동으로 만들어진다
		
		MyThread  myThread = new MyThread("나의스레드"); //스레드 객체 생성
		myThread.start();//myThread를 시작시키는 부분
		//start()메서드를 호출하면   새로운 callback을  할당받고
		//Runnable상태가  되었다가
		//스레드 스케줄러에 의해서  선택되면
		//Running상태가 되면서
		//해당 스레드의 run()가 실행된다
	}

}

//Thread 클래스를 상속받아서  생성하기
class  MyThread   extends     Thread{
	public MyThread(){   }
	public MyThread(String name){   super(name);  }

	@Override
	public void run() {
		for(int i=1; i<=20; i++) {
			//public static Thread currentThread() : 현재 실행중인 스레드를 리턴
			System.out.print(currentThread().getName());//현재 실행중인 스레드의 이름 출력
			try {
				sleep(300); //300밀리초동안  실행을 중지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("run()~~~~");
			
			System.out.println(); //줄바꿈
		}
	}
	
}














