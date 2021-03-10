package test.q1.JinWooRam;

public class MemberserviceExample {

	public static void main(String[] args) {
		MemberService m = new MemberService();//MemberService클래스 객체생성
		
				
		//MemberService의 login()호출결과 받아 result변수에 저장
				
			//boolean result = m.login("hello","12345");
			/*if(m.login("hello","12345")) {
				
				System.out.println("로그인이 되었습니다.");
			}else {
			System.out.println("id또는 password가 올바르지 않습니다");
			}
			//result = m.login("hong","12345");
			if(m.login("hong","12345")) {
				
				System.out.println("로그인이 되었습니다.");
			}else {
			System.out.println("id또는 password가 올바르지 않습니다");
			}*/
			m.login("hello","12345");
			m.login("hong","12345");
			
			m.logout();

		
		
		//login()의 리턴값에 따라
		/*로그인 성공이면
			"로그인 되었습니다." 출력
			logout()메소드호출
		  로그인 실패이면
			id 또는 password가 올바르지 않습니다. 출력
		*/	

	}

}
