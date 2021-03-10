package ch07;

//final 클래스 -교재p345참고
//상속 - 교재p310참고
//[접근제어자]  [속성]  class  클래스명  [extends 부모클래스명]
public class Ex02 extends Object{
	public static void main(String[] args) {
		Father02 f = new Father02();
		f.abc();//Father02의 abc()함수야
		
		Son02 s = new Son02();
		s.qqq();//Son02의 qqq()
		s.abc();//Father02의 abc()함수야. 
		//상속받은 Father02클래스의 메소드 abc()를 호출할 수 있다
		
		//Son022 s2 = new Son022();
		//s2.aaa(); //컴파일에러.The method aaa() is undefined for the type Son022
	}
}

//final로 선언하였기 때문에  하위클래스(sub클래스)가 존재할 수 없다
final class Father022{  
	void aaa() {
		System.out.println("Father022의 aaa()");
	}   
}

//컴파일에러.Father022가 final로 선언되었으므로 상속을 받을 수 없다
//class Son022 extends Father022{} //컴파일에러.The type Son022 cannot subclass the final class Father022

class Father02{
	int a = 10;
	void abc(){ 
		System.out.println("Father02의 abc()함수야");
	}
}

//Son02클래스는 부모클래스인 Father02의 필드와 메서드를 상속받았다
class  Son02 extends Father02{
	void qqq() { System.out.println("Son02의 qqq()");}
}










