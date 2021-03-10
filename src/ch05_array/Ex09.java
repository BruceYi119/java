package ch05_array;

//배열의 활용
//5명 학생의 총점수와 평균점수를 또 다른 배열에 저장한 후 출력하세요
/*출력결과
총점 = 387
평균 = 77.4
 */

public class Ex09 {

	public static void main(String[] args) {
		int[] score = {100,90,10,88,99};
		float[] result = new float[2]; //총점과 평균을 저장하기위한 배열변수 선언
		
		for(int i = 0; i < score.length; i++) {
			result[0] = result[0] + score[i];
		}
		
		result[1] =result[0] / (float)score.length;
		
		System.out.println("총점 = " + result[0]);
		System.out.println("평균 = " + result[1]);
	}

}






