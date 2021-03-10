package ch08;

/*다중catch
 * try 블럭 내부에는 다양한   종류의 예외가 발생할 수 있다
 * 예외별로  예외처리코드를    다르게 하려면    어떻게? 답은 다중catch를 이용하자
 */

public class CatchException01 {

	public static void main(String[] args) {
		try {
			String data0 = args[0];//에러발생
			String data1 = args[1];
			System.out.println("args[0]="+data0);
			System.out.println("args[1]="+data1);
				
			String data11 = "100";
			String data22 = "a100";
			int value11 = Integer.parseInt(data11);
			int value22 = Integer.parseInt(data22);
			int result22 = value11+value22;
			System.out.println(value11+"+"+value22+"="+result22);
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			
		//}catch(ArrayIndexOutOfBoundsException e) {
			//Unreachable catch block for ArrayIndexOutOfBoundsException. 
			//It is already handled by the catch block for Exception
			System.out.println("배열관련에러 발생");	
			e.printStackTrace();
		//}catch(NumberFormatException e) {
			//Unreachable catch block for NumberFormatException. 
			//It is already handled by the catch block for Exception
			System.out.println("NumberFormatException관련에러");
		}catch(Exception e) {
			System.out.println("Exception e");
		}finally {
			//catch절에  들어가던,  그렇지 않던지   무조건 실행된다
			System.out.println("fianlly블럭  이예요");
		}
		
	}

}










