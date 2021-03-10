package ch03_operator;

//연결연산자 +
//문자열과 숫자가 혼합된 +연산식은      왼쪽에서 오른쪽으로 연산이 진행
//문자열화 된다
public class Ex04 {

	public static void main(String[] args) {
		
		System.out.println("JDK "+8.0); //"JDK " + "8.0" -> "JDK 8.0"
		
		String str = "JDK "+3.0+5.0; //"JDK "+"3.0"+"5.0"->"JDK 3.05.0"
		System.out.println(str);//JDK 3.05.0
		
		System.out.println("JDK "+(3.0+5.0));//"JDK "+(8.0)->"JDK "+"8.0" ->"JDK 8.0"
		
		System.out.println(3.0+5.0+"버전");//8.0+"버전"->"8.0"+"버전"-> "8.0버전"
	}

}








