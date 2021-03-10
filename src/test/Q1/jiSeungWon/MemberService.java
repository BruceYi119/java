package test.q1.jiSeungWon;

public class MemberService {
	//field
	String id;
	int password;
	
	//constructor
	
	
	//method
	//comment: 문자열간의 값 비교에서 사용할 때는 ==이 아닌 다른 메소드를 이용합니다. 무엇일까요?
	//comment: 그렇다면 ==은  무엇이 일치하는지 비교할때 사용하는 비교연산자일까요?
	boolean login(String inputid, int inputpassword) {
		if (inputid=="hong" && inputpassword==12345) {
			return true;
		} else {
			return false;
		}
		
	}
	void logout() {
		this.id = null;
		this.password = 0;
		System.out.println("로그아웃 되었습니다");
		
	}

}
