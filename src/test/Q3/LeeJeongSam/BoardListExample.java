package test.Q3.LeeJeongSam;

import java.util.Iterator;
import java.util.List;

//BoardListExample : 실행클래스
//BoardDAO : db역할을 하는 클래스
//getBoardList() List<BoardDTO>
//BoardDTO : Board 정보

public class BoardListExample {

	public static void main(String[] args) {
		//BoardDAO객체의 getBoardList()를 호출하여
		//List<BoardDTO> 타입의 컬렉션을 리턴받아
		//콘솔에 출력
		
		BoardDAO bDao=new BoardDAO();
		bDao.setBoardDTO("제목1입니다", "내용1입니다");
		bDao.setBoardDTO("제목2입니다", "내용2입니다");
		
		List<BoardDTO> list=bDao.getBoardDTO();
		
		Iterator<BoardDTO> iter=list.iterator();
		
		while(iter.hasNext()) {
			BoardDTO data=iter.next();
			System.out.println(data.getTitle()+"\t"+data.getContent());
		}
	
		
	}

}
