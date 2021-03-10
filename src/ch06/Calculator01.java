package ch06;

//계산기 Class
//메소드 선언


public class Calculator01 {
		
	//method
	//[접근제어자access modifier] [속성] 리턴유형 메소드명(매개변수리스트) {}
	//리턴값이 없는 메소드
	void  plus(long x, long y) {
		long result = 0;
		result = x + y;
		System.out.println(result);
	}
	
	//리턴값이 있는 메소드 //더하기
	int  plus(int x, int y) {
		int result = 0;
		result = x + y;
		return result;	//return은  구현결과값을 함수를 호출한 자리에 되돌려준다
		
		//return 자체가  해당 함수를 종료한다 의미.
		//System.out.println("함수의 끝");//Unreachable code
	}
	
	
	
	void a() {
		System.out.println("a()");
		b(); //함수내에서 또 다른 함수를 호출할 수 있다. //this.b();
	}
	
	void b() {
		System.out.println("b()");
	}
	
	
	//전원 on
	void powerOn () {
		System.out.println("powerOn()호출성공-전원을 켭니다");
	}
	
	//전원 off
	void powerOff () {
		System.out.println("powerOff()호출성공-전원을 켭니다");
	}
	
	
	//addition
	int add(int x, int y) {
		//고정식 		return 100;
				
		//계산식 		return x + y;
		
		//return 변수명
		int result = 0;
		result = x + y;
		return result;
	}
	
	//addition double
	double add(double x, double y) {
		//고정식 		return 100;
				
		//계산식 		return x + y;
		
		//return 변수명
		double result = 0;
		result = x + y;
		return result;
	}
	
	
	//division - 정수 2개를 받아서 첫번째 파라미터 값을 2번째 파라미터값으로 나눈 몫을 리턴하는 함수 정의
	double divide(double x, double y) {
		//계산식 		return x/y;
		
		double result = 0.0;
		result = x/y;
		return result;
	}
	
	//method overloading 
	//원칙적으로 동일 클래스내 메소느명이 동일할 수 없다 
	//하지만 매개변수의 타입, 개수, 순서가 다르면 선언가능하다
	double divide(int x, double y) {
		
		double result = 0.0;
		result = x/y;
		return result;
	}
	
	//앞에서 선언한 divide와는 매개변수의 순서가 다르다
	double divide(double y, int x) {
		return 0.0;
	}
	
}
