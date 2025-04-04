package com.hr.persistence;

import com.hr.useing.HrVO;

public interface HrDAO {
	
	// 디비서버 시간정보 조회
	public String getSeverTime();
	
	// 내정보 보기(정보 조회)
	public HrVO getHrInfo(String emp_id);
		
	// 회원정보 수정
	public int updateHr(HrVO updateVO);

}
