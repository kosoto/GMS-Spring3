package com.gms.web.controller;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model, HttpServletRequest request) {
		String context = request.getContextPath();
		logger.info("Welcome home! The Context Path is {}.", context);
		model.addAttribute("context", context);
		
		return "public:common/content.titles";
	}
	@RequestMapping("/move/{dir}/{page}")
	public String move(
			@PathVariable String dir,
			@PathVariable String page) {
		logger.info("HomController ::: move() {}.", "ENTER");
		return "public:"+dir+"/"+page+".titles";
	}
}
