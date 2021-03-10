package ch14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx01 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Temp\\file.txt");
		//FileWriter fw = new FileWriter(file); 
		//파일이 이미 존재하는 경우, 그 파일을 덮어쓰게 된다
		
		FileWriter fw = new FileWriter(file,true);
		//true를 주면  파일 끝에  추가한다
		
		fw.write("q w e r t \r\n");
		fw.write("12345"+"\r\n");
		fw.write("한글");
		fw.flush();
		fw.close();
		System.out.println("saved");
	}

}






