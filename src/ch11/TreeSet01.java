package ch11;

import java.util.TreeSet;

/*TreeSet - 교재p638
	- 범위 검색과 정렬에 유리한 이진 검색 트리(binary search tree)로 구현
	    링크드 리스트처럼 각 요소(node)가  나무(tree)형태로 연결된 구조
	- 이진 트리는 모든 노드가 최대 두 개의 하위 노드를 갖음(부모-자식관계)  
	- 이진 검색 트리는 부모보다 작은 값을 왼쪽에, 큰 값은 오른쪽에 저장(교재 p640)=>ppt  ch11의 39슬라이드 참고
	- HashSet보다 데이터 추가, 삭제에 시간이 더 걸림(반복적인 비교 후 저장)
*/
public class TreeSet01 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add( new Integer(10) );
		ts.add( new Integer(33) );
		ts.add( new Integer(100) );
		ts.add( new Integer(99) );
		ts.add( new Integer(5) );
		
		Integer num = null;
		
		System.out.println("가장 낮은 점수="+ts.first()  ); //5
		System.out.println("가장 높은 점수="+ts.last()  );  //100
		
		num = ts.lower(new Integer(20));
		System.out.println("20보다 아래인 점수 ="+ num); //20
		
		num = ts.higher(new Integer(90));
		System.out.println("90보다 위인 점수="+num); //99
		
		num = ts.floor(new Integer(99));
		System.out.println("99와 동일하거나 바로 아래 점수="+num); //99
		
		num = ts.ceiling(new Integer(98));
		System.out.println("99와 동일하거나 바로 위 점수="+num); //99
		
		while( !ts.isEmpty() ) {
			num = ts.pollFirst();
			System.out.println(num+"\t남은 객체수:"+ts.size());
		}
		
	}

}


























