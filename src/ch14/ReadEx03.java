package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx03 {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		InputStream is = new FileInputStream("C:\\Temp\\test.txt");//qwert12345
		byte[] readBytes = new byte[8];
		int readByteNum;
		readByteNum = is.read(readBytes, 2, 3);
		System.out.println("readByteNum ="+readByteNum);
		
		for(int i=0; i<readBytes.length ;i++) {
		 System.out.println((char)readBytes[i]);//---qwe-- 
		}
		
		is.close();
	}

}










