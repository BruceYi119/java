package test.q1.JinWooRam;

public class MemberService {

	private final String id = "hong";
	private final String password= "12345" ;
	
	
	public void login(String id,String password){
		boolean result = false;
		
		//문자열간의 값 비교에서 사용할 때는 ==이 아닌 다른 메소드를 이용합니다. 무엇일까요?
		//그렇다면 ==은  무엇이 일치하는지 비교할때 사용하는 비교연산자일까요?
		if(id=="hong"&&password=="12345") {
		
		result = true;
		}
		//return result;
		if(result==true) {
			System.out.println("로그인이 되었습니다.");	
		}else {
			System.out.println("id또는 password가 올바르지 않습니다");
		}
		
	}
	
	public void logout() {
		
		System.out.println("로그아웃 완료하였습니다.");
	}
	
}
