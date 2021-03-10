package ch06;

public class Korean01_ex01 {

	public static void main(String[] args) {
		//Korean01 클래스로부터 객체생성
		//클래스명 변수명 = new 클래스명()
		Korean01 korean = new Korean01();
		
		//필드값 출력 // System.out.println(korean.nation); //
		System.out.println(korean.age); // System.out.println(korean.name); 
		System.out.println(korean.ssn); 
		
		//매개변수의 타입,개수,순서에 맞는 생성자가 자동으로 호출된다
		//매개변수 1개짜리 생성자 호출
		Korean01 k2 = new Korean01("홍길동1");
		Korean01 k3 = new Korean01(10);
		
		//매개변수 2개짜리 생성자 호출
		Korean01 k4 = new Korean01("홍길동2","801123-1234567");
		
		//매개변수 3개짜리 생성자 호출
		Korean01 k5 = new Korean01("홍길동3","850123-1234567", 15);
		
		//k2객체의 이름개명하기
		k2.setName("김아무개");
		
		//k2객체의 이름 가져오기
		String n = k2.getName();
		System.out.println(n);
	}

}










