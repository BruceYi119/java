package test.q1.KangMinGyu;

public class PrintExample {
	
	public static void main (String[] args) {
		Printer myPrint = new Printer();
		
		//comment: Printer클래스에서 static으로 선언된 메소드인데   참조변수가 필요?
		myPrint.println(10);
		myPrint.println(true);
		myPrint.println(5.7);
		myPrint.println("ȫ�浿");
	}

}
