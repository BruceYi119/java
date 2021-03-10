package ch07;

//추상클래스- 교재p375
// (실체)클래스들의 공통적인 특성(필드,메서드)을 추출해서 선언한 클래스
// (실체)클래스: 호랑이, 강아지, 고양이, 곤충, 물고기, 사람
public abstract class Animal01 {
	//field
	public String type;
	
	//constructor
	
	//abstract method - [public|protected]  abstract 리턴유형  메스드명(매개변수리스트);
	public abstract void move(); //움직이다
	public abstract void sound();//소리낸다
	
	//일반method
	public void breath() { System.out.println("숨쉬기");  }
}





