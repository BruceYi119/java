package ch02_variable;

//[Java의정석]ch2_변수.ppt참고
//혼공자바_02_1(최종).pptx참고

// 변수선언과 초기화
// 변수란? 어떤 데이터가 저장되는 메모리상의  이름
public class Ex01 {

	public static void main(String[] args) {
		// 커서있는 줄line삭제 단축키 :ctrl+D
		// 변수선언 =>데이터타입  변수명; 
		int  value;
		// 변수에 초기값 할당	=> 변수명=값;
		value = 10;
		
		// 정수 10을 변수 value1의 초기값으로 저장
		// 변수를 선언하면서 초기값을 할당할 수 있다
		int  value1 = 10;
		
		//value변수값을 읽고 100과 123을 더한 연산을 한다
		//연산의 결과를 변수 result에 할당
		int result = value + 100 +123;
		
		System.out.println(result); //result변수의 값을 출력 
		
	}

}






