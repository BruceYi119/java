package ch11;

import java.util.Vector;

//Vector
public class Vector01 {

	public static void main(String[] args) {
		//Vector(int initialCapacity)  : initial capacity가 채워지면  2배씩 증가
		//Vector vt1 = new Vector(20);
		
		//Vector(int initialCapacity, int capacityIncrement)
		// initial capacity가 채워지면  capacityIncrement씩   증가
		Vector vt1 = new Vector(20,2);
		
		System.out.println("벡터의 capacity()="+vt1.capacity());//20
		System.out.println("벡터의 size()="+vt1.size());//0
		System.out.println();
		
		//객첵를 삽입
		for(int i=1; i<32; i++) {
			vt1.add("내용"+i); //31개의 객체가 삽입되면서

		}
		
		System.out.println("벡터의 capacity()="+vt1.capacity());//32
		System.out.println("벡터의 size()="+vt1.size());//31
		System.out.println();
		
		//데이터 가져오기
		for(int i=0; i<vt1.size(); i++) {
			Object obj = vt1.get(i);
			System.out.println(obj);
		}
		
		
		
		System.out.println("--------------------------------");
		// internal data array has size 10
		// capacity가 채워지면  2배씩 증가
		Vector vt = new Vector();
		
		System.out.println("벡터의 capacity()="+vt.capacity());//10
		System.out.println("벡터의 size()="+vt.size());//0
		System.out.println();
		
		//객첵를 삽입
		for(int i=1; i<26; i++) {
			vt.add("제목"+i); //25개의 객체가 삽입되면서
			//초기 capacity 10 -> 제목1...제목10  =>size 10
			//초기 capacity을 채우고  2배로 증가되어서   capacity 10
			//capacity 10 을 채우고 2배로 증가되어서   capacity 20
		}
		
		System.out.println("벡터의 capacity()="+vt.capacity());//20
		System.out.println("벡터의 size()="+vt.size());//25
		System.out.println();
	}

}









