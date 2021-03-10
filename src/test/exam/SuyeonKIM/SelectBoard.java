package test;
//»ç¿ëDBMS:oracle
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectBoard {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user= "scott";
		String password = "tiger";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url,user,password);
	
			String sql = "select no,writer,title,content,writeDate,hit " +
			"from board";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
	
			while(rs.next()) {
				System.out.println(rs.getInt("no")+" "+
						rs.getString("writer")
						+" "+rs.getString("title")+" "+
						rs.getString("content")+" "+
						rs.getDate("writeDate")+" "+rs.getInt("hit"));
				};
		}catch(Exception e) { }
		  finally{   
			try {
				if(pstmt!=null) {pstmt.close();}
				if(conn!=null) {conn.close();}
				}catch(Exception e) {
					e.printStackTrace();
				}
		}
	}	
}
