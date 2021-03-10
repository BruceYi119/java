package test.Q3.dap;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	public List<BoardDTO> getBoardDTOList() {
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		list.add(new BoardDTO("제목1", "내용1"));
		list.add(new BoardDTO("제목2", "내용2"));
		list.add(new BoardDTO("제목3", "내용3"));
		return list;
	}
}