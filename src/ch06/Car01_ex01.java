package ch06;



//자동차 Class를 사용하게 되는 실행 Class
//main method를 가진 클래스 

public class Car01_ex01 {

	public static void main(String[] args) {
		//자동차클래스로부터 object생성
		//creating an instance of a class / instantiate an object
		//variable name;
		//new Class();
		//Data type variable [heat type] = new Class(); // address - object
		//creating a data type variable --> heap address created   
		// "new" keyword is a java operator that create the object 
		
		
		//Creating an Object from Car01 Class
		//heap type variable = new Car01();
		Car01 car01 = new Car01();//object created
		System.out.println("car01= "+ car01);
		//car01= ch06.Car01@15db9742 => address created in the heap memory [allocating memory and returning a reference to that memory]
		
		//creating another "car" object????
		//Car01 car02= new Car01();
		//System.out.println("car02= "+ car02);
		//car02= ch06.Car01@6d06d69c => another address created in the heap memory [allocating memory returning a reference to that memory] 
		

		
		//필드값 가져와서 출력 
		//changing color || new Car01() - heap memory /  car01 - declared variable / .calling car01 => changing to another color
		//필드값을 변경해준다 || 변수 형태로 선언된 변수명 안에 새로운 값을 부여해준다 || 기존 필드 안에새로운 값을 부여
		//참조변수명.필드명 접근 해서 "reference"  =안에다가  새값 부여 "assigning" ==> calling ==> creating an object
		
		car01.color="black";
		System.out.println(car01.color);
		System.out.println(car01.brand);
		System.out.println(car01.maxKGM);
		System.out.println(car01.maxSpeed);
		System.out.println(car01.speed);
		System.out.println(car01.makeDate);
		System.out.println(car01.price);
		
		//referenced by Car01 constructor --> car02 Class
		Car01 car02= new Car01();
		System.out.println(car02.color);
		System.out.println(car02.brand);
		System.out.println(car02.maxKGM);
		System.out.println(car02.maxSpeed);
		System.out.println(car02.speed);
		System.out.println(car02.makeDate);
		System.out.println(car02.price);
		
		
		//메소드호출
		//메소드명
		//
		car01.move();
		

	}

}
