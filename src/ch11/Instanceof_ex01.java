package ch11;

/*instanceof연산자 - 교재p357
 	- 참조변수가 참조하는 인스턴스의 실제 타입을 체크하는데 사용.
    - instanceof의 연산결과가 true이면, 해당 타입으로 형변환이 가능하다.
    - 강제형변환하기전에  instanceof연산자로    변환시킬 타입의 객체인지 조사하자*/

public class Instanceof_ex01 {

	public static void main(String[] args) {
		Parent03 parentA = new Parent03();
		//m1(parentA);//에러발생
		m2(parentA);  //Child03으로 강제 형변환x
	}
	static void m1(Parent03 parent){
		// java.lang.ClassCastException: ch11.Parent03 cannot be cast to ch11.Child03
		Child03 child = (Child03)parent;//ClassCastException발생할 가능성이 존재
		System.out.println("m1() : Child03으로 강제 형변환 성공");
	}
	
	static void m2(Parent03 parent){
		if(parent instanceof Child03) {//강제형변환하기전에  instanceof연산자로    변환시킬 타입의 객체인지 조사하자
			Child03 child = (Child03)parent;//강제형변환
			System.out.println("m2(): Child03으로 강제 형변환 성공");
		}else {
			System.out.println("m2(): Child03으로 강제 형변환x");
		}
	}

}//class

class Parent03{  }
class Child03 extends Parent03{  }










