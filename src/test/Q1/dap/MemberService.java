package test.q1.dap;


public class MemberService {
	boolean login(String id, String password) {
		if(id.equals("hong1") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
