package junitTest.stringCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class StringCalculatorTest {

	static StringCalculator calc = null;
	
	//Test클래스실행시  가장 처음 딱 한번 호출
	//=>공통적으로 사용이 되는 코드는 @BeforeClass를 이용하면 된다
	//@Test메소드는 매번 Test클래스의 객체를 생성한다
	
	@BeforeClass
	public static void SetUp() {
		System.out.println("@BeforeClass");
		calc = new StringCalculator();
	}
	
	//add()메소드를 테스트하는 test메소드
	/*public int add(int x, int y) {
		return x+y;
	}*/
	@Test
	public void testAdd() {
		System.out.println("@Test-testAdd()");
		//StringCalculator calc = new StringCalculator();
		//calc.add(10, 90); //예상값 100
		//assertEquals(예상값,실제값);
		//assertEquals(1,calc.add(10, 90));
		int result=calc.add(10, 90);
		assertEquals(100,result);//success
	}
	
	@Test
	public void testMinus() {
		System.out.println("@Test-testMinus()");
		//StringCalculator calc = new StringCalculator();
		int result=calc.minus(90, 90);
		assertEquals(0,result);//success
	}

}




