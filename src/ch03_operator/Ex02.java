package ch03_operator;

//증감연산자 - [Java의정석]ch3_연산자.ppt 슬라이드9 참고
/*증가연산자(++) : 피연산자의 값을 1 증가시킨다.
  감소연산자(--) : 피연산자의 값을 1 감소시킨다.
  
  전위형   ++i    값이 참조되기 전에 증가시킨다
  후위형   i++    값이 참조된 후에 증가시킨다
*/
public class Ex02 {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("---------------");
		x++;
		++x;
		System.out.println("x="+x); //12
		
		System.out.println("---------------");
		y--;
		--y;
		System.out.println("y="+y);// 8
		
		System.out.println("---------------");
		z=x++;
		System.out.println("z="+z);//  12
		System.out.println("x="+x);// 13
		
		System.out.println("---------------");
		z=++x;
		System.out.println("z="+z);// 14
		System.out.println("x="+x);// 14
		
		System.out.println("---------------");
		z=++x + y++;   //z=15+8
		System.out.println("z="+z);// 23
		System.out.println("x="+x);//15 
		System.out.println("y="+y);//9
	}

}




