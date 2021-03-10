package ch11;

import java.util.Iterator;
import java.util.TreeSet;

//TreeSet이용 - 교재p638
/* 	- 범위 검색과 정렬에 유리한 이진 검색 트리(binary search tree)로 구현
 	    링크드 리스트처럼 각 요소(node)가  나무(tree)형태로 연결된 구조
 	- 이진 트리는 모든 노드가 최대 두 개의 하위 노드를 갖음(부모-자식관계)  
    - 이진 검색 트리는 부모보다 작은 값을 왼쪽에, 큰 값은 오른쪽에 저장(교재 p640)=>ppt  ch11의 39슬라이드 참고
    - HashSet보다 데이터 추가, 삭제에 시간이 더 걸림(반복적인 비교 후 저장)*/

/*실행결과
	@Override
	public int compareTo(PersonDTO specifiedObj) {
		if( this.age<specifiedObj.age ) { 
			return  1; //1;하면  나이내림차순정렬
		}else if( this.age==specifiedObj.age ) {
			return 0;
		}else { 
			return -1; //-1;하면  나이내림차순정렬
		}
	}
PersonDTO [name=홍일, age=1]
PersonDTO [name=김구, age=9]
PersonDTO [name=김십, age=10]
PersonDTO [name=홍백, age=100]
PersonDTO [name=이순신, age=123] 
------------------------------------
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
PersonDTO [name=이순신, age=123]
PersonDTO [name=홍백, age=100]
PersonDTO [name=김십, age=10]
PersonDTO [name=김구, age=9]
PersonDTO [name=홍일, age=1]
 */

//PersonDTO에서  재정의된 compareTo()메서드를 이용하여
//나이 순으로 정렬하는    클래스이다
//사용자 정의 객체를  나이순으로 정렬
public class PersonDTO_ex {

	public static void main(String[] args) {
		//TreeSet 준비
		TreeSet<PersonDTO> ts = new TreeSet<PersonDTO>();
		
		//PersonDTO객체 저장
		//저장될 때  나이순으로 정렬됨
		ts.add( new  PersonDTO("홍백", 100));
		ts.add( new  PersonDTO("홍일", 1)  );
		ts.add( new  PersonDTO("김구", 9)  );
		ts.add( new  PersonDTO("김십", 10)  );
		ts.add( new  PersonDTO("이순신", 123)  );
		
		//왼쪽 마지막노드에서    오른쪽마지막노드까지    반복해서 가져온다=>오름차순
		//참고(교재 p640)  - 이진 검색 트리는 부모보다 작은 값을 왼쪽에, 큰 값은 오른쪽에 저장
		Iterator<PersonDTO> iter = ts.iterator();
		while( iter.hasNext() ) {
			PersonDTO  person = iter.next();
			//System.out.println( person.getName() );
			//System.out.println( person);라고 쓰면  오버라이딩된 person.toString()을 호출
			System.out.println( person.toString());
		}
		
	}

}







