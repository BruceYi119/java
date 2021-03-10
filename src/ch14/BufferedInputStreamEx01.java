package ch14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//BufferedInputStream과 BufferedOutputStream : 성능향상 보조스트림
//버퍼를 사용했을 때의   성능  비교

public class BufferedInputStreamEx01 {

	public static void main(String[] args) throws Exception{
		
		//public class BufferedInputStream extends FilterInputStream
		//new  BufferedInputStream(InputStream in)
		//버퍼보조스트림   일부사용시
		FileInputStream fis1 = new FileInputStream("D:\\forest1.jpg");
		BufferedInputStream bis1 = new  BufferedInputStream(fis1);
		FileOutputStream fos1 = new FileOutputStream("C:\\Temp\\forest1_copy.jpg");
		
		int data = -1;
		long start = 0;//시작시간
		long end = 0;  //종료시간	
		
		start = System.currentTimeMillis(); //시작시간얻기
		while((data = bis1.read())!=-1) {
			fos1.write(data);
		}
		fos1.flush();
		end = System.currentTimeMillis(); //종료시간얻기
		
		fos1.close();
		bis1.close();
		fis1.close();
		System.out.println("버퍼보조스트림   일부사용-done! : "+(end-start)+"ms");
		
		
		//----------------------------------------------------------
		//버퍼보조스트림   버퍼사용시
		FileInputStream fis2 = new FileInputStream("D:\\forest2.jpg");
		BufferedInputStream bis2 = new  BufferedInputStream(fis2);
		FileOutputStream fos2 = new FileOutputStream("C:\\Temp\\forest2_copy.jpg");
		BufferedOutputStream bos2 = new  BufferedOutputStream(fos2);
		
		start = System.currentTimeMillis(); //시작시간얻기
		while((data = bis2.read())!=-1) {
			bos2.write(data);
		}
		bos2.flush();
		end = System.currentTimeMillis(); //종료시간얻기
		bos2.close();
		fos2.close();
		bis2.close();
		fis2.close();
		System.out.println("BufferedInputStream-done! : "+(end-start)+"ms");
	}

}







