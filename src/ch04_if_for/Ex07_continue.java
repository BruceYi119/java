package ch04_if_for;

//[Java의정석]ch4_조건문과반복문- 22슬라이드 참고
//자신이 포함된 반복문의 끝으로 이동한다.(다음 반복으로 넘어간다.)
//continue문 이후의 문장들은 수행되지 않는다.

public class Ex07_continue {

	public static void main(String[] args) {
		//
		for(int i=0; i<11 ;i++) {//5<11
			if(i==5) {
				//System.out.println("i==5일 때-continue");
				continue; //지금 진행하던것은 멈추고 다음 반복을 계속해라 => for문에서는 증감식으로 이동

			}
			System.out.println("i="+i); 
		}
		System.out.println("for문 밖");
		
		System.out.println("--------------------------");
		
		//
		for(int i=0; i<11 ;i++) {
			if(i==5) {
				System.out.println("i==5일 때-break");
				break;
			}
			System.out.println("i="+i);
		}
		System.out.println("for문 밖");
		
	}

}










