package com.gms.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gms.web.domain.MemberDTO;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired MemberDTO member;
	@RequestMapping("/add")
	public String add() {
		HomeController.logger.info("회원가입{}","성공");
		return "redirect:/move/enter/member/login";
	}
	@RequestMapping("/list")
	public void list() {}
	@RequestMapping("/search")
	public void search() {}
	@RequestMapping("/retrieve")
	public void retrieve() {}
	@RequestMapping("/count")
	public void count() {}
	@RequestMapping("/modify")
	public void modify() {}
	@RequestMapping("/remove")
	public void remove() {}
	@RequestMapping("/login")
	public String login() {
		HomeController.logger.info("로그인 {}","성공");
		return "redirect:/move/auth/member/retrieve";
	}
	@RequestMapping("/logout")
	public String logout() {
		HomeController.logger.info("로그아웃 {}","성공");
		return "redirect:/";
		
	}
	@RequestMapping("/fileupload")
	public void fileupload() {}
}
