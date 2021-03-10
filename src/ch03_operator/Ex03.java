package ch03_operator;

public class Ex03 {

	public static void main(String[] args) {
		double pi = 3.14;
		pi=1.123;
		pi=-1.12;
		System.out.println("Math.PI="+Math.PI);
		//Math.PI=1.123;//The final field Math.PI cannot be assigned
		long r1 = Math.round(Math.PI);
		System.out.println("r1="+r1);
	}

}
