package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

//PreparedStatement객체 이용 : 쿼리문을 미리 전달하여 나중에 실행
public class SelectTest02 {

	public static void main(String[] args) {
		//각종 필요한 변수선언 - 예)conn, stmt, pstmt, rs, sql
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user= "scott";
		String password = "tiger";
		Connection conn = null;
		PreparedStatement pstmt = null; //PreparedStatement객체
		ResultSet rs = null;
		try {
			//1.드라이버 로딩
			Class.forName(driver);
			//2.Connection객체얻기
			conn = DriverManager.getConnection(url,user,password);
			//3-1.실행객체-PreparedStatement객체,Statement객체
			//SELECT mno,mname,mid,mpwd,mdate	 FROM MEMBER
			String sql = "SELECT mno,mname,mid,mpwd,mdate " + 
						 " FROM   MEMBER " + 
						 " ORDER  BY mno desc";
			pstmt = conn.prepareStatement(sql);
			//3-2.쿼리문실행 - executeUpdate(): insert,update,delete
			//				executeUpdate()의 리턴형태는 int
			//				executeQuery() : select
			//				executeQuery()의 리턴형태는 ResultSet
			rs = pstmt.executeQuery();
			if(rs!=null) {
				while(rs.next()) {
					//4. 추가작업  mno,mname,mid,mpwd,mdate
					MemberDTO mDTO = new MemberDTO();
	
					//여기에서는 member테이블의 mno컬럼의 값을 가져와서
					//MemberDTO클래스의 setmNo()메서드 파라미터로 제공하면
					//MemberDTO클래스의 필드에 데이터가 세팅된다
					mDTO.setmNo( rs.getInt("MNO"));
					mDTO.setMname( rs.getString("MNAME") );
					mDTO.setmId( rs.getString("MID") );
					mDTO.setmPwd(  rs.getString("MPWD") );
					mDTO.setDate(  rs.getDate("MDATE")  );
					System.out.println( mDTO.toString() );
					/*jdbc.MemberDTO@1efee8e7
						jdbc.MemberDTO@1ee807c6
						jdbc.MemberDTO@76a4d6c*/
				}
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





