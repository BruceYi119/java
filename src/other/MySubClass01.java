package other;

//동일패키지안의 부모클래스인 MyClass01에서 선언된 필드에 접근허용여부 체크하자
class MySubClass01 extends MyClass01 {

	void qqq() {
		MyClass01 m = new MyClass01();	
		m.pub = 100;
		m.pro = 200;
		m.pack= 300;
		//m.pri = 400;//컴파일에러.
		//pri필드는 동일클래스에서만 접근 가능. 외부클래스에서는 접근불가.
		//컴파일에러.
		//The field MyClass01.pri is not visible
	}
}
