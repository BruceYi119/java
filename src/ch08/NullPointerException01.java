package ch08;

/* 에러(error) : 컴H/W의 오동작, 고장으로 인해  응용P/G 실행오류가 발생하는 것
 * 예외(exception) : 사용자의 잘못된 조작  또는  개발자의 잘못된 코딩으로 발생하는  프로그램 오류.
 * 					=>예외가 발생되면  프로그램은 곧바로 종료가 되지만
 * 					  예외처리(exception handling)를   통해  프로그램을 종료하지 않고    
 * 					 정상 실행 상태가 유지되도록 할 수 있다
 * 예외의 종류
 * -일반예외(Exception) : 컴파일예외. 컴파일하는 과정에서 예외처리코드가 필요한지 검사
 * -실행예외(Runtime-Exception) : 예외처리코드가 필요한지 검사하지 않기 때문에  실행시 주로 발견.
 * 
 * => 자바에서는 예외를  클래스로 관리.
 * 	  JVM은  프로그램을 실행하는  도중에   예외가 발생하면  해당 예외 클래스로 객체를 생성한다.
 *    그 후에  예외처리코드에서  예외객체를 이용할 수 있도록 해준다.
 */

/*NullPointerException - 객체 참조가 없는 상태
 * 즉 null값을   갖는    참조변수로   객체접근자 연산자인.을 사용했을 때 발생
 * 해결방법?  주소를 주자
*/
public class NullPointerException01 {

	public static void main(String[] args) {
		String data =  null;
		//해결방법 : data = new String("자바");
		System.out.println(data.toString());
		/*Exception in thread "main" java.lang.NullPointerException
	at ch08.Exception01.main(Exception01.java:20)*/
	}

}












