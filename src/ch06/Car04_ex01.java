package ch06;

public class Car04_ex01 {

	public static void main(String[] args) {
		Car04 myCar= new Car04("짱짱좋은자동차");
		Car04 yourCar= new Car04("국산자동차");
		myCar.run();
		yourCar.run();
		
		System.out.println("myCar="+myCar);
		System.out.println("yourCar="+yourCar);
		
	}

}
