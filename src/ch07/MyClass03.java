package ch07;

import other.MyClass01;

//other.MyClass01에서 선언된 필드에 접근허용여부 체크하자
/* 
 public		-	누구나 접근가능
 protected	- 동일클래스,동일패키지,(다른패키지이더라도)상속받은 하위클래스
 default	- 동일클래스,동일패키지
 private	- 동일클래스에서만 접근 가능.*/
public class MyClass03 {
	void qsxc() {
		MyClass01 m = new MyClass01();
		m.pub = 100;
		//m.pro = 200; //컴파일에러.The field MyClass01.pro is not visible
		//m.pack= 300; //컴파일에러.The field MyClass01.pack is not visible
		//m.pri = 400; //컴파일에러.The field MyClass01.pri is not visible
		
		//메소드 접근 허용 여부 체크해보자
		m.pubMethod();
		//m.proMethod();//컴파일에러.
		//The method proMethod() from the type MyClass01 is not visible
		//packMethod();//컴파일에러.
		//The method packMethod() from the type MyClass01 is not visible
		//priMethod();//컴파일에러.
		//The method priMethod() from the type MyClass01 is not visible

	}
}






