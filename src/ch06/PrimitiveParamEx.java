package ch06;

//기본형 매개변수와 참조형 매개변수(교재 p263)
//p264예제
public class PrimitiveParamEx {

	public static void main(String[] args) {
		Data d = new Data();//객체생성 //d에는 heap영역에 생성된 객체의 주소가 저장
		System.out.println("d.x="+d.x);  //d.x=0
		
		d.x=10;
		System.out.println("변경 후 d.x="+d.x);
		
		change(d.x);//change(10);//static함수는 static함수를 호출할 수 있다
		//Cannot make a static reference to the non-static method change(int) from the type PrimitiveParamEx
		System.out.println("change()호출후의   d.x="+d.x);
	}
                      //   10 
	static void change(int x){  //x=10
		x=1000;
		System.out.println("change()호출성공 매개변수x="+x);
	}
}

class Data{
	int x;  //x=0;으로 자동초기화 //인스턴스변수
}











