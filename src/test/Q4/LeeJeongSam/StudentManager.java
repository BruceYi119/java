package test.Q4.LeeJeongSam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class StudentManager {

	private static Map<String, StudentDTO> map=new HashMap<String, StudentDTO>();	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		read();
		run();
	}
	
	//학생 정보 입력 후 읽어오기
	public static void read() {

		int cnt=1;
		
		System.out.println("4명의 학생이름, 학과, 학번, 학점평균 형식으로 입력하세요.");
		
		//학생 4명이 될 때까지 데이터 받기
		while(cnt<=4) {
		
			System.out.print("학생"+cnt+" >> ");
		
			String data=null;
			data=sc.nextLine();
			
			//split메서드로 이름,학과,학번,평점 구분해 저장
			//comment : String 클래스에서 split()함수가 문자열을 쪼개 배열에 저장해주는 함수였다면, 
			//comment : StringTokenizer 클래스는 보다 간단하게 문자열을 토큰 단위로 나눠주는 함수가 있어요
			//comment : StringTokenizer 클래스를 이용해보세요.
			String[] sData=data.split(", ");
			String name=sData[0];
			String department=sData[1];
			String id=sData[2];
			double grade=Double.parseDouble(sData[3]);  
			
			//그것을 StudentDTO 객체에 저장한 후 map에 name을 키로 추가
			StudentDTO sDTO=new StudentDTO(name, department, id, grade);
			map.put(name,sDTO);
			cnt++;
		}
		
		//입력한 결과물을 출력
		printAll();
	}

	
	//comment : 메서드에 주석을 달아보세요
	public static void printAll() {
		
		//이름을 key로 StudentDTO를 value로 하여 set으로 변환후
		//iterator로 모두 꺼내 출력
		Set<Entry<String, StudentDTO>> set=map.entrySet();
		
		Iterator<Entry<String, StudentDTO>> iter=set.iterator();
		
		while(iter.hasNext()) {
			
			Entry<String, StudentDTO> entry=iter.next();
			
			StudentDTO sDTO=entry.getValue();
			System.out.println("--------------------------");
			System.out.println("이름 : "+sDTO.getName());
			System.out.println("학과 : "+sDTO.getDepartment());
			System.out.println("학번 : "+sDTO.getId());
			System.out.println("학점 평균 : "+sDTO.getGrade());
			System.out.println("--------------------------");
		}
	}
	
	//comment : 메서드에 주석을 달아보세요
	public static void run() {
		
		//학생 이름을 입력하면 해당 학생의 정보를 불러오게 함		
		while(true) {
			System.out.print("학생 이름 >> ");
			String name=sc.nextLine();
			processQuery(name);
			
		}
		
	}
	
	//comment : 중복체크기능까지 추가하셨군요. 좋아요~
	//comment : 종삼씨처럼 작성해도 되고,   중복체크기능을   StudentDTO에서 가지고 있을 수 도 있겠지요.
	//comment : 메서드에 주석을 달아보세요
	public static void processQuery(String name) {
		
		//입력된 이름과 같은 값이 있는지 확인 후, 정보 출력
		if(map.containsKey(name)) {
			//comment : 불필요한 공백제거하세용
			StudentDTO sDTO=map.get(name);
			System.out.printf("%s, %s, %s, %.1f\n",sDTO.getName(),sDTO.getDepartment(),sDTO.getId(),sDTO.getGrade());
			
		}else {
			
			System.out.println("일치하는 학생이 없습니다");
		}
		
	}
}
