package ch04_if_for;

//do while : [Java의정석]ch4_조건문과반복문- 20슬라이드 참고
//:while문의 변형. 블럭{}을 먼저 수행한 다음에 조건식을 계산한다.
//블럭{}이 최소한 1번 이상 수행될 것을 보장한다
/*do{
 *	//반복실행코드 
 *}while(조건);
 */
public class Ex06_do_while {

	public static void main(String[] args) {
		//1 2 3 4 5 출력
		int i = 0;
		do {
			System.out.println("i="+i); //조건충족하지 않아도 1번은 실행된다
		}while(i>5);
	}

}






