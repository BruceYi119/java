package test.q1.Parkjunwoo;

public class MemberService {
	String Id; //comment:  클래스명을 작성할 때 관례적으로  이름이 대문자로 시작.
	int Pw;
	
	public MemberService() {};
	
	public boolean login(String Id, int Pw) {//comment:  클래스명을 작성할 때 관례적으로  이름이 대문자로 시작.
	boolean result = false;

	//comment: 문자열간의 값 비교에서 사용할 때는 ==이 아닌 다른 메소드를 이용합니다. 무엇일까요?
	//comment: 그렇다면 ==은  무엇이 일치하는지 비교할때 사용하는 비교연산자일까요?
	//comment: 비교를 할때는 보통  기준이되는 값을 비교연산자의 왼편에  비교대상이 되는 것을 오른편에 사용합니다
	if (Id == "hong" && Pw == 12345) {
		result = true;
	}
	return result;//comment: 들여쓰기를 해주는 습관을 가지세요
	}
	public void logout() {
		System.out.println("로그아웃 되었습니다.");
	}

}

