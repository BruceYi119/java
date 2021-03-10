package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

//InputStream(바이트기반 입력스트림의 최고 조상) - 교재p874
/*FileInputStream과 FileOutputStream - 교재p882
	-파일(file)에 데이터를 입출력하는 바이트기반 스트림
*/	


//is.read();//1byte씩 읽어들인다
public class ReadEx01 {

	public static void main(String[] args) {
		InputStream is = null;
		try {
			//FileInputStream fis = new FileInputStream("C:\\Temp\\test.txt");
			is = new FileInputStream("C:\\Temp\\test.txt");
			int readByte;
			while(true) {
				readByte= is.read();//1byte씩 읽어들인다
				if(readByte==-1) break;//더 이상 읽어들일 것이 없으면 -1을 리턴
				System.out.println((char)readByte);//내부적으로  아스키코드값으로 저장되므로
				//콘솔에서 편하게 읽고 싶으면 char로 변환해주면 된다
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}









