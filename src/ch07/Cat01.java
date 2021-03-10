package ch07;

public class Cat01  extends Animal01 {

	public Cat01() {
		this.type = "포유류";
	}
	
	//추상클래스에서  미구현된  추상메소드를
	//실체에서는 반드시 오버라이딩하여  구현해야 한다
	@Override
	public void move() {
		System.out.println("4발로 점프해요");
	}

	@Override
	public void sound() {
		System.out.println("엄마~하고 소리내요");
	}
}
