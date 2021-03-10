package ch11;

//배열(Array) - 하나의 변수에  여러개의 데이터를 연속적으로 모아놓았다
public class Array01 {

	public static void main(String[] args) {
		//문자열 5개를 저장하는 배열생성     타입[] 배열명  = new 타입[크기];
		String[] list  = new String[5];
		
		//문자열데이터를 추가
		list[0]="홍길동";
		list[1]="henry";
		list[2]="김구";
		list[3]="유재석";
		list[4]="강호동";
		
		//저장된 데이터의 총 개수조회
		System.out.println("저장된 데이터의 총 개수="+list.length);//저장된 데이터의 총 개수=5
		
		//데이터 꺼내기(조회)
		System.out.println("list[0]=" + list[0]);//홍길동
		System.out.println();
		
		//모든 데이터 꺼내기
		for(int i=0; i<list.length;  i++) {
			System.out.println("list["+i+"]="+list[i]);
		}
		
		//향상된 for문 이용 - 모든 데이터 꺼내기
		//for( 타입 변수: 배열명또는컬렉션명 ) {	}
		for( String temp : list ) {
			System.out.println(temp);
		}
		
	}

}






