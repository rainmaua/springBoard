package com.spring.board.dao;

import java.util.List;

import com.spring.board.vo.BoardVo;
import com.spring.board.vo.ComCodeVo;
import com.spring.board.vo.PageVo;
import com.spring.board.vo.UserInfoVo;

public interface BoardDao {

	public String selectTest() throws Exception;

	public List<BoardVo> selectBoardList(PageVo pageVo) throws Exception;

	public BoardVo selectBoard(BoardVo boardVo) throws Exception;

	public int selectBoardCnt() throws Exception;

	public int boardInsert(BoardVo boardVo) throws Exception;
	
//	// Yi's code
	public int boardUpdate(BoardVo boardVo) throws Exception; 
	
	public int boardDelete(BoardVo boardVo) throws Exception;
	
	
	public List<ComCodeVo> selectKindList() throws Exception;
	
	public int getKindCount() throws Exception; 
	
//	public int boardRegister(UserInfoVo userInfoVo) throws Exception; 
	
}
