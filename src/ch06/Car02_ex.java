package ch06;

//자동차클래스로부터 객체를 생성하여 실행하는 클래스
public class Car02_ex {

	public static void main(String[] args) {
		
		Car02 car1 = new Car02();
		
		//applying [class variables]
		System.out.println("car1.company= "+car1.company);
		System.out.println("car1.model= "+car1.model);
		System.out.println("car1.color= "+car1.color);
		System.out.println("car1.maxspeed= "+car1.maxspeed);
		
		//field값 변경
		car1.company = "쌍용";
		System.out.println(car1.company);
		
		//Math.PI : Math Class의 Class Variable
		//Math.random : Math Class의 static method
		//declared static fields and methods can be made before desired object is instantiated  
		System.out.println(Math.random());
		System.out.println(Math.PI);
		
		//Calling Method -> Assigned Method()
		//Calling Instance Method -> reference variable.Method()
		car1.abc();
		car1.qwe();
		
		//
		//static 변수 호출 : 클래스명.변수명
		System.out.println("Car02.wheel="+Car02.wheel);
		
		Car02 car2= new Car02();
		Car02 car3= new Car02();
		System.out.println("car2.wheel="+car2.wheel);
		System.out.println("car3.wheel="+car3.wheel);
		
		
		
		
	}

}
