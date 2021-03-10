package ch03_operator;

//논리연산자
//연산자우선순위   1산술 > 비교 > 논리 > 대입꼴등
// T &  T  =>결과  T
// F &  T  => &앞의 결과가 false이더라도  뒤의 결과를 살펴본다
// T && T  =>결과 T
// F && T  => &&앞의결과가 false이면   결과는 무조건 false이므로 뒤의 결과를 보지x=>더 효율적
public class Ex07 {

	public static void main(String[] args) {
		int charCode = 'Q';
		
		if( (charCode>=65)  &  (charCode<=90)) {
			System.out.println("대문자야~");
		}
		
		if(charCode>=97  &&  charCode<=122) {
			System.out.println("소문자~");
		}
		
		if(charCode>=48  &  charCode<=57) {
			System.out.println("숫자라고요~");
		}
		
		
		int num = 6;
		
		if( num%2==0  |  num%3==0) {
			System.out.println(num+"은 2 또는 3의 배수이군요");
		}
		
		if( num%2==0  ||  num%3==0) {
			System.out.println(num+"은 2 또는 3의 배수이군요");
		}
		
	}

}











