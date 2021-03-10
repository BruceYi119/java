package test.q1.Parkjunwoo;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService a = new MemberService();
		if (a.login("hong", 12345))
			System.out.println("로그인 되었습니다.");
		else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
		a.logout();

	}

}
