package ch06;

public class ReferenceParmEx {

	public static void main(String[] args) {
		Data1 d = new Data1(); //d는 heap영역에 생성된 객체의 주소가 저장된 참조변수
		System.out.println("참조변수 d="+d);
		d.x=10;//참조변수안에 저장된 주소를 참조(reference)하여  해당 클래스의 필드,메소드를 접근할 수 있다
		System.out.println("change()호출전 d.x="+d.x);
		
		change(d);//함수호출
		System.out.println("change()호출후의   d.x="+d.x);//1000
	}

	                  //ch06.Data1@15db9742
	static void change(Data1 d) {//change(참조타입 참조매개변수) { //d=ch06.Data1@15db9742
		System.out.println("change(Data1 d) d="+d);
		d.x = 1000;
		System.out.println("change()호출성공 참조매개변수d.x="+d.x);//1000
	}

}

class Data1{
	int x; //인스변수변수
}








