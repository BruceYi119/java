package ch05_array;

import java.util.Arrays;

//System.arraycopy()를 이용한 배열의 복사
//-[Java의정석]ch5_배열 - 슬라이드13, 교재 p194 참고

//Arrays.toString(배열명) : 파라미터로 던진 배열안의  데이터를 문자열형태로 가져온다
//Arreys클래스에 대한 자세한 내용은 교재 p624참고
//[Java의정석3판]ch11_CF.ppt - 슬라이드29참고
public class Ex07_2 {

	public static void main(String[] args) {
		int[] oldArr1 = {11,12,13,14,15};
		int[] newArr1 = new int[10];
		
		System.out.println("배열복사 전의  oldArr1------");
		for(int i=0; i<oldArr1.length ;i++) {
			System.out.print(oldArr1[i]+" ");
		}
		System.out.println();
		
		System.out.println("배열복사 전의 newArr1------");
		for(int i=0; i<newArr1.length ;i++) {
			System.out.print(newArr1[i]+" ");
		}
		System.out.println();
		
		//arraycopy(Object src, int srcPos, Object dest, int destPos, int length)를 이용한 배열의 복사
		/*Copies an array from the specified source array, 
		 * beginning at the specified position, 
		 * to the specified position of the destination array*/
		//System.arraycopy(원본배열명src, 원본배열의 시작인덱스번호srcPos, 새배열명dest, 새배열명의 시작인덱스번호destPos, 원본배열에서 가져올 크기length);
		
		//System.arraycopy()를 이용하면  원본배열의 일부데이터를  원하는 새배열위치부터 넣을 수  있다
		System.arraycopy(oldArr1, 2, newArr1, 5, 3);
		
		System.out.println("배열복사 후의 newArr1------");
		//Arrays : java.util패키지안에 존재하면서
		//배열과 관련된 여러 기능을 제공하는 클래스이다
		//Arrays.toString(배열명) : 파라미터로 던진 배열안의  데이터를 문자열형태로 가져온다
		//Arreys클래스에 대한 자세한 내용은 교재 p624참고
		System.out.println( Arrays.toString(newArr1) );//[0, 0, 0, 0, 0, 13, 14, 15, 0, 0]
		
		for(int temp :newArr1) {
			System.out.print(temp+" "); // 0 0 0 0 0 13 14 15 0 0
		}
		
		/*
		System.arraycopy(oldArr1, 0, newArr1, 0, oldArr1.length);
		
		System.out.println("배열복사 후의 newArr1------");
		for(int temp :newArr1) {
			System.out.print(temp+" "); //11 12 13 14 15 0 0 0 0 0 
		}
		*/
	}

}










