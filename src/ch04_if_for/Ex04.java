package ch04_if_for;

//switch문
// switch문의 매개변수타입은   숫자(byte,short,int,long), char타입, 
// String타입은 자바7부터  사용가능
public class Ex04 {

	public static void main(String[] args) {
		char grade = 'A';
		switch(grade){
		case 'A': 
		case 'B': 
			System.out.println("우수회원");
			break; //switch문을 벗어나라
		case 'C': 
		case 'D': 
			System.out.println("일반회원");
			break;	
		default: System.out.println("손님");								
		}
	}

}



