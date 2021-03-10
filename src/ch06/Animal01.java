package ch06;
//Creating a Class 
//Class 를 만들때는 위에서부터 추상화 (동물) 아래까지 구체화시킨다(포유류...)
//강아지는 동물이다, 사람은 동물이다, 지렁이는 동물이다 ==> is a relationship (inheritance) 
//
//has a relationship (composition)
// 자동차
//
//엔진, 타이어, 외장
// 자동차는 엔진을 가지고 있다
//자동차는 타이어를 가지고 있다

public class Animal01 {
	
	//필드 field
	//[접근제어자] [속성] 데이터타입 변수명;
	String type = "Mammal";
	String color = "white";
	Double height = 185.0 ;
	Double weight =  72.5;
	
	//기능 method
	//[접근제어자] [속성] 리턴유형 함수명(매개변수리스트) {}
	void sounding() {
		System.out.println("barking()호출성공!");
	}
	
	void eating() {
		System.out.println("eating()호출성공!");
	}
	
	void moving() {
		System.out.println("moving()호출성공!");
	}
	
	void sleeping() {
		System.out.println("sleeping()호출성공!");
	}
	
	
	
	
	

}
