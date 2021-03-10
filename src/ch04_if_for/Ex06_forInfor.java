package ch04_if_for;

//중첩for문-[Java의정석]ch4_조건문과반복문 - 슬라이드17 참고
//교재 p163참고
//  - for문 안에 또 다른 for문을 포함시킬 수 있다
//  - for문의 중첩횟수에는 거의 제한이 없다.

public class Ex06_forInfor {

	public static void main(String[] args) {
		//2~9출력
		for(int i=2;  i<10 ; i++) {
			System.out.println("i==>"+i+"단");
			
			for(int j=1; j<10; j++) {
				System.out.println("\t"+i+" * "+j+" = "+(i*j));
			}//내부for문
			
		}//외부for문
		
		
		
	}

}













