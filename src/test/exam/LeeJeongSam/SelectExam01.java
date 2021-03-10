package test.exam.LeeJeongSam;

import java.sql.*;

public class SelectExam01 {

	public static void main(String[] args) {

		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			//오라클 jdbc 드라이버 로드
			Class.forName(driver);
			
			//connection 객체 얻기
			conn = DriverManager.getConnection(url,user,password);
			
			//sql 준비
			String sql="select no,writer,title,content,writeDate,hit from board";
			
			//PreparedStatement 객체 준비
			pstmt = conn.prepareStatement(sql);
			
			//쿼리 실행
			rs = pstmt.executeQuery();
			
			//결과값 출력
			if(rs!=null) {
				
				while(rs.next()) {
					
					int no=rs.getInt("no");
					String writer=rs.getString("writer");
					String title=rs.getString("title");
					String content=rs.getString("content");
					Date writedate=rs.getDate("writedate");
					int hit=rs.getInt("hit");

					System.out.printf("%d %s %s %s %s %d\n",no,writer,title,content,writedate,hit);;
					
				}
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {
				
			}
		}
		
	}

}
