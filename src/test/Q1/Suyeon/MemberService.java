package test.q1.Suyeon;

public class MemberService {
	
	boolean login(String id, String pw){
		//comment: 문자열간의 값 비교에서 사용할 때는 ==이 아닌 다른 메소드를 이용합니다. 무엇일까요?
		//comment: 그렇다면 ==은  무엇이 일치하는지 비교할때 사용하는 비교연산자일까요?
		//comment: 비교를 할때는 보통  기준이되는 값을 비교연산자의 왼편에  비교대상이 되는 것을 오른편에 사용합니다
		if(id=="hong"&& pw=="12345") {
			System.out.println("로그인 되었습니다.");
			return true;
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
			return false;
		}
	}
	void logout() {
		System.out.println("로그아웃 되었습니다.");
	}
}
