package ch07;

//DmbCellPhone01클래스를 사용하는 실행클래스

public class DmbCellPhone_ex01 {

	public static void main(String[] args) {
		DmbCellPhone01 dmbCP = new DmbCellPhone01("자바폰","hotPink",100);
		
		//CellPhone01클래스로부터 상속받은 필드값 출력
		System.out.println("model="+dmbCP.model);
		System.out.println("color="+dmbCP.color);
		
		//DmbCellPhone01클래스에서 선언한 필드값 출력
		System.out.println("channel="+dmbCP.channel);
		
		
		//CellPhone01클래스로부터 상속받은 메소드호출
		dmbCP.powerOn();//전원키고
		dmbCP.bell();//벨소리점검
		dmbCP.sendVoice("여보세요~~ 거기 누구 없소?");//여보세요~~ 거기 누구 없소? 물어보기
		dmbCP.receiveVoice("네~");//네~ 대답듣기
		
		//DmbCellPhone01클래스에서 선언한  메소드호출
		dmbCP.turnOnDmb();//dmb켜기
		dmbCP.changeChannelDmb(200);//채널변경
		dmbCP.turnOffDmb();//dmb끄기
		
	}

}














