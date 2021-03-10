package ch02_variable;

//리터럴과 접미사 - [Java의정석]ch2_변수.ppt 12슬라이드
//형변환(Casting) - [Java의정석]ch2_변수.ppt 17슬라이드
//타입 byte1<short2<int4<long8
public class Ex05 {

	public static void main(String[] args) {
		//리터럴과 접미사
		int v   = 10;
		long v0  = 10; //int형 10데이터가 long타입변수로 자동형변환
		
		//long타입변수를 초기화할 때는 정수값뒤에 소문자l 또는 대문자L을 붙일 수 있다
		//4byte정수 데이터가 아니라 8byte정수데이임을 알려준다
		//int타입의 저장범위를 넘어서는 큰 정수에서는 l,L을 붙여야 한다-> 우주,은행권 업무
		long v1 = 10l;
		long v2 = 10L;
		
		//--------------------------------------------------
		//자동형변환 : 	작은 크기타입이   큰 크기타입으로 저장될때.byte1<short2<int4<long8
		byte  b1 = 10;
		int   i1 = b1;  //byte타입 b1이 int형으로 자동형변환
		System.out.println("i1="+i1); //i1=10
	
		char c1 = '가';
		i1 = c1;  //2byte인 char -> int
		System.out.println("i1="+i1); //i1=44032
		
		i1 = 500;
		long l1 = i1; //int->long
		System.out.println("i1="+i1); //i1=500
		
		i1 = 200;
		double d1 = i1; //int->double
		System.out.println("i1="+i1); //i1=200
		System.out.println("---------------------");
		//--------------------------------------------------
		//강제형변환 : 	큰 크기타입의 데이터를   작은 크기타입으로 강제로 저장할 때.
		//  작은타입 변수=(강제형변환타입)변수;
		// 값의 손실이 발생될 수 있으므로 주의.
		int i2 = 44032;
		char c22 = (char)i2;
		System.out.println("i2="+i2); //44032
		System.out.println("(char)i2="+c22); //가
		
		long l22 = 500;
		i2 = (int)l22;
		System.out.println("i2="+i2);//500
		
		double p = 3.14;
		float  f = (float)p;
		System.out.println("f="+f);//3.14
		i2 = (int)p;
		System.out.println("i2="+i2);//3 값의 손실
		
		float a = -10; //정수값을  float타입변수에 할당
		//음수10.0을 정수변수에 할당?
		//int a1 = -10.0; // cannot convert from double to int
		int a2 = (int) -10.0; //강제형변환
		
		double a3 = -10.0; //double타입값을 double형변수에 할당
		float  a4 = (float) -10.0; //double타입값을 float타입으로 강제형변환
		a4 = -10.0F; //리터럴형변환
	}

}











