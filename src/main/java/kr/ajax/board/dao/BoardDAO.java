package kr.ajax.board.dao;

import java.util.List;

import kr.ajax.board.dto.BoardDTO;
import kr.ajax.board.dto.PhotoDTO;

public interface BoardDAO {

	List<BoardDTO> list();




	int del(String idx);




	List<String> getFiles(String idx);







}
