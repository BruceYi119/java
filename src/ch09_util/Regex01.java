package ch09_util;

import java.util.regex.Pattern;

//정규식을 활용한 email, 전화번호 유효성 검사

//정규식(Regular Expression)-정규표현식. 교재p505
//java.util.regex.Pattern클래스
//Pattern.matches("정규식", "검증할 데이터") : 문자열을 정규표현식으로 검증하는 기능

/*참고 
 * 주로 패턴(pattern)으로 부르는 정규 표현식은 
 * 		특정 목적을 위해 필요한 문자열 집합을 지정하기 위해 쓰이는 식이다.
 * 정규 표현식이라는 문구는
 * 		 일치하는 텍스트가 준수해야 하는 "패턴"을 표현하기 위해 
 * 		특정한 표준의 텍스트 신택스를 의미하기 위해 사용된다. 
 * 정규 표현식의 각 문자(즉, 패턴을 기술하는 문자열 안의 각 문자)는 
 * 		메타문자(특별한 의미로)로 이해되거나 
 * 	정규 문자('문자 그대로', 즉 '리터럴'의 의미로)로 이해된다.
 */
public class Regex01 {

	public static void main(String[] args) {
		String emailData = "HOng123@testQ1.co.org";
		String regExp0   = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		//   \w		=> word.  알파벳대소문자 A-Za-z  숫자0-9   _문자
		//	+		=> 1번이상
		//	\w+     => 알파벳대소문자 또는 숫자가 1번이상 
		// @		=> @문자
		// \.       => .문자
		// ?		=> 0번 또는 1번
		//(\\.\\w+)?=> .뒤에  알파벳대소문자숫자 1개이상으로  된  문자가  1또는 생략
		
		
		boolean result0 = Pattern.matches(regExp0, emailData);
		if(result0) {
			System.out.println("정규식과 일치한다");
		}else {
			System.out.println("정규식과 일치x");
		}
		System.out.println();
		
		String tel = "02-111-1234";
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		//02|010   	=> 02 또는 010
		//-			=>  -문자
		//  \d		=> digit을 의미. [0-9]와 동일
		//{3,4}		=> 3자리~4자리
		// \d{3,4}  => 숫자가 최소 3글자~최대 4글자 가능 
		//{4}		=> 4자리
		
		boolean result = Pattern.matches(regExp, tel);
		if(result) {
			System.out.println("정규식과 일치한다");
		}else {
			System.out.println("정규식과 일치x");
		}
		
	}

}









