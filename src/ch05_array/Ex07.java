package ch05_array;

//배열의 복사 -for문을 이용한 배열의 복사
//-[Java의정석]ch5_배열 - 슬라이드13, 교재 p192 참고
public class Ex07 {

	public static void main(String[] args) {
		int[] oldArr1 = {1,2,3};
		int[] newArr1 = new int[10];
	/*	newArr1[0] = 10;   // newArr1[0] = oldArr1[0];
		newArr1[1] = 11;   // newArr1[1] = oldArr1[1];
		newArr1[2] = 121;  //newArr1[2] = oldArr1[2];
		newArr1[3] = 13;
	*/	
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
		
		//for문을 이용한 배열의 복사
		for(int i=0; i<oldArr1.length ;i++) {
			   newArr1[i] = oldArr1[i];
			// newArr1[0] = oldArr1[0];  //oldArr1[0]의 값을    newArr1[0]에 저장하겠다
			// newArr1[1] = oldArr1[1];
			// newArr1[2] = oldArr1[2];
		}
		
		System.out.println("배열복사 후의 newArr1------");
		for(int temp :newArr1) {
			System.out.print(temp+" ");
		}
		
	}

}









