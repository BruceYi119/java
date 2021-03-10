package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap0 {

	public static void main(String[] args) {
		//Map생성
		Map<String,Integer>  map = new HashMap<String,Integer>();
		//Map  map = new HashMap();
		
		//객체저장
		map.put("hong", 10); //key는    중복허용x 
		map.put("gil", 50);
		map.put("dong", 100);
		map.put("hong1", 100); //value는 중복허용하므로  객체저장
		map.put("hong", 1234); 
		System.out.println("총 객체 수="+map.size());//4
		
		//특정객체찾기: Object get(Object key) 
		Integer x = map.get("hong");
		System.out.println("Integer x ="+x);//1234
		System.out.println(x.MAX_VALUE);//2147483647
		
		/*참고
		//map.get("hong")하면  여기에서는 Integer로 리턴받지만
		//int타입의 변수에 저장할 수 있는 이유는
		//auto unboxing이 되기 때문이다.
		int y = map.get("hong");
		System.out.println("int y ="+y);//1234
		*/
		
		//Map에 저장된 모든 모든객체 찾기
		//value를 가져오기위해서는 먼저 key를 알아야 한다
		//keySet() : 모든 키를 Set컬렉션으로 받을 수 있다
		Set<String> keys = map.keySet();//keySet()을 이용해서   Set컬렉션으로 받고
		Iterator<String>  iter = keys.iterator();  //반복자 얻기//Set컬렉션에서 제공되는 반복자를 통해  모든 key를 얻은 다음
		while(iter.hasNext()) {
			String  key   = iter.next();//받은 개별 key를 이용해서 
			Integer value = map.get(key);//get()을 통해 값을 얻기
			System.out.println(key+" : "+value);
		}
		
		//특정객체 제거: remove(Object key) 
		map.remove("hong");
		System.out.println("특정객체 제거후의   총 객체 수="+map.size());//3
		
		//전체 객체 출력
		//Set<Entry<String, Integer>>  entrySet()
		//Set                          entrySet()
		Set<Entry<String, Integer>>  set = map.entrySet(); //entrySet()을 통해 Set컬렉션을 얻은 다음
		Iterator<Entry<String, Integer>>  iter1 = set.iterator();   //Set컬렉션에서 제공되는 반복자를 통해   Map.Entry를  하나씩 얻고
		while( iter1.hasNext() ) {
			Entry<String, Integer> entry = iter1.next();
			String  key   = entry.getKey();//getKey()를     통해   key를 
			Integer value = entry.getValue();//getValue()를 통해   value를 얻기
			System.out.println(key+" : "+value);
		}
		
		
	}

}











