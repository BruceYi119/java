package ch14;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

//File - 교재p907
//File클래스를 이용한   파일 및 디렉토리 정보  출력
public class FileEx01 {

	public static void main(String[] args) throws Exception {
		File dir = new File("C:/Temp/Dir");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:\\Temp\\file2.txt");
		
		if( dir.exists()==false ) { dir.mkdirs(); }
		if( file1.exists()==false ) { file1.createNewFile(); }
		if( file2.exists()==false ) { file2.createNewFile(); }
		
		File temp = new File("C:/Temp");
		File[] contents  = temp.listFiles();
		
		//날짜 시간 형식화
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd	a HH:mm");
		
		System.out.println("날짜		시간		형태		크기		이름");
		System.out.println("------------------------------------------------");
		for( File file : contents) {
			//file.lastModified(): File객체의 마지막수정일을 long으로 리턴받음
			//new Date(long) 	 : long타입데이터를  Date(날짜)객체로 생성
			//sdf.format(Date)	 : Date타입데이터를 내가 지정한  형식(format)으로 적용
			System.out.print( sdf.format(new Date( file.lastModified())) );
			// 문서의 마지막수일이  long으로 길게 나와  보기가 힘드므로
			// 내가 보기편한 형식(yyyy-MM-dd	a HH:mm)으로 적용하고 싶은데
			// sdf.format(long)이라는 것은 없고
			// sdf.format(Date)는 있으니
			//long을 new Date(long)을 이용하여 Date객체로 변환 한 것임.
			//이렇게 변환된 Date객체를 sd.format()의  파라미터로 제시하였음
			
			
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t"+file.getName());
			}else {
				System.out.print("\t\t\t"+file.length()+"\t"+file.getName());
			}
			
			System.out.println();
		}
		
	}

}














