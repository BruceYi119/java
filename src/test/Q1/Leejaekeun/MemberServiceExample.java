package test.q1.Leejaekeun;

public class MemberServiceExample {
	public static void main(String[] args) {
		//MemberService클래스 객체생성
		MemberService check = new MemberService();
		
		//MemberService의 login()호출결과 받아 result변수에 저장
		boolean result = check.login("hong", 12345);
		System.out.println(check.login("hong", 12345));
		
		//login()의 리턴값에 따라
		/*로그인 성공이면
			"로그인 되었습니다." 출력
			logout()메소드호출
		  로그인 실패이면
			id 또는 password가 올바르지 않습니다. 출력
		*/	
		if(result == true) {
			//comment: 들여쓰기를 해주는 습관을 가지세요
		System.out.println("로그인 되었습니다.");
		check.logout();
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}

class MemberService{
	 boolean login(String id, int password){
		//comment: 문자열간의 값 비교에서 사용할 때는 ==이 아닌 다른 메소드를 이용합니다. 무엇일까요?
		//comment: 그렇다면 ==은  무엇이 일치하는지 비교할때 사용하는 비교연산자일까요?
		//comment: 비교를 할때는 보통  기준이되는 값을 비교연산자의 왼편에  비교대상이 되는 것을 오른편에 사용합니다
		if (id == "hong" && password == 12345) {	
			return true;
		}
		return false;
		
	}
	void logout() {
		System.out.println("로그아웃 되었습니다.");
	}
	
}

