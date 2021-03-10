package test.Q3.LeeJeongSam;

import java.util.ArrayList;
import java.util.List;

public class BoardDAO {

	private List<BoardDTO> list=new ArrayList<BoardDTO>();
	
	public void setBoardDTO(String title, String content) {
		BoardDTO b=new BoardDTO();
		b.setTitle(title);
		b.setContent(content);
		
		list.add(b);
	}
	
	public List<BoardDTO> getBoardDTO(){

		return list;
	}
	
}
