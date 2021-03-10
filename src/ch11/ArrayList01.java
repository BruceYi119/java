package ch11;

import java.util.ArrayList;

/*컬렉션 프레임웍의 핵심 인터페이스- 중요★★★★★	- 교재p578
 *List - 순서유지, 중복허용			예)대기자목록
 *Set  - 순서유지x, 중복허용x
 *Map  - key,value가 한 쌍으로 구성
 				  순서유지x, key는 중복허용x, value은 중복허용 
*/

//ArrayList클래스 - 교재p584
public class ArrayList01 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		//객체를 추가
		list.add("홍길동");
		list.add("henry");
		list.add("김구");
		list.add("유재석");
		list.add("강호동");
		list.add("홍길동"); //중복된 데이터 추가할 수 있다=>중복허용
		
		//저장된 객체의 총 수 조회 Returns the number of elements in this list.
		int length = list.size(); //int  size()
		System.out.println("저장된 객체의 총 수="+length);//저장된 객체의 총 수=5
		
		
		//객체 꺼내기(조회)-Object   get(int index)
		Object obj = list.get(0);
		System.out.println("list.get(0)="+obj);//홍길동
		System.out.println("list.get(0)="+(String)obj);//홍길동
		//클래스(강제)형변환   : (sub클래스명)
		//참조변수의 형변환 - 교재p357참고
		System.out.println();
		
		//모든 데이터 꺼내기=> 입력한 순서가 유지되어 출력된다
		for(int i=0; i<list.size() ;i++) {
			System.out.println("list.get("+i+")="+(String)list.get(i));
		}
		System.out.println("--------------");
		
		//특정 인덱스에 있는 객체 삭제 : remove(index) 
		list.remove(2); //김구 제거
		list.remove(2); //유재석 제거
		
		//특정 인덱스에 있는 객체 삭제 : remove(Object)
		list.remove("강호동"); //강호동 제거
		
		System.out.println("--------------");
		//향상된 for문 이용 - 모든 데이터 꺼내기
		//for( 타입 변수: 배열명또는컬렉션명 ) {	}
		for( Object temp : list ) {	
			System.out.println((String)temp);
		}
	}

}






