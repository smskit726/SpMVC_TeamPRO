package com.biz.nav.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.nav.dao.MemberDao;
import com.biz.nav.model.MemberVO;
import com.biz.nav.service.MemberService;

@Service(value = "mServiceV1")
public class MemberServiceImplV1 implements MemberService{

	@Autowired
	private MemberDao memDao;
	
	@Override
	public List<MemberVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVO findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(MemberVO vo) {
		
		int count = memDao.memberCount();
		
		return 0;
	}

	@Override
	public int update(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberVO login(MemberVO loginVO) {
		// TODO Auto-generated method stub
		return null;
	}

}
