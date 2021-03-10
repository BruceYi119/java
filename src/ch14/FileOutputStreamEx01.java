package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx01 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("D:\\house.jpg");
			fos = new FileOutputStream("C:\\Temp\\house.jpg");
			
			byte[] b = new byte[100];
			int readBytes;
			while((readBytes = fis.read(b))!=-1) {
				fos.write(b, 0, readBytes);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fos.flush();
				fos.close();
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("finished");
	}

}






