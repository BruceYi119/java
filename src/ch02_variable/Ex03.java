package ch02_variable;

//[Java의정석]ch2_변수.ppt참고
//혼공자바_02_1(최종).pptx참고

//기본타입(Primitive type)=원시타입 8가지 암기
//기본타입이란 정수,실수,문자,논리 리터럴을 직접 저장하는 타입을 말한다
// 정수 : byte(1)< short(2)< int(기본,4byte)< long(8)
// 실수 : float(4)< double(기본,8byte)
// 문자 : char
// 논리 : true, false

//메모리에는 0과 1을 저장하는 최소 기억단위인 bit가 있다
//8개의 bit를 묶어서 byte라고 한다
//기본 타입은 정해진 메모리 사용크기(바이트크기)로 값을 저장한다
//=> 크기라 클수록 표현하는 값의 범위가 크다
// 정수<실수
//byte(1)< short(2)< int(기본,4byte)< long(8)<float(4)< double(기본,8byte)

public class Ex03 {

	public static void main(String[] args) {
		//byte  -2의 7승 		~ 양수2의7승  -1 크기를 갖는다
		//      -128(최소값)  ~ 양수127(최대값)
		byte v1 = -128;
		byte v2 = -1;
		byte v3 = 0;
		byte v4 = 1;
		byte v5 = 127;
		//byte v6 = 128; //컴파일에러발생. Type mismatch: cannot convert from int to byte
		//저장할 수 있는 값의 범위를 넘었기 때문에 에러발생
		
		
		//저장할 수 있는 값의 범위를 초과해서 값이 저장될 경우에는 엉터리 값이 저장되는데 쓰레기값이라고 한다
		byte v7 = 125;
		for(int i=0; i<5; i++) { //5번 반복실행  //++은 1씩 증가
			v7++;
			System.out.println(i+"번째일때 v7값은 "+v7); 
			//126 127 128 129 130예상했지만
			//126 127 -128 -127  -126쓰레기 값이 저장되어 출력되었다
			//최대값인 127을  넘으면 다시 -128부터 시작된다
		}
		
	}

}












