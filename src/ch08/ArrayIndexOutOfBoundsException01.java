package ch08;

/*ArrayIndexOutOfBoundsException
 * 원인 : 배열(array)에서  인덱스 범위를 초과(IndexOutOfBounds)하여  사용한  경우  
 * 해결방법 : 인덱스 범위를 초과하지 말자
 * 			배열값을  읽기  전에   배열의 길이를 먼저 조사한다
 * 			=> 실행 매개값이  없거나  부족할  경우  조건문을 이용해서   사용자에게 실행 방법을 알려준다
 */
 
//실행에러의 대표적인 예 : ArrayIndexOutOfBoundsException
public class ArrayIndexOutOfBoundsException01 {

	public static void main(String[] args) {
		//해결방법
		if(args.length==2) {			
			String data0 = args[0];//에러발생
			/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
	at ch08.ArrayIndexOutOfBoundsException01.main(ArrayIndexOutOfBoundsException01.java:10)
			 */
			String data1 = args[1];
			
			System.out.println("args[0]="+data0);
			System.out.println("args[1]="+data1);
		}else {
			System.out.println("실행방법");
			System.out.println("데이터를 2개이상 주세요");
		}
		
	}

}






