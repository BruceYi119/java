package ch03_operator;

//부호연산자 - [Java의정석]ch3_연산자.ppt 슬라이드10 참고
//주의. 부호연산자의 산출타입은 int가 된다
public class Ex01 {

	public static void main(String[] args) {
		int x = -100;
		int result = -x;
		System.out.println("reslut ="+result);//100
		int result1 = +x;
		System.out.println("reslut1 ="+result1);//-100
		
		
		short s = 100;
		//short result2 = -s; //cannot convert from int to short
		//주의. 부호연산자의 산출타입은 int가 된다
		int result2 = -s;
		System.out.println("reslut2 ="+result2);//-100
		System.out.println("------------------------------");

		//-----------------------------------------------------
		//논리부정연산자(!)
		//true를 false로,    false를 true로
		boolean play = true;
		System.out.println("play="+play);//true
		
		if(play) {
			System.out.println("if문안의 play="+play);//true
		}
		
		play = !play;
		System.out.println("play="+play);//false
		
		if(!play) { //flase의 반대인 true가 되면서  if조건이 충족된면
			System.out.println("if문안의 play="+play);//false //play변수값을 출력해라
		}
	}

}









