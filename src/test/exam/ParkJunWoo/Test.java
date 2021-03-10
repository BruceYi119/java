package test1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			String sql = "select bno, bwriter, btitle, bcontent, bwriteDate, bhit" + " from board";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
				if(rs != null) {
					while(rs.next()) {
						BoardDTO mDto = new BoardDTO();
						mDto.setmNo(rs.getInt("bno"));
						mDto.setmName(rs.getString("bwriter"));
						mDto.setmId(rs.getString("btitle"));
						mDto.setmName(rs.getString("bcontent"));
						mDto.setmDate(rs.getDate("bwriteDate"));
						mDto.setmNo(rs.getInt("bhit"));
						
						System.out.println(mDto.toString());
					}
				}
			}catch(Exception e) {
				System.out.println("에러" + e);
			}finally {
				try {
					if(pstmt != null) {pstmt.close();}
					if(conn != null) {conn.close();}

				}catch(Exception e) {
					e.printStackTrace();
				}
			}


		}

	}
