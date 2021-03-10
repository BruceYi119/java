package test.q1.Suyeon;

public class PrinterExample {

	public static void main(String[] args) {
		Printer p = new Printer();
		//comment: 아래 코드에서 출력하는 부분이 공통적이라면
		//Printer클래스의 메소드 블럭안에  출력문을 포함시키는 것도  한가지 방법입니다
		/*예)
		 * String println(String s){
			System.out.println(s);
		}
		 */
		System.out.println(p.println(10));
		System.out.println(p.println(true));
		System.out.println(p.println(5.7));
		System.out.println(p.println("홍길동"));
	}

}
