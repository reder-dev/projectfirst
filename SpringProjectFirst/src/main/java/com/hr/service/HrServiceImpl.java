package com.hr.service;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.hr.persistence.HrDAO;
import com.hr.useing.HrVO;

@Service

public class HrServiceImpl implements HrService{
	
	private static final Logger logger 
	   = LoggerFactory.getLogger(HrServiceImpl.class);
	
	@Inject
	private HrDAO hdao;

	@Override
	public HrVO HrInfo(String emp_id) {
		
		return hdao.getHrInfo(emp_id);
	}

	@Override
	public int HrUpdate(HrVO updateVO) {
		
		return hdao.updateHr(updateVO);
	}
	
	
	
	

}
