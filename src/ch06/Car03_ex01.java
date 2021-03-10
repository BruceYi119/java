package ch06;

//Car03클래스로부터 객체를 생성하여 실행하는 클래스

public class Car03_ex01 {
	
	public static void main(String[] args){
		Car03 myCar = new Car03();
		System.out.println(myCar.company);
		System.out.println("---------------");
		
		Car03  c1 = new Car03("suv");
		System.out.println(c1.model);
		System.out.println(c1.color);
		System.out.println(c1.maxSpeed);
		System.out.println("---------------");
		
		Car03  c2 = new Car03("suv1","red");
		System.out.println(c2.model);//suv1
		System.out.println(c2.color);//red
		System.out.println(c2.maxSpeed);//500
		System.out.println("---------------");
		
		Car03  c3 = new Car03("suv2","black", 300);
		System.out.println(c3.model);//suv2
		System.out.println(c3.color);//black
		System.out.println(c3.maxSpeed);//300
		System.out.println("---------------");
		
	}
	
}










