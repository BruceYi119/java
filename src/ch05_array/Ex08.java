package ch05_array;

//배열의 활용
//5명 학생의 총점수와 평균점수를 출력하세요
/*출력결과
총점 = 387
평균 = 77.4
 */

public class Ex08 {

	public static void main(String[] args) {
		int[] score = {100,90,10,88,99};
		
		int	total = 0;//총점을 저장하기위한 변수선언
		for(int i = 0; i < score.length; i++) {
			total = total + score[i];
		}
		
		float	avg = total / (float) score.length;//평균저장 변수
		
		System.out.println("총점 = " + total);
		System.out.println("평균 = " + avg);
	}

}






