package ch06;

/*
 * 클래스 구성 맴버
 * 1. fields : 객체의 데이터가 저장되는 곳
 * 	- hold the data/attributes of an object
 * 	[접근제어자] [속성] 테이터타입 변수명
 * 	
 * 2. constructors : 객체 생성시
 * 	- called when new objects are created
 *  
 * 3. method : 객체의 동작에 해당되는 실행블록
 * 	- the behavior of an object 
 */

public class Car02 {
	
	//field
	String company = "좋은자동차";
	String model;
	char color;
	int maxspeed;
	
	static int wheel = 4;
	
	
	//Method
	void abc() {
		System.out.println("abc()안에서 접근한 company="+company);
		//company는 전역변수로 선언했으므로 abc()안에서 접근할 수 있다
	}
	
	void qwe() {
		System.out.println("qwe()안에서 접근한 company="+company);
		//company는 전역변수로 선언했으므로 abc()안에서 접근할 수 있다
	}

}
