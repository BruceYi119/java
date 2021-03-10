package ch07;

import other.MyClass01;

//MySubClass02는		MyClass01클래스를 상속받고 있으므로
//이 클래스에는 		부모클래스로 부터 상속받은 pub,pro,pack,pri가 이미 존재
/* 
public		-	누구나 접근가능
protected	- 동일클래스,동일패키지,(다른패키지이더라도)상속받은 하위클래스
default	- 동일클래스,동일패키지
private	- 동일클래스에서만 접근 가능.*/
class MySubClass02  extends MyClass01 {

	void qqq() {
		pub = 100;
		pro = 200; //서로 다른 패키지이지만  상속관계의  자식클래스에서는 접근가능
		
		//pack= 300;//컴파일에러.
		//The field MyClass01.pack is not visible
		
		//pri = 400;//컴파일에러.
		//pri필드는 동일클래스에서만 접근 가능. 외부클래스에서는 접근불가.
		//컴파일에러.
		//The field MyClass01.pri is not visible
		
		//메소드 접근 허용 여부 체크해보자
		pubMethod();
		proMethod();
		//packMethod();//컴파일에러.
		//The method packMethod() from the type MyClass01 is not visible
		//priMethod();//컴파일에러.
		//The method priMethod() from the type MyClass01 is not visible
	}
}




