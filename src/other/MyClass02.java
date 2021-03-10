package other;

//MyClass01에서 선언된 필드와 메소드에 접근할 수 있는지 살펴보고자 한다
/* 
public		-	누구나 접근가능
protected	- 동일클래스,동일패키지,(다른패키지이더라도)상속받은 하위클래스
default	- 동일클래스,동일패키지
private	- 동일클래스에서만 접근 가능.*/
public class MyClass02 {
	void qqq() {
		MyClass01 m = new MyClass01();
		
		m.pub = 100;
		m.pro = 200;
		m.pack= 300;
		//m.pri = 400;//컴파일에러.
		//pri필드는 동일클래스에서만 접근 가능. 외부클래스에서는 접근불가.
		//컴파일에러.
		//The field MyClass01.pri is not visible
		
		
		//메소드 접근 허용 여부 체크해보자
		m.pubMethod();
		m.proMethod();
		m.packMethod();
		//m.priMethod();//컴파일에러.
		//The method priMethod() from the type MyClass01 is not visible
	}
}







