package ch14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderEx03 {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		FileReader rd = new FileReader("C:\\Temp\\test.txt");//qwert12345
		char[] cbuf = new char[4];
		int readCharNum;
		readCharNum = rd.read(cbuf, 1, 2);
		for(int i=0; i<cbuf.length ;i++) {
			System.out.println(cbuf[i]);
		}
		rd.close();
	}

}










