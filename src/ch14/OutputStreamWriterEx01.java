package ch14;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

//OutputStreamWriter: 바이트 출력스트림을   -> 문자 출력스트림으로 변환
public class OutputStreamWriterEx01 {

	public static void main(String[] args) throws Exception {
		//public class FileOutputStream extends OutputStream
		//FileOutputStream(String name)
		//OutputStreamWriter(OutputStream out)
		
		FileOutputStream fos = new FileOutputStream("C:\\Temp\\file.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		writer.write("바이트 출력스트림을   -> 문자 출력스트림으로 변환");
		
		writer.flush();
		writer.close();
		
		System.out.println("done");
	}

}







