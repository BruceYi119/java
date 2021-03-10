package ch05_array;

//배열선언과 생성=> 데이터타입에 따른 자동초기화
public class Ex02 {

	public static void main(String[] args) {
		//String타입 데이터3개를 저장하기위한 names배열변수선언 후 출력
		String[] names = new String[3];
		for(String name : names) {
			System.out.println(name);//String과 같은 class의 초기값은 null
		}
		
		System.out.println("----------------------");
		
		double[]  height = new double[5];
		for(int i=0; i<height.length ;i++) {
			System.out.println(height[i]);  //자동초기화=>여기에서는 double타입은 0.0
		}
		System.out.println("----------------------");
		
		
		//점수 5개를 저장하기위한 배열변수 jumsu선언과 생성
		int  jumsu[] = new int[5];
		
		for(int i=0; i<jumsu.length ;i++) {
			System.out.println(jumsu[i]);  //자동초기화=>여기에서는 int타입은 0
		}
		
		
		
	}

}











