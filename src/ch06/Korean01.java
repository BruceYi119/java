package ch06;

//constructor (생성자) - 교재p291참고
/*필드의 초기화
	클래스로부터 객체가 생성될 때 필드는 기본 초기값으로 자동 설정된다.
	예) int -> 0, double->0.0, String-> NULL
	
	만약 다른 값으로 초기화하고 싶다면 2가지 방법이 있다
	방법1. 필드를 선언할 때 초기값을 주기
		-> 동일한 클래스로부터 생성되는 객체들은 모두 같은 데이터값을 가지게 된다
		   (물론 객체 생성후 변경가능하다(아래코드에서는 setName()))	
	방법2. 생성자에서 초기값을 주기
		-> 생성자 오버로딩을 이용
			이때, 생성자 오버로딩을 하면 기본생성자는 없어지므로
				  필요시 명시적으로 선언해야 함을 주의!
 */
public class Korean01 {
	
	//field
	//[접근제어자] [속성] 데이터타입 변수명;
	String nation = "대한민국"; //방법1. 필드를 선언할 때 초기값을 주기
	String name; //인스턴스변수, 전역변수
	String ssn;
	int age;
	
	//constructor
	//[접근제한자] 클래스명(매개변수리스트) {}
	//생성자는 인스턴스변수를 초기화하는 역할
	Korean01(){
		System.out.println("기본생성자야~");
		System.out.println("nation="+nation);
		System.out.println("age="+age);
		System.out.println("---------------------");
	}
	
	
	//매개변수가 있는 생성자-------------------------
	//객체생성시 데이터를 제시하면 그 데이터를 받아서 인스턴스변수를 초기화하는 역할
	//생성자 오버로딩-방법2. 생성자에서 초기값을 주기
	Korean01(String kname){
		System.out.println("매개변수 한개짜리 생성자kname="+kname);
		name = kname; //인스턴스변수 초기화
		System.out.println("field name="+name);
		System.out.println("---------------------");
	}
	
	Korean01(int kage){
		System.out.println("매개변수 한개짜리 생성자kage="+kage);
		age = kage; //인스턴스변수 초기화
		System.out.println("field age="+age);
		System.out.println("---------------------");
	}
	
	Korean01(String kname, String kssn){
		System.out.printf("매개변수 두개짜리 생성자 %s %s\n",kname,kssn);
		name = kname;
		ssn  = kssn;
		System.out.printf("field name=%s ssn=%s\n\n",kname,kssn);
	}
	
	Korean01(String kname, String kssn, int kage){
		System.out.printf("매개변수 세개짜리 생성자 %s %s %d\n",kname,kssn, kage);
		name = kname;
		ssn  = kssn;
		age  = kage;
		System.out.printf("field name=%s ssn=%s age=%d\n\n",kname,kssn, kage);
	}
	
	//method
	//[접근제어자] [속성] 리턴유형 메소드명(매개변수리스트) {}
	//개명메소드선언
	void setName(String kname){
		name = kname;
		//System.out.println("setName()실행결과 name="+name);
	}
	
	//이름제공 메소드선언
	String getName(){
		return name;
	}
}




















