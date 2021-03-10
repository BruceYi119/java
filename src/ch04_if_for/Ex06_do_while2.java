package ch04_if_for;


//do while : [Java의정석]ch4_조건문과반복문- 20슬라이드 참고
// :while문의 변형. 블럭{}을 먼저 수행한 다음에 조건식을 계산한다.

//break : [Java의정석]ch4_조건문과반복문- 21슬라이드 참고
//i가 5가되면 빠져나와라
//1 2 3 4 do while문 밖
public class Ex06_do_while2 {

	public static void main(String[] args) {
		int i=1;
		do {
			System.out.println("i="+i);
			i++;
			if( i==5 ) {
				break;//반복문종료 빠져나와라
			}
		}while(i<11);
		System.out.println("do while문 밖");
		
	}//main끝

}



