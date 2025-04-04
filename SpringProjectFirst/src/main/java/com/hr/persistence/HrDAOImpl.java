package com.hr.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.hr.useing.HrVO;

@Repository
public class HrDAOImpl implements HrDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(HrDAOImpl.class);
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String NAMESPACE
	= "com.hr.mapper.HrMapper.";

	
	
	
	@Override
	public String getSeverTime() {
		
		String time 
		= sqlSession.selectOne("com.hr.mapper.HrMapper"+".getTime");
		
		return time;
	}

	@Override
	public HrVO getHrInfo(String emp_id) {
		HrVO resultVO =
		sqlSession.selectOne(NAMESPACE+ "getHrInfo", emp_id);
		
				
				
		return resultVO;
	}

	@Override
	public int updateHr(HrVO updateVO) {
		
		int result =
				sqlSession.update(NAMESPACE+ "updateHr", updateVO);
				
		return result;
	}
	
	
	
}
