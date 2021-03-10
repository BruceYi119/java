package ch11;

/*매개변수의 다형성 - 교재p367
	- 참조형 매개변수는 메서드 호출시, 자신과 같은 타입 또는 자손타입의 
	  인스턴스를 넘겨줄 수 있다.*/
public class Driver_ex01 {

	public static void main(String[] args) {
		Driver driver = new Driver();
		//driver.drive( new Vehicle() );//탈것이 움직여요
		
		Bus bus = new Bus();		
		driver.drive( bus );//Bus가 움직여요
		//drive()메소드가 호출되면서  들어간 매개변수의 타입이 
		//자동타입변환되었다.   Vehicle vehicle = new Bus();
		//자손클래스인 Bus에서  부모클래스Vehicle의 run()를 오버라이딩하였으므로
		//Bus의 오버라이딩된 run()가 실행되었다
		
		Taxi taxi = new Taxi();
		driver.drive( taxi );//Taxi가  달립니다
		//drive()메소드가 호출되면서  Vehicle vehicle= taxi;
	}

}





