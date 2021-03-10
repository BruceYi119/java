package ch11;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

//Hashtable - 교재 p644
//철자주의.

//key를     id
//value를 비번
//키보드를 이용하여  id,비번을 입력받아
//Hashtable에     저장되어 있는 key(id),value(비번)으로  비교한 후
//로그인 여부를 출력
public class HashTable01 {

	public static void main(String[] args) {
		Map<String,String> map= new Hashtable<String,String>();
		
		//객체저장 => DB의 테이블에 해당되는 부분
		map.put("hong", "aaa"); 
		map.put("gil", "bbb");
		map.put("dong", "abc");
		map.put("hong1", "1234");
		
		//키보드를 이용해서  내용입력받기
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 비번을 입력하세요");
			System.out.print("id :");
			String id =sc.nextLine();
			
			System.out.print("비번 :");
			String pwd =sc.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) { //user가 입력한 id가  map에 key로 존재하는지 살펴본다
				//map.get(id) //해당키값의 value(map에 저장된 비번)를 가져온다(DB데이터)
				//pwd		  //user가 입력한 비번
				//2개를 비교해서  
				if( map.get(id).equals(pwd) ) {//일치하면 로그인성공
					System.out.println("로그인성공");
					break; //로그인성공했으니  반복문 빠져나와라
				}else {//그렇지않으면  로그인실패 : 비번불일치
					System.out.println("로그인실패 : 비번불일치");
				}
			}else {
				//로그인실패 : id존재x
				System.out.println("로그인실패 : id존재x");
			}//if
			
		}//while
		
		
		
	}

}
















