package com.biz.nav.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.nav.model.MemberVO;
import com.biz.nav.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	@Autowired
	@Qualifier("mServiceV1")
	private MemberService mService;
	
	//로그인 페이지(홈화면)
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	// 로그인버튼을 누르면 메인페이지 호출 (MemberDao에 따라 수정 및 추가작업 필요)
	@RequestMapping(value = "/main", method = RequestMethod.POST)
	public String login(@ModelAttribute String id, String pw, Model model) {
		
		log.debug("ID : " + id);
		log.debug("PW : " + id);
		
		return "main";
	}
	
	// 회원가입버튼을 누르면 회원가입페이지 호출 
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join(@ModelAttribute("MEM_VO")MemberVO memVO, Model model) {
		
		model.addAttribute("BODY","MEM_WRITE");
		return "home";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(@ModelAttribute("MEM_VO")MemberVO memVO, Model model, String s) {
		
		log.debug(memVO.toString());
		
		mService.insert(memVO);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute("LOGIN_VO") MemberVO loginVO, Model model, HttpSession httpSession) {
		
		log.debug(loginVO.toString());
		
		MemberVO memVO = mService.login(loginVO);
		
		String retURL = "";
		if(memVO ==null) {
			retURL = "LOGIN";
			model.addAttribute("MSG","등록되지 않은 아이디입니다");
		} else if(!loginVO.getM_id().equals(memVO.getM_id())) {
			retURL="LOGIN";
			model.addAttribute("MSG","비밀번호가 일치하지 않습니다");
		} else {
			httpSession.setAttribute("LOGIN",memVO);
		}
		
		model.addAttribute("BODY",retURL);
		return "home";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession httpSession) {
		httpSession.removeAttribute("LOGIN");
		httpSession = null;
		return "home";
	}
	
	
	
}