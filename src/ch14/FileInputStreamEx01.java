package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//FileInputStream -교재p882
//텍스트 파일을 읽고  그 내용을 	콘솔에  출력
public class FileInputStreamEx01 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = 
				new FileInputStream("D:\\javaWK\\pro\\src\\ch02_variable\\Ex01.java");
			
			int data;
			while( (data = fis.read())!=-1 ) {
				System.out.print((char)data);
			}
			
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}










