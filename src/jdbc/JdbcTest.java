package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//JDBC : DB연동여부 테스트
public class JdbcTest {
	//field
	
	//constructor
	//JdbcTest(){ System.out.println("JdbcTest()기본생성자야"); }
	
	//method
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user= "scott";
		String password="tiger";
		
		Connection conn = null;
		Statement stmt = null;
		
		//JdbcTest  jt = new JdbcTest();
		//참조변수.필드
		//참조변수.함수();
		
		//1.JDBC 드라이버 로드
		/*JDBC 드라이버를 로드하기 위해 드라이버 클래스 파일을 로드한다. 
		   자바의 Class 클래스의 forName() 메소드를 이용하면 특정 클래스 파일을 읽어 들일 수 있다.*/
		//mySql이면  Class.forName("com.mysql.jdbc.Driver");
		//Oracle   
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("정상적으로 JDBC 드라이버 로드하였어요");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		//2.자바 응용프로그램과 JDBC의 연결
		/*DriverManager는 자바 응용프로그램을 JDBC 드라이버에 연결시켜주는 클래스이다.
		  DriverManager.getConnection() 메소드를 호출하여 
		   데이터베이스에 연결하고 Connection 객체를 반환한다.
		  Connection java.sql.DriverManager.getConnection(String url, String user, String password)*/
		try {
			 conn = DriverManager.getConnection(url, user, password);
			 System.out.println("Connection얻기 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
		//3.실행할 객체를 생성
		/*자바에서 SQL문을 실행하기 위해서는 Statement 클래스 */
		try {
			stmt = conn.createStatement();
			System.out.println("Statement객체 생성 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		 
	}

}




