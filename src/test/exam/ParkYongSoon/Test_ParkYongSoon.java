package test.exam.ParkYongSoon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class Test_ParkYongSoon {

	/* 테이블 쿼리문
	CREATE TABLE BOARD(
	NO NUMBER(4) CONSTRAINT BOARD_NO_PK PRIMARY KEY,
	WRITER VARCHAR2(100) NOT NULL,
	TITLE VARCHAR2(300) NOT NULL,
	CONTENT VARCHAR2(3000) NOT NULL,
	WRITEDATE DATE DEFAULT SYSDATE,
	HIT NUMBER(10) DEFAULT 0
	);
	*/
	
	public static void main (String[] arg)
	{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user= "scott";
		String password="tiger";
		
		try {
		
		//1. 드라이버 로딩
		Class.forName(driver);
		
		
		//2. Connection 객체 얻기
		conn = DriverManager.getConnection(url, user, password);
		

	
		//3-1. 실행객체 생성
		String sql = "select * from board"; 
			
		pstmt = conn.prepareStatement(sql);
		
		//3-2. 쿼리문 실행

		rs = pstmt.executeQuery();
	
	    //콘솔에서 출력하기
		if(rs != null) 
		{
			    while(rs.next())
			    {
			    	//select 문의 컬럼 순서를 제시
			     	int bno   = rs.getInt(1); //select문의 첫번째 컬럼인 empno의 값을 가져옴
			    	String bwriter    = rs.getString(2);
			    	String btitle     = rs.getString(3);
			    	String bcontent   = rs.getString(4);
			    	Date   writeDate  = rs.getDate(5);
			    	int    hit        = rs.getInt(6);
			    	System.out.println(bno + "\t"+ bwriter + "\t" + btitle +"\t"+bcontent+"\t"+writeDate+"\t"+hit);
			    }
		}
		//4. 기타작업
		
		}catch(Exception e)
		{
		    e.printStackTrace();
		}finally {   
    	
    	//5. 사용한 객체 자원 반납 : 객체.close();
    	           try {
                           if(pstmt != null) {pstmt.close();}
         
                           if(conn != null)  {conn.close();}
 
                           
    	                }catch(Exception e) 
    	                    {
    		                   e.printStackTrace();
    	                    }
	          	}//반납 finally 끝
		
	}
}
