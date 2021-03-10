package ch04_if_for;

//[Java의정석]ch4_조건문과반복문- 21슬라이드 참고
//break
//주의. 자신이 포함!!!!된 하나의 반복문 또는 switch문을 빠져 나온다
//주로 if문과 함께 사용해서 특정 조건을 만족하면 반복문을 벗어나게 한다.
public class Ex07_break2 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0; 
		while(sum<110) { //106<110  107<110 108  109<110  110<110
			while(true) {
				if( sum>100 ) { //107>100 108>100 109>100
					break; //주의! break속한!!  해당 반복문종료
				}	
				i++;
				sum += i; // sum=sum+i;
				System.out.println("i값이 "+i+"일때의 sum="+sum);
			}
			System.out.println("내부 while문밖");
			System.out.println("i="+i);
			System.out.println("누적총합 sum="+sum);//105 106 107 108 109
			sum++;
		}
		System.out.println("외부 while문밖");
		
	}

}










