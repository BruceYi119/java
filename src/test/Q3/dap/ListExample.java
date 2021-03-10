package test.Q3.dap;

import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();
		List<BoardDTO> list = dao.getBoardDTOList();
		for(BoardDTO BoardDTO : list) {
			System.out.println(BoardDTO.getTitle() + "-" + BoardDTO.getContent());
		}
	}
}
