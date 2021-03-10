package test.q1.jiSeungWon;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService m = new MemberService();
		if (m.login("hoog", 12345)) {
			System.out.println("로그인 되었습니다");
			m.logout();
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다");
		}
		
		//comment: 불필요한 공백은 제거하는게 좋아요

	}

}
