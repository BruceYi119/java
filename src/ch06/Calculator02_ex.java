package ch06;

public class Calculator02_ex {
	
	public static void main(String[] args) {
		//Cal01 클래스의 객체생성 & 변수에 할당
		//객체변수명
		Calculator01 calc = new Calculator01();
		
		calc.a();
		
		
		
		//Cal01 클래스의 division method 호출 & result 안에 리턴값 저장
		double result = calc.divide(10.86, 6.32);
		System.out.println(result);
		
		int result2 = calc.add(10, 6);
		System.out.println(result2);
		
		calc.powerOn();
		calc.powerOff();
		
		byte x = 10;
		byte y = 90;
		int result3 = 0;
		
		calc.add(x, y);
		//OR
		result3 = calc.add(x,y);
		System.out.println(result3);
		
		
		calc.add(10.9,Math.PI);
		 
		double result4 = 0;
		result4 = calc.add(85.45, 69.52);
		System.out.println(result4);
		
		
		
		
	}
}
