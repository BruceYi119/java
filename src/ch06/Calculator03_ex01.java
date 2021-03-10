package ch06;

//클래스멤버를 사용할 때에는  클래스명.필드명,  클래스명.메소드명();
public class Calculator03_ex01 {

	public static void main(String[] args) {
				
			double result = Calculator03.pi*10*10; //클래스명.필드명;
			System.out.println("result="+result);
			System.out.println( Calculator03.plus(10, 100));//클래스명.메소드명();
			System.out.println( Calculator03.minus(1, 2));
	}

}


