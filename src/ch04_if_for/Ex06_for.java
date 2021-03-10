package ch04_if_for;

//반복문 for  : [Java의정석]ch4_조건문과반복문- 16슬라이드 참고
public class Ex06_for {

	public static void main(String[] args) {
		int j=0;
		for( ; ; ) {   //[Java의정석]ch4_조건문과반복문-슬라이드16참고
			if(j<5) {
				System.out.println(j);
				j++;
			}else {
				System.out.println("조건x");
				break;//반복문 종료
			}
		}
		System.out.println("for밖");
		
		/*
		// 1+ 2+ 3+ 4+ 5+6+...100합출력
		int sum = 0; //누적된 합을 저장하기위해 선언한 변수
		for( int i=1; i<=100 ;i++) { 
			sum += i;  //sum = sum+i;   //대입연산자
			//System.out.println("sum+i="+sum); //sum=10
			//System.out.println("i="+i);
		}
		System.out.println("총합="+sum); //5050
		*/
		//구구단 2단출력  -----------------------------------
		/*
		 * 2 * 1 = 2 
		 * 2 * 2 = 4 
		 * 2 * 3 = 6 
		 * 2 * 4 = 8 
		 * 2 * 10 = 20
		 */
		/*for( int i=1; i<11; i++) { //지역변수 i =>for문안에서만 사용
			int dan = 2;		//지역변수 dan
			int result = 2*i;
			System.out.println(dan+" * "+i+" = "+result );
		}
		*/
		
		// 5 4 3 2 1 ..1-------------------------------
		/*for( int i=5; i>0; i--) {

			System.out.println("i="+i);
		}
		*/
		
		//1 2 3 ... 8 9 10까지 출력-----------------------------------------
		/*for( int i=1; i<11; i++) {
			System.out.println("i="+i);
		}
		*/
	}

}









