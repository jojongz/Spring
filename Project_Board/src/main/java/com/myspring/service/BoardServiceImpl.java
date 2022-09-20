package com.myspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myspring.mapper.BoardMapper;
import com.myspring.model.BoardVO;
import com.myspring.model.Criteria;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardMapper mapper;
	
	@Override
	public void enroll(BoardVO board) {
		
		mapper.enroll(board);
		
	}

	@Override
	public List<BoardVO> getList() {
		
		return mapper.getList();
	}

	@Override
	public BoardVO getPage(int bno) {
		
		return mapper.getPage(bno);
	}

	@Override
	public int modify(BoardVO board) {
		
		return mapper.modify(board);
	}

	@Override
	public int delete(int bno) {
		
		return mapper.delete(bno);
	}

	@Override
	public List<BoardVO> getListPaging(Criteria cri) {
		
		return mapper.getListPaging(cri);
	}

	@Override
	public int getTotal() {

		return mapper.getTotal();
	}


}
