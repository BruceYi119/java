package ch12_Thread;

//스레드 우선순위 : 특정 쓰레드가 더 많은 작업시간을 갖도록 할 수 있다
/*  public static final int	MAX_PRIORITY=10
	public static final int	MIN_PRIORITY=1
	public static final int	NORM_PRIORITY=5
 */

public class PriorityEx01 {

	public static void main(String[] args) {
		MaxThread maxT= new MaxThread("매우~~ 중요한 작업");
		MinThread minT= new MinThread("덜중요한 작업");
		
		//스레드에 우선순위 지정
		maxT.setPriority(Thread.MAX_PRIORITY);
		minT.setPriority(Thread.MIN_PRIORITY);
		
		maxT.start();
		minT.start();
		
		System.out.println("-메인스레드의 끝부분-");
	}

}

//덜 중요한 클래스라고 가정하자
class MinThread extends Thread{
	public MinThread(String name) { super(name);}

	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.println( currentThread().getName()+i  );
		}
	}
	
}

//더  중요한 클래스라고  가정하자
class MaxThread extends Thread{
	public MaxThread(String name) { super(name);}

	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.println( "\t"+currentThread().getName()+i  );
		}
	}
	
}













