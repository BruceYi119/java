package HENRY;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectTest {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			String sql = "select no,writer,title,content,writeDate,hit from board";
					
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs!=null) {
				while(rs.next()) {
					MemberDTO mDTO = new MemberDTO();
					
					mDTO.setmNo(rs.getInt("NO"));
					mDTO.setmWriter(rs.getString("WRITER"));
					mDTO.setmTitle(rs.getString("TITLE"));
					mDTO.setmContent(rs.getString("CONTENT"));
					mDTO.setmwriteDate(rs.getDate("writeDate"));
					mDTO.setmHit(rs.getInt("HIT"));
					System.out.println(mDTO.toString());
				}
			}
		} catch (Exception e) {
			System.out.println("ERROR ON"+e);
		} finally {
			try {
				if(pstmt!=null) {pstmt.close();}
				if(conn!=null) {conn.close();}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
