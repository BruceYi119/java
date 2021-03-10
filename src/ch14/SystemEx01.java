package ch14;

import java.io.InputStream;

//System.in, System.out, System.err
//  - 콘솔(console, 화면)을 통한 데이터의 입출력을 ‘표준 입출력’이라 한다.
//  - JVM이 시작되면서 자동적으로 생성되는 스트림이다.

public class SystemEx01 {

	public static void main(String[] args) throws Exception {
		//System클래스의 in필드는  static InputStream 로 선언되어있다
		//public static final InputStream in
		InputStream is = System.in;
	
		byte[] datas = new byte[100];
		
		System.out.print("이름:");
		int nameBytes = is.read(datas); //실제로 읽은 바이트 수 저장
			
		String name = new String(datas, 0, nameBytes);
		//-2를 한 이유는 캐리지리턴(13),라인피드(10)을  문자열에서 제외
		//System.out.print(name.getBytes().length);
		
		System.out.print("입력한 이름은 :"+name);
	}

}







