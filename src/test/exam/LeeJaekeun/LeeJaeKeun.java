package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

//PreparedStatement객체 이용
public class LeeJaeKeun {

	public static void main(String[] args) {
		//각종 필요한 변수선언 - 예)conn, stmt, pstmt, rs, sql
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user= "scott";
		String password="tiger";
		Connection conn = null;
		PreparedStatement pstmt = null; //PreparedStatement 객체	
		ResultSet rs= null;
		
		try {
			//1.드라이버 로딩
			Class.forName(driver);
			//2.Connection객체얻기
			conn = DriverManager.getConnection(url, user, password);
			//3-1.실행객체-PreparedStatement객체,Statement객체
			String sql = "SELECT no,writer,title,content,writeDate,hit " + 
					 " FROM board";
			pstmt = conn.prepareStatement(sql);
			//3-2.쿼리문실행 - executeUpdate(): insert,update,delete
			//				executeUpdate()의 리턴형태는 int
			//				executeQuery() : select
			//				executeQuery()의 리턴형태는 ResultSet
			rs = pstmt.executeQuery();
			if(rs!=null) {
				while(rs.next()) {
			//4. 추가작업
					int no = rs.getInt("no");
					String writer = rs.getString("writer");
					String title = rs.getString("title");
					String content = rs.getString("content");
					Date writeDate = rs.getDate("writeDate");
					int hit = rs.getInt("hit");
					System.out.printf("%d %s %s %s %s %d\n",no,writer,title,content,writeDate,hit);
				}
			}
		}catch(Exception e) { 
			System.out.println("쿼리실행관련 에러발생="+e);
		}finally{   
			/*5. 사용한 객체는 반납: 객체.close(); */ 
			try {
	    		if( pstmt!=null ) { pstmt.close();}
	    		if( conn !=null ) { conn.close();}
	    	}catch(Exception e){
	    		e.printStackTrace();
	    	}
		}
	}

}
//쿼리문은 답안지에 있습니다

