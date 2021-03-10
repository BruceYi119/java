package ch11;

import java.util.ArrayList;

import ch07.Car01;

//모든 객체를 추가할 수 있다
public class ArrayList00 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		//다양한 종류의 객체를 추가
		list.add("문자열");		//String
		list.add(1);			//int의 래퍼클래스인 Integer
		list.add(true);			//boolean의 래퍼클래스인 Boolean
		list.add(Math.PI);		//double의 래퍼클래스인 Double
		list.add('A');			//char의 래퍼클래스인 Character
		list.add(new Car01());	//Car01
		
		//출력
		//for( 데이터타입  변수명 :배열명 또는  컬렉션명 ) {}
		for( Object obj : list ) {
			System.out.println(obj);
		}
		/*출력 결과
		 문자열
		 1
		 true
		 3.141592653589793
		 A
		 ch07.Car01@15db9742
		 */
		
	}

}

















