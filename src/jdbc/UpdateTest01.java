package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//PreparedStatement객체 이용 :
public class UpdateTest01 {

	public static void main(String[] args) {
		//각종 필요한 변수선언 - 예)conn, stmt, pstmt, rs, sql
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user= "scott";
		String password = "tiger";
		Connection conn = null;
		PreparedStatement pstmt = null; //PreparedStatement객체
		
		try {
			//1.드라이버 로딩
			Class.forName(driver);
			//2.Connection객체얻기
			conn = DriverManager.getConnection(url, user, password);
			
			//3-1.실행객체-PreparedStatement객체,Statement객체
			String sql = "UPDATE  emp " + 
						 " SET    sal=sal+100 " + 
						 " WHERE  EMPNO=8001";
			pstmt = conn.prepareStatement(sql);
			
			//3-2.쿼리문실행 - executeUpdate(): insert,update,delete
			//				executeUpdate()의 리턴형태는 int
			//				executeQuery() : select
			//				executeQuery()의 리턴형태는 ResultSet
			int cnt =pstmt.executeUpdate();
			
			//4. 추가작업
			if(cnt>0) {
				System.out.println("update되었습니다");
			}else {
				System.out.println("update x");
			}
			
		}catch(Exception e) {  
			System.out.println("쿼리실행관련 에러발생="+e);
		}finally{   
			/*5. 사용한 객체는 반납: 객체.close(); */ 
			try {
				if( pstmt!=null ) { pstmt.close(); }
				if( conn !=null ) { conn.close();  }
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
	}

}
