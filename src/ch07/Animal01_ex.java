package ch07;

//실행클래스
//추상메소드의 오버라이딩메소드를 실행해보기
public class Animal01_ex {

	public static void main(String[] args) {
		//Animal01 animal=new Animal01(); //컴파일에러
		Puppy01 puppy = new Puppy01();
		Cat01   cat = new Cat01();
		puppy.sound(); //오버라이딩된 메소드 호출
		cat.sound();   //오버라이딩된 메소드 호출
		System.out.println();
		
		//변수의 다형성 => 변수 자동 타입 변환
		Animal01 animal = null;  //(추상)클래스 참조변수 선언 및 초기화
		animal = new Puppy01();
		animal.sound();  //멍멍하고 짖어요 //오버라이딩된 메소드 호출
		animal = new Cat01();
		animal.sound();  //엄마~하고 소리내요 //오버라이딩된 메소드 호출
		System.out.println();
		
		//매개변수의 다형성
		animalSound(new Puppy01());  //오버라이딩된 메소드 호출
		animalSound(new Cat01());    //오버라이딩된 메소드 호출
	}
	
	//매개변수의 다형성 : 부모(추상)클래스의 매개변수에
	//자식객체를 대입할 수 있도록 다형성을 적용
	public static void animalSound(Animal01 animal) {
		animal.sound();
	}
	

}
















