package ch10;

import java.text.DecimalFormat;

//java.text.DecimalFormat -교재p540
//	– 숫자의 형식화
public class DecimalFormat01 {

	public static void main(String[] args) {
		DecimalFormat df = null; 
		double num = 1234567.89;
		
		df = new DecimalFormat("#");
		System.out.println( df.format(num) );//
		
		df = new DecimalFormat("#.#");
		System.out.println( df.format(num) );//
		
		df = new DecimalFormat("##########.#####");
		System.out.println( df.format(num) );//
		
		df = new DecimalFormat("###,###.000");
		System.out.println( df.format(num) );//1234567.890
		
		System.out.println();
		//---------------------------------
		df = new DecimalFormat("0");
		System.out.println( df.format(num) );//1234568
		
		df = new DecimalFormat("0.0");
		System.out.println( df.format(num) );//1234567.9
		
		df = new DecimalFormat("0000000000.00000");
		System.out.println( df.format(num) );//0001234567.89000
	}

}








