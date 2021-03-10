package ch05_array;

import java.util.Arrays;

//배열의 활용
//5명 학생의 최고점수와 최저점수를 출력하세요
/*출력결과
[10, 88, 90, 99, 100]
최고점수=100
최저점수=10
 */

public class Ex10 {

	public static void main(String[] args) {
		int[] score = {100,90,10,88,99};
		
		
		//	다음수부터 마지막수까지 이 수하고 비교한다.
		for(int i = 0; i < score.length - 1; i++) {
			//각라운드는 자신보다 하나 큰 데이터부터 마지막까지 반복해야 한다.
			for(int j = i + 1; j < score.length; j++) {
				if(score[i] > score[j]) {
					int	temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		
		System.out.println( Arrays.toString(score));
		System.out.println("최고점수=" + score[score.length-1]);
		System.out.println("최저점수=" + score[0]);
		
	}

}








