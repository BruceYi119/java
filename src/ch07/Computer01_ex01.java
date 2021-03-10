package ch07;

//오버라이딩(overriding) - 교재p327
//다형성(polymorphism)  - 교재p354
public class Computer01_ex01 {

	public static void main(String[] args) {
		double r = 10;
		Calculator01 cal = new Calculator01();
		System.out.println("원면적="+cal.areaCircle(r) );//Calculator01-areaCircle(double r)실행
		System.out.println();
		
		Computer01 com = new Computer01();
		System.out.println("원면적="+com.areaCircle(r) );//Computer01-areaCircle(double r)함수야
		//자식클래스인 Computer01에서  재정의한 메서드 호출
		System.out.println("-----------------");
		
		//다형성(polymorphism) - 교재p354
		//원 is a도형
		//삼각형 is a도형
		//도형=원
		//도형=삼각형
		//조상타입의 참조변수로 자손타입의 인스턴스를 참조
		// Computer is a Calculator
		// Calculator = Computer
		//부모클래스  참조변수 = new 자식클래스
		Calculator01 obj = new Computer01();
		System.out.println("원면적="+obj.areaCircle(r) );//Computer01-areaCircle(double r)함수야
	}

}







