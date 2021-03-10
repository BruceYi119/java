package ch03_operator;

import ch02_variable.Ex06;

//문자열비교    ★★★★★
//== 주소비교
//문자열.equals(비교문자열)  값비교

//객체 생성과 관련된   내용은       [Java의정석]ch6_1_객체지향개념1.ppt의  11슬라이드 참고하세요
public class Ex06_star {

	public static void main(String[] args) {
		
		Ex06  obj1 = new Ex06();
		Ex06  obj2 = new Ex06();
		System.out.println("obj1="+obj1);//obj1=ch02.Ex06@15db9742  주소출력
		System.out.println("obj2="+obj2);//obj2=ch02.Ex06@6d06d69c
		//------------------------------------------------------------
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		String str4 = new String("홍길동");
		
		System.out.println("str1="+str1);
		System.out.println("str2="+str2);
		if(str1==str2) { //조건을 충족하면 실행
			System.out.println("str1과 str2는   일치한다");
		}else { //조건이 참이 아닌 경우
			System.out.println("str1과 str2는   일치x");
		}
		System.out.println("------------------------");
		
		//== 주소비교
		if(str3==str4) { //조건을 충족하면 실행
			System.out.println("str3과 str4는   주소일치한다");
		}else { //조건이 참이 아닌 경우
			System.out.println("str3과 str4는   주소일치x");//출력
		}
		
		//문자열.equals(비교문자열)  값비교
		if(str3.equals(str4)) { //조건을 충족하면 실행
			System.out.println("str3과 str4는   값이 일치한다");
		}else { //조건이 참이 아닌 경우
			System.out.println("str3과 str4는   값이 일치x");
		}
		
	}
}








