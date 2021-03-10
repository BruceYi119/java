package ch05_array;

//다차원배열 - [Java의정석]ch5_배열 - 슬라이드11, 교재 p214 참고
//  -‘[]’의 개수가 차원의 수를 의미한다.

/* 중첩for문은
 -[Java의정석]ch4_조건문과반복문 - 슬라이드17,교재 p165참고
 -실습예제		ch04_if_for.Ex06_forInfor2.java   파일 참고
 */

//5명학생의 3과목 시험점수를 저장한 후 출력
public class Ex04 {

	public static void main(String[] args) {
		//int[][] score = new int[5][3];
		int[][] score = {
						  {100,90,80},  
			   			  {90,80,70},
						  {33,66,99},
						  {50,60,70},
						  {80,90,100}
					     };
		
		for(int i=0;  i<score.length ; i++) {		
			for(int j=0; j<score[i].length; j++) {
			//for(int j=0; j<score[0].length; j++) {
			//for(int j=0; j<score[1].length; j++) {
			//for(int j=0; j<score[2].length; j++) {
			//for(int j=0; j<score[3].length; j++) {
			//for(int j=0; j<score[4].length; j++) {
			//for(int j=0; j<score[score.length-1].length; j++) {
				System.out.print( score[i][j] +" ");
			}//내부for문
			System.out.println();
		}//외부for문
		
	}

}






