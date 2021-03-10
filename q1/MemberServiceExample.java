package test.q1.YiSeungJun;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService m = new MemberService();

		if (m.login("둘리", "호잇호잇"))
			System.out.println("로그인 되었습니다.");
		else
			System.out.println("id 또는 password가 올바르지 않습니다.");

		if (m.login("hong", "12345"))
			System.out.println("로그인 되었습니다.");
		else
			System.out.println("id 또는 password가 올바르지 않습니다.");

		m.logout();
	}

}