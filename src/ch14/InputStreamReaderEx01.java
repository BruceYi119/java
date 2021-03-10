package ch14;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

//문자변환  보조스트림
//public class InputStreamReader  extends Reader
//An InputStreamReader is a bridge from byte streams to character stream
public class InputStreamReaderEx01 {

	public static void main(String[] args) throws Exception {
		//참고     콘솔(console, 화면)을 통한 데이터의 입출력을 ‘표준 입출력’이라 한다.
		// System.in   : 콘솔(console, 화면)을 통한 데이터의 입력
		// System.out  : 콘솔(console, 화면)을 통한 데이터의 출력력

		///public static final InputStream in
		InputStream is = System.in;
		
		//InputStreamReader(InputStream in)
		Reader reader = new InputStreamReader(is);//문자변환  보조스트림
		
		char[] cbuf = new char[100];
		int readCharNum;
		while((readCharNum = reader.read(cbuf))!=-1) {  //전부 읽는 동안
			String data = new String( cbuf, 0,  readCharNum );//문자열로 변환
			System.out.println(data);//콘솔에 출력
		}
		
		reader.close();//자원해제
	}

}










