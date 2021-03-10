package test.q1.LeeJeongSam;

public class MemberServiceExample {

	public static void main(String[] args) {

		MemberService m=new MemberService();
		
		m.login("이순신", "12345");
		m.login("홍길동", "123");
		m.login("이순신", "123");
		m.login("홍길동", "12345");
		
		m.logout("홍길동");
		
	}

}
