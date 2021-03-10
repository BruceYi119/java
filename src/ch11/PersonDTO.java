package ch11;


//참고 *인터페이스 -교재381~~~


//interface를 구현하는 클래스 선언
//[접근제어자]  [속성] class 클래스명  [extends 조상클래스명] implements 인터페이스명1,...,인터페이스명N

//인터페이스는  상수와 추상메서드만으로 구성된   (추상)클래스의 일종이므로
//인터페이스를  상속받은  구현클래스에서는
//인터페이스에서  선언한   추상메서드를  반드시 꼭 기필코  오버라이딩(재정의)해야 한다

//여기에서는 Comparable 인터페이스의   int compareTo(Object arg0)을 오버라이딩해야 한다
public class PersonDTO implements Comparable<PersonDTO>{
	
	//field
	public String name;	//이름
	private	int		age;	//나이
	
	//constructor   
	//order by  정렬기준   정렬방법
	//new   PersonDTO(String name, int age)
	//new   PersonDTO("홍길동", 100)
	//new   PersonDTO("홍길동", 1)
	public PersonDTO() {}
	public PersonDTO(String name, int age) {
		this.name = name;
		this.age  = age;
	}
	
	
	//정렬기능
	/*Compares this object with the specified object for order. 
	 * Returns a negative integer, zero, or a positive integer  as this object  
	 * is less than, equal to, or greater than the specified object.
	 * 기준1    비교100 : 음수     1-100=-99 
	 * 기준 100   비교100 : 0  100-100=0
	 * 기준 100   비교1 : 양수   100-1=99  
	 */
	@Override
	public int compareTo(PersonDTO specifiedObj) {
		if( this.age<specifiedObj.age ) { 
			return  -1;//-1하면 나이오름차순정렬		 //1;하면  나이내림차순정렬
		}else if( this.age==specifiedObj.age ) {
			return 0;
		}else { 
			return 1;//1하면 나이오름차순정렬		 //-1;하면  나이내림차순정렬
		}
	}
	
	//method
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "PersonDTO [name=" + name + ", age=" + age + "]";
	}
	
	
	/*@Override
	public String toString() {
		return "이름:"+this.name;
	}*/

	
	
}












