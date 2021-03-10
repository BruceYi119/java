package test.exam.YiSeungJun;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc {

	public static void main(String[] args) {
		double d = 234.4561;
		System.out.println(Math.round(d));

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from board";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			while(rs.next())
				System.out.printf("[%d, %s, %s, %s, %s, %d]\n", rs.getInt("no"), rs.getString("writer"), rs.getString("title"), rs.getString("content"), rs.getDate("writeDate"), rs.getInt("hit"));
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) { rs.close(); }
				if (ps != null) { ps.close(); }
				if (con != null) { con.close(); }
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}