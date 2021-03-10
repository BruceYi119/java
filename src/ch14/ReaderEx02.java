package ch14;

import java.io.FileReader;
import java.io.Reader;

/*read(char[] cbuf) :매개값으로 제시한 char배열의 길이만큼 
 * 					char를 읽고 배열에 저장한다
 * 					읽은 char 수를 리턴한다
 * 					char를 더 읽을 수 없다면 -1을 리턴
 */
public class ReaderEx02 {

	public static void main(String[] args) throws Exception{
		Reader rd = new FileReader("C:\\Temp\\test.txt");//qwert12345
		char[] cbuf = new char[2];
		int readCharNum;	//읽어들인 char수를 저장할 변수
		String str = "" ;	//콘솔에 출력할 때 사용할 변수
		while(true) {
			readCharNum = rd.read(cbuf);//매개값으로 제시한 char배열의 길이(2)만큼 char를 읽고
			if(readCharNum==-1) break;
			str += new String(cbuf, 0, readCharNum); //문자열로 만들어서 누적
		}
		System.out.println(str); //콘솔출력
		rd.close();  //자원을 반납
	}

}






