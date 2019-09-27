package com.blood.coding.service.member;

import java.sql.SQLException;
import java.util.List;

import com.blood.coding.dao.member.MemberDAO;
import com.blood.coding.dto.member.MemberVO;

public class MemberServiceImpl implements MemberService {
	
	private MemberDAO memberDAO;
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	@Override
	public List<MemberVO> memberList() throws SQLException {
		List<MemberVO> list = memberDAO.selectMemberList();
		return list;
	}
	@Override
	public MemberVO loginMember(String mem_id) throws SQLException {
		MemberVO member = memberDAO.loginMain(mem_id);
		return member;
	}
	
}
