package ch07;



public class Audio implements RemoteControl {
	private int volume;
	private boolean mute;  //디폴트메서드를 오버라이드하면서 사용하게되는 필드를 선언
	
	@Override  //실체메서드
	public void turnOn() { System.out.println("Audio 전원을 켭니다");	}

	@Override  //실체메서드
	public void turnOff() { System.out.println("Audio 전원을 끕니다"); }

	@Override  //실체메서드
	public void setVolumn(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) { //최고볼륨보다 큰 경우   예)100->10으로 만들고
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) { //최저볼륨보다 작은 경우    예)10->0으로 만들고
			this.volume=RemoteControl.MIN_VOLUME;
		}else {	//정상범주인 경우		
			this.volume=volume;   
		}
		System.out.println("현재  Audio volume="+this.volume);
	}

	//디폴트메서드는   인터페이스의 모든 구현객체가 가지고 있는   기본 메소드
	//하지만 필요시    오버라이딩 할 수 있다
	@Override
	public void setMute(boolean mute) {
		//RemoteControl.super.setMute(mute);
		this.mute = mute;  //이 객체의 mute필드의 값을 변경
		if(mute) { //mute가 true라면
			System.out.println("Audio를   무음처리합니다");
		}else {
			System.out.println("Audio의  음소거를  해제합니다");
		}
	}

	
	
}







