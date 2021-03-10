package ch11;

//Vehicle를 이용하는 클래스
public class Driver {
	//다형성 : 조상타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있다 
	/*Vehicle vehicle = new Vehicle();
	Vehicle vehicle = new Bus();
	Vehicle vehicle = new Taxi();*/
	
	//매개변수의 다형성 => 예)컬렉션 Collection인터페이스의 add(Object obj)
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}





