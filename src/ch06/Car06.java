package ch06;

//*정적메소드와 블록
/* 정적필드와 정적메소드는 클래스에 고정된 멤버이므로
 * 클래스를 로딩해서         메모리 영역에 적재할 때	클래스별로 관리된다.
 * 따라서 클래스의 로딩이 끝나면 바로 사용할 수 있다. 
 * 
 * 정적 메소드와 정적 블럭을 선언할 때 주의할 점은 객체가 없어도 실행된다는 특징 때문에
 * 이들 내부에 인스턴스 필드나   인스턴스 메소드를 사용할 수 없다
 */
public class Car06 {
	//field - [접근제어자] [속성] 타입 변수명=초기값;
	int speed;	//전역변수, 인스턴스변수
	static String company = "튼튼자동차";
	
	//constructor
	
	//method - [접근제어자] [속성] 리턴유형 메소드명(매개변수리스트){}
	void run() {  //인스턴스 메소드
		System.out.println("run()호출성공"); 
	} 
	
	//정적메소드
	public static void main(String[]args) {
		//인스턴스멤버를 사용하기위해서는 먼저 인스턴스를 생성해야 한다
		Car06 myCar = new Car06();
		
		myCar.speed = 100;
		System.out.println(myCar.speed);
		myCar.run();
		
		//static멤버는 클래스명.변수명, 클래스명.메소드명();
		//static메소드안에서는 static메소드만을 사용
		System.out.println(Car06.company);
		//run(); //Cannot make a static reference to the non-static method run() from the type Car06
	}
}//class Car06------------------------------------

class Car061{
	//인스턴스 필드 & 메서드
	int field1;
	void method1() {}
	
	//정적 필드 & 메소드로 선언하세요
	static int field2;
	static void method2() {}
	
	//정적블록
	/*정적 메소드와 정적 블럭을 선언할 때 주의할 점은 객체가 없어도 실행된다는 특징 때문에
    * 이들 내부에 인스턴스 필드나   인스턴스 메소드를 사용할 수 없다 */
	static {
		int field3=10;
		int field4=10;
		String str;
		
		field2 =100;
		method2();
		//field1 = 100;//컴파일에러.Cannot make a static reference to the non-static field field1
		//this.field1 = 100;//컴파일에러.Cannot use this in a static context
		
		//method1();//컴파일에러.Cannot make a static reference to the non-static method method1() from the type Car061
	}
	
	//정적메소드 선언
	static void test() {
		field2 =100;
		method2();
		
		//field1 = 100;//컴파일에러.Cannot make a static reference to the non-static field field1
		//this.field1 = 100;//컴파일에러.Cannot use this in a static context
		//method1();//컴파일에러.Cannot make a static reference to the non-static method method1() from the type Car061
		
		//but 가능하게 코드를 작성하세요
		Car061 c61 = new Car061();
		c61.field1 = 100;
		c61.method1();
	}
	
}









































