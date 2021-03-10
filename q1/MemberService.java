package test.q1.YiSeungJun;

public class MemberService {
	//comment: 접근제어자  속성  타입  변수명순으로 작성하도록 합니다
	//예)private final String ID = "hong";
	final private String ID = "hong";
	final private String PASSWORD = "12345";

	public MemberService() {};

	public boolean login(String id, String pass) {
		boolean result = false;

		//comment: 문자열간의 값 비교에서 사용할 때는 ==이 아닌 다른 메소드를 이용합니다. 무엇일까요?
		//comment: 그렇다면 ==은  무엇이 일치하는지 비교할때 사용하는 비교연산자일까요?
		//comment: 비교를 할때는 보통  기준이되는 값을 비교연산자의 왼편에  비교대상이 되는 것을 오른편에 사용합니다
		if (this.ID == id && this.PASSWORD == pass)
			result = true;

		return result;
	}

	public void logout() {
		System.out.println("로그아웃 되었습니다");
	}
}
