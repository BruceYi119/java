package test.exam.KangMinGyu;

import java.sql.*;

public class Select_Board {

	public static void main(String[] args) {
		//각종 필요한 변수선언 - 예)conn, stmt, pstmt, rs, sql
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user ="scott";
		String password="tiger";	
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//1.드라이버 로딩
			Class.forName(driver);
			System.out.println("드라이버로딩 완료");
			//2.Connection객체얻기
			conn = DriverManager.getConnection(url,user,password);
			System.out.println("Connection 객체 얻기 성공");
			//3-1.실행객체-PreparedStatement객체,Statement객체
			String sql = "select no,writer,title,content,writedate,hit from board";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			if(rs!=null) {
				while(rs.next()) {
					Board bDTO = new Board();
					bDTO.setNo(rs.getInt("no"));
					bDTO.setWriter(rs.getString("writer"));
					bDTO.setTitle(rs.getString("title"));
					bDTO.setContent(rs.getString("content"));
					bDTO.setWriteDate(rs.getDate("writedate"));
					bDTO.setHit(rs.getInt("hit"));
					System.out.println(bDTO.toString());
				}
			}
		}catch(Exception e ) { 
		}finally { 
			try {
				if(pstmt!=null) {
					pstmt.close();
				}
				if(conn!=null) {
					conn.close();
					}
				}catch(Exception e) {
					e.printStackTrace();
		}
	}
}
}
