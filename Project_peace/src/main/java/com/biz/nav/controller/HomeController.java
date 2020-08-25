package com.biz.nav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	
	//로그인 페이지(홈화면)
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	// 로그인버튼을 누르면 메인페이지 호출 (MemberDao에 따라 수정 및 추가작업 필요)
	@RequestMapping(value = "/main", method = RequestMethod.POST)
	public String login(@ModelAttribute String id, String pw, Model model) {
		
		System.out.println("ID : " + id);
		System.out.println("PW : " + pw);
		
		return "main";
	}
	
	// 회원가입버튼을 누르면 회원가입페이지 호출 
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		return "join";
	}
	
}