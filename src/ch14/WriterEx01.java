package ch14;

import java.io.FileWriter;
import java.io.Writer;

//Writer의  	write(char[] cbuf)연습
public class WriterEx01 {

	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:\\Temp\\result.txt");//
		char[]	data = "한글100".toCharArray();
		//	write(int c)연습
		/*for(int i=0; i<data.length ;i++) {
			writer.write(data[i]);
		}*/
		
		writer.write(data); //write(char[] cbuf)연습
		
		writer.flush();
		writer.close();
	}

}





