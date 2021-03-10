package ch08;

//TryCatchFinally - 
/* try블록에는 예외발생가능성이 있는  코드를 위치시킨다
 * 	  - try블럭에서 예외가 발생하면, 발생한 예외를 처리할 catch블럭을 찾는다.
 */

//일반예외처리 : 컴파일과정에서  예외를 처리할 수 있다
public class TryCatchFinally01 {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String123");
			//Unhandled exception type ClassNotFoundException
			//ClassNotFoundException: java.lang.String123
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			//System.out.println("해당 클래스가  존재하지 않아요 e="+e);//java.lang.ClassNotFoundException: java.lang.String123
			System.out.println("e.getMessage()="+e.getMessage());//java.lang.String123
		}//catch
		System.out.println("catch 블럭 밖");
	}//main

}




















