package com.biz.nav.dao;

import com.biz.nav.model.MemberVO;

public interface MemberDao {

	public MemberVO login(MemberVO memberVO);
	public int insert(MemberVO memberVO);
	public int update(MemberVO memberVO);
	public int delete(long m_seq);
}