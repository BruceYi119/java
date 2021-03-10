package junitTest.stringCalculator;

import java.util.Scanner;

//소스코드
//문자열 계산기
//사용자가 입력한 문자열값을 이용해서 사칙연산기능 계산기 구현
//10+90입력하면	"10+90"  "10"을 정수화    "+"은 add함수호출    "90"을 정수화
//90-10입력하면	"90-10"  "90"을 정수화    "-"은 minus함수호출    "10"을 정수화
public class StringCalculator {
	
	//입력받는 기능
	public String input() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	//"10 + 90"오면 문자열분해  "10" "+" "90"
	public String[] splitString(String msg) {
		String[] str = msg.split(" ");
		//str[0]에는 "10"
		//str[1]에는 "+"
		//str[2] "90"
		
		return str;
	}
	
	public int calculate( String[] str) {
		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[2]);
		int result=add(x,y);//str[1]이 "+"이면
		return result;
		//minus(x,y);
	}
	
	public int add(int x, int y) {
		return x+y;
	}
	
	
	public int minus(int x, int y) {
		return x-y;
	}
	
}









