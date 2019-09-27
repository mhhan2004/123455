package com.blood.coding.service.member;

import java.sql.SQLException;
import java.util.List;

import com.blood.coding.dto.member.MemberVO;

public interface MemberService {
	public List<MemberVO> memberList() throws SQLException;
	public MemberVO loginMember(String mem_id) throws SQLException;
}
