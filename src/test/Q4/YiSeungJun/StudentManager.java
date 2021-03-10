package test.Q4.YiSeungJun;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;


//comment : db와 연동하셨군요! good!
public class StudentManager {

	private Collection<StudentDTO> list = new ArrayList<StudentDTO>();
	private Iterator<StudentDTO> it;
	private Scanner scan = new Scanner(System.in);
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private String sql = "insert into student values (s_student.nextval, ?, ?, ?, ?)";

	public StudentManager() {}

	public static void main(String[] args) {
		StudentManager sm = new StudentManager();

		sm.run();
	}

	public void run() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			ps = con.prepareStatement("delete from student");
			ps.executeUpdate();

			read();

			sql = "select * from student order by sno";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			while(rs.next())
				list.add(new StudentDTO(rs.getString("name"), rs.getString("department"), rs.getString("id"), rs.getDouble("grade")));
			//comment : 출력하는 부분이 공통적으로 사용되니  승준님께서 사용했듯  메서드로 선언해서 사용하시면 좋아요~. 잘 하셨어요.
			printAll();
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

	//comment : db와 연동하는 부분이  공통적으로 발생되고 있지요?
	//comment : 그 부분도 별도의 메서드로 선언해서 사용하실 수도 있어요  
	private void read() throws SQLException {
		System.out.println("4명의      학생이름,학과,학번,학점평균 형식으로 입력하세요.");

		for (int i=1;i<5;i++) {
			System.out.print("학생" + i + ">>");
			String str = scan.nextLine();
			String[] s;

			if (str != null || str.length() != 0) {
				//comment : String 클래스에서 split()함수가 문자열을 쪼개 배열에 저장해주는 함수였다면, 
				//comment : StringTokenizer 클래스는 보다 간단하게 문자열을 토큰 단위로 나눠주는 함수가 있어요
				//comment : StringTokenizer 클래스를 이용해보세요.
				s = str.split(",");

				if (s.length != 4) {
					//comment : 유효성 검사 좋아요~
					System.out.println("형식에 맞게 입력하세요");
					i--;
					continue;
				}
			} else {
				System.out.println("형식에 맞게 입력하세요");
				i--;
				continue;
			}

			processQuery(s);
		}

		scan.close();
	}

	private void processQuery(String[] s) throws SQLException {
		String name = s[0];
		String department = s[1]; 
		String id = s[2];
		double grade = Double.parseDouble(s[3]);

		ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, department);
		ps.setString(3, id);
		ps.setDouble(4, grade);
		ps.executeUpdate();
	}

	private void printAll() {
		it = list.iterator();

		while(it.hasNext()) {
			StudentDTO s = it.next();

			System.out.println("---------------------------------------");
			System.out.printf("이름:%s\n", s.getName());
			System.out.printf("학과:%s\n", s.getDepartment());
			System.out.printf("학번:%s\n", s.getId());
			System.out.printf("학점평균:%.1f\n", s.getGrade());
			System.out.println("---------------------------------------");		
		}
	}

}