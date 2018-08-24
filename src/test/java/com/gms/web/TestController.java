package com.gms.web;

import org.springframework.stereotype.Controller;

@Controller
public class TestController {
	public static void main(String[] args) {
		String[] temp = {"a","b","c"};
		test(temp);
	}
	public static void test(String... arg) {
		System.out.println(arg[2]);
	} 
	
}
