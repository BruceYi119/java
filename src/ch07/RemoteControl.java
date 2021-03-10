package ch07;

//인터페이스 선언 -교재382
public interface RemoteControl {
	//상수필드		[public static final] 타입 상수명=값;
		//상수는  고정된 값으로  런타임시 데이터를 바꿀 수 없다. 상수선언시  초기값을 대입하자.
	int MAX_VOLUME=10;	//public static final int MAX_VOLUME=10;
	int MIN_VOLUME=0;	//public static final int MIN_VOLUME=0;
	
	//추상메서드     [public abstract] 리턴타입  메서드명(매개변수리스트);
		//실제 실행부는 객체(구현객체)가 가짐
	void turnOn(); 		//public abstract void turnOn();
	void turnOff();		//public abstract void turnOff();
	void setVolumn(int volumn);
	
	//디폴트메서드와 정적메서드는 자바8에서  추가됨
	//디폴트메서드는   인터페이스의 모든 구현객체가 가지고 있는     기본 메소드
	//디폴트메서드	[public] default  리턴타입  메서드명(매개변수리스트){ //구현코드 }
		//인터페이스에 선언되지만  사실은 객체(구현객체)가 가지고 있는    인스턴스 메소드
		//자바 8에서   디폴트메서드를  허용한 이유는   기존 인터페이스를 확장해서 새로운 기능을 추가하기 위함
	public default  void  setMute(boolean mute){
		if(mute) { //mute가 true라면
			System.out.println("무음처리합니다");
		}else {
			System.out.println("음소거 해제합니다");
		}
	}
	
	//정적메서드	[public] static   리턴타입  메서드명(매개변수리스트){ //구현코드 }
		//객체가 없어도  인터페이스만으로도 호출가능
	public static void  changeBattery(){ 
		System.out.println("Battery를 교체합니다");
	}
}















