package ch07;

//Car01클래스의 객체를 생성하여 실행하는 클래스
public class Car01_ex01 {
	public static void main(String[] args) {
		Car01 myCar = new Car01();
		//myCar.speed = 100;
		//Car01클래스의 speed필드는 은닉화되어서
		//외부에서 함부로 접근할 수 없다
	
		//speed변경
		myCar.setSpeed(-100);
		
		System.out.println("현재 speed="+myCar.getSpeed());
		
		//stop상태확인
		if(!myCar.isStop()) {
			myCar.setStop(true);
			System.out.println(myCar.isStop());
		}
		
		
	}
}








