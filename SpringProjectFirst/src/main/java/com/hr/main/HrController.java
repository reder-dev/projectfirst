package com.hr.main;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.hr.service.HrService;
import com.hr.useing.HrVO;

@Controller
@RequestMapping("/hr/*")
public class HrController {
	
	private static final Logger logger = LoggerFactory.getLogger(HrController.class);
	
	@Inject
	private HrService hService;
	
	
	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public String HrInfoGET(Model model,@SessionAttribute(name = "id",required = false) String id) {
		
		if(id == null) {
			
			return "redirect:/hr/login";
		}
		
		
		HrVO resultVO = hService.HrInfo(id);
		
		model.addAttribute(resultVO);
		
		return "/hr/info";
	}
	
	// 회원정보 수정 - GET(기존 인사 정보 보여주기 위해) 
		@RequestMapping(value = "/update",method = RequestMethod.GET)
		public void HrUpdateGET(HttpSession session,Model model) {
			
			String id = (String) session.getAttribute("id");
			
			HrVO resultVO = hService.HrInfo(id);
			
			model.addAttribute(resultVO);		
					
		}
		
		// 회원정보 수정 - POST (수정된 인사 정보를 제출 할때 사용)
		@RequestMapping(value = "/update",method = RequestMethod.POST)
		public String HrUpdatePOST(HrVO vo) {
			
			logger.info(" vo : {}",vo);
			
			// 서비스 - 수정할 정보를 가지고 디비에서 정보 수정 동작 호출
			int result = hService.HrUpdate(vo);
			
			if(result == 0) {
				// 다시 회원정보 수정페이지로 이동
				return "redirect:/hr/update";
			}
			
			return "redirect:/hr/main";
		}
	
	

}
