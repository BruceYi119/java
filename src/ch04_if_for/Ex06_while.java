package ch04_if_for;

//while문  : [Java의정석]ch4_조건문과반복문- 18슬라이드 참고
/* 조건식과 수행할 블럭{} 또는 문장으로 구성
 * while(조건) {
			//조건만족시 반복실행코드
		}
*/		
public class Ex06_while {

	public static void main(String[] args) {
		
		int i=0;
		while(i<5) {
			//조건만족시 반복실행코드
			i++;                         
			System.out.println("i="+i);//1 2 3 4 5  
		}
		System.out.println("while밖");
		System.out.println("------------------------------");
		//----------------------------------
		int i1=0;
		while(i1<5) {
			//조건만족시 반복실행코드
			System.out.println("i="+i1);//  0 1 2 3 4
			i1++;                         
		}
		System.out.println("while밖");
		
		
	}

}







