package jdbc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T {

	public static void main(String[] args) {
	
		double pi = Math.PI;
		System.out.println("pi="+pi);//pi=3.141592653589793
		
		System.out.println( Math.round(pi)  );//?
		System.out.println( Math.round(pi*100)  );//314
		System.out.println( Math.round(pi*100)/100.0  );
		//3.14
		//소수점 3번째자리에서 반올림하여 2째자리까지 출력
		
		System.out.println( Math.round(pi*1000) );//3142
		System.out.println( Math.round(pi*1000)/1000.0 );
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력:");
		String str=sc.nextLine(); //String으로 입력값을 받는다
		int    n =Integer.parseInt(str); //String을 int로 변환
		System.out.println((n+1));
		//System.out.println((str+1));
		System.out.println("-----------------");
		System.out.print("입력:");
		int s = sc.nextInt(); //입력받은 String을 int로변환
		System.out.println((s+1));
	}

}





