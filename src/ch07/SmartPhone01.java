package ch07;

//SmartPhone01은   Phone01의 실체클래스이므로
// Phone01의 생성자를 호출해야 한다

//Implicit super constructor Phone01() is undefined for default constructor. 
//Must define an explicit constructor
public class SmartPhone01 extends Phone01{
	
	//constructor
	public SmartPhone01(String owner) {
		super(owner);
	}

	//method
	public void internet() {
		System.out.println("인터넷사용");
	}
}
