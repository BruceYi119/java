package ch05_array;

//사용자 입력받기 - 커맨드라인을 이용하면
// 프롬프트창에서 실행시에서는>java Ex06 홍의장군 123 "hellow world"
// eclipse에서 실행시에는   >run configuration의 arguments탭에서 
//						홍의장군 공백입력 123 공백입력 "hellow world" 입력
//						또는 
//						홍의장군 enter 123 enter "hellow world" 입력
//				   => 공백이 포함된 문자열은 "큰따옴표"로 묶어야 한다

//-[Java의정석]ch5_배열 - 슬라이드14, 교재 p211 참고
public class Ex06 {
 
	public static void main(String[] args) {//진입함수
		System.out.println("args[0]="+args[0]);
		System.out.println("args[1]="+args[1]);
		System.out.println("args[2]="+args[2]);
		
		System.out.println("------------------");
		
		//함수호출(p254) : 함수명();
		showMsg("유관순","대한독립 만세~~~~");
		showMsg("이순신");
		showMsg();
	}
	
	//메소드(함수)선언(p252)
	//함수종류4개중에서 2개
	//메소드 오버로딩(overloading- 교재p283)
	public static void showMsg(String name, String msg) {
		System.out.println(name+"님의 메세지는 "+msg);
	}
	
	public static void showMsg(String name) {
		System.out.println(name+"님 환영해요!");
	}
	
	public static void showMsg() {
		System.out.println("showMsg()메소드 호출성공!");
	}
	
}














