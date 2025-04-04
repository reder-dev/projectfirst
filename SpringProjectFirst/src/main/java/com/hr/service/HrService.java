package com.hr.service;



import com.hr.useing.HrVO;


public interface HrService {
	
	// 회원정보 조회
	public HrVO HrInfo(String emp_id);
		
	// 회원정보 수정
	public int HrUpdate(HrVO updateVO);

}
