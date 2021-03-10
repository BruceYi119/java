package ch07;

//Person01클래스로 부터 객체를 생성하여 실행하는 클래스
public class Person01_ex01 {

	public static void main(String[] args) {
		//객체생성
		//Person01 p= new Person01();
		//Person01클래스에는 String타입 2개를 파라미터로 가진 생성자가 존재하므로
		//기본생성자는 사용할 수 없다
		//The constructor Person01() is undefined
		
		Person01 p= new Person01("801123-1234567", "홍길동");
		
		//필드3개의 값 출력
		System.out.println("p.nation="+p.nation);
		System.out.println("p.ssn="+p.ssn);
		System.out.println("p.name="+p.name);
		
		//필드3개의 값 변경
		//여기에서 nation은 변수를 선언하면서 초기값이 저장되었고
		//여기에서 ssn은      객체를 생성하면서 생성자의 argument값으로 초기값이 저장되었으므로
		//프로그램을 실행하는 도중에 변경x
		//p.nation="대한민국";//The final field Person01.nation cannot be assigned
		//p.ssn="801123-234567";//The final field Person01.ssn cannot be assigned
		p.name="홍의적";
	}

}






