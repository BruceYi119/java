package ch04_if_for;

//중첩for문-[Java의정석]ch4_조건문과반복문 - 슬라이드17 참고
//교재 p 165참고
//  - for문 안에 또 다른 for문을 포함시킬 수 있다
//  - for문의 중첩횟수에는 거의 제한이 없다.
/*출력결과
 *  [i,j]
	[0,0]	[0,1]	[0,2]
	[1,0]	[1,1]	[1,2]	
	[2,0]	[2,1]	[2,2]	
	[3,0]	[3,1]	[3,2]	
	[4,0]	[4,1]	[4,2]
 */

//가변인자 - 교재 p287참고
public class Ex06_forInfor2 {

	public static void main(String[] args) {

		for(int i=0;  i<5 ; i++) {		
			for(int j=0; j<3; j++) {
				//printf() : 가변인자를 가진 메소드
				//System.out.printf(String타입의 format, Object타입의 args);
				  System.out.printf("[%d,%d]  ", i, j);
				//System.out.print("["+i+","+j+"]  ");
			}//내부for문
			System.out.println();
		}//외부for문
		
		
		
	}

}













