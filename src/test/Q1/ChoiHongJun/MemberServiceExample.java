package test.q1.ChoiHongJun;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService ms = new MemberService();
		
		//comment : 우리가 평상시 로그인할 때 id와 비번을 입력하잖아요
		//			그것은 코드로 표현하면  login()함수를 호출하여 실행할 때
		//			유저가 입력한 값을  넣어줄수 있도록
		//			매개변수가 있는 함수로 구현하는 것이 좋답니다
		//			예) 		login(String id, String password)로 선언하면
		//			   호출시	login("hong", "12345")
		//		   	   호출시	login("gil",  "123")
		//	   	 	   호출시	login("hgd",  "qwert") 등등 으로 편하게 사용할 수 있답니다
		ms.login();
		
		ms.logout();
				
				
	}

}
