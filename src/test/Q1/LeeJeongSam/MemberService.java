package test.q1.LeeJeongSam;

public class MemberService {

	private String id="홍길동";
	private String pw="12345";
	
	public void login(String id, String pw) {
		
		if(id.equals(this.id)&&pw.equals(this.pw)){
			System.out.println("로그인 되었습니다");
			return;
		}else {
			System.out.println("ID 또는 Password가 올바르지 않습니다.");
			return;
		}
	}
	
	public void logout(String id) {
		if(id.equals(this.id)) {
			System.out.println("로그아웃 되었습니다");
			return;
		}
	}
	
	
}
