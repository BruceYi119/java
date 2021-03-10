package ch11.polymorphism;

//이 클래스는 실행클래스로서  필드의 다형성을 살펴보고자 한다
//필드의 다형성 - 다형성이란 동일한 타입을 사용하지만 다양한 결과가 나오는 성질을 말한다
/*연관클래스 - CarExample01, Car01, HankookTire,KumhoTire 참고
   미리 제공해드린 프린트물을 참고하세요*/

/*참고 	다형성(polymorphism) - 교재p354, ch07.Computer01_ex01참고
		- 하나의 참조변수로 여러 타입의 객체를 참조할 수 있는 것
		    즉, 조상타입의 참조변수로 자손타입의 객체를 다룰 수 있는 것이 다형성.*/
public class CarExample01 {

	public static void main(String[] args) {
		//Car01클래스의 객체생성
		Car01 car = new Car01();
		
		//Car01객체의 run()을 5번 반복실행
		for(int i=1; i<=5 ;i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1: System.out.println("앞왼쪽 HankookTire로 교체"); //앞왼쪽 타이어가 펑크났을 때
					car.flTire = new HankookTire("앞왼쪽",15);//자동타입변환
					//Tire01 tire= new HankookTire("앞왼쪽",15);
					/*부모클래스 참조변수 = new 자식클래스명();
					Car01 car = new HankookTire("앞왼쪽",15);
					Car01의 필드에는 Tire클래스타입의 필드 flTire선언되어있다
					따라서 Car01의 필드인 flTire에  HankookTire()객체가 들어갈 수 있다*/
					break;
			case 2: System.out.println("앞오른쪽 KumhoTire로 교체");//앞오른쪽 타이어가 펑크났을 때
					car.frTire = new KumhoTire("앞오른쪽",13);//해당타이어를 13번 굴릴수 있는 KumhoTire로 교체
					break;
			case 3: System.out.println("뒤왼쪽 HankookTire로 교체");
					car.blTire = new HankookTire("뒤왼쪽",14);
					break;
			case 4: System.out.println("뒤오른쪽 KumhoTire로 교체");
					car.brTire = new KumhoTire("뒤오른쪽",17);
					break;
			}
			System.out.println("--------------------");//문제없이 잘 굴러간경우
		}//for
	}

}







