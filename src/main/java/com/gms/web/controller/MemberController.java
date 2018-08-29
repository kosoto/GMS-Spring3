package com.gms.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gms.web.domain.MemberDTO;
import com.gms.web.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	@Autowired MemberDTO member;
	@Autowired MemberService memberService;
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(@ModelAttribute("member") MemberDTO member) {
		logger.info("회원가입{}","진입");
		logger.info("name is {}",member.getName());
		memberService.add(member);
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
	@RequestMapping(value="/modify",method=RequestMethod.POST)
	public String modify(@ModelAttribute MemberDTO member,Model model) {
		memberService.modify(member); 
		//수정된 정보를 retrieve에 보여주는 방법? AJAX에서 하자!
		return "login__success";
	}
	@RequestMapping(value="/remove",method=RequestMethod.POST)
	public String remove(@ModelAttribute MemberDTO member) {
		return (memberService.remove(member))?"redirect:/":"enter:member/remove.tiles";
		
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute MemberDTO member,
			Model model) {
		MemberDTO m = memberService.login(member);
		if(m != null) model.addAttribute("member",m);
		return (m !=null)?"login__success":"redirect:/move/enter/member/login";
	}
	@RequestMapping("/logout")
	public String logout() {
		HomeController.logger.info("로그아웃 {}","성공");
		return "redirect:/";
		
	}
	@RequestMapping("/fileupload")
	public void fileupload() {}
}
