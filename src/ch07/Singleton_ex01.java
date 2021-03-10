package ch07;

//Singleton클래스에서 객체얻기
public class Singleton_ex01 {

	public static void main(String[] args) {
		//Singleton s = new Singleton();
		//The constructor Singleton() is not visible
		
		Singleton s = Singleton.getInstance();
				
		s.test();
	}

}





