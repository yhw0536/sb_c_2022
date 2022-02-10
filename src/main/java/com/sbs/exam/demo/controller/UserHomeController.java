package com.sbs.exam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserHomeController {
	private int count;
	
	public UserHomeController() {
		count = -1;
	}
	
	@RequestMapping("/usr/home/main")
	@ResponseBody
	public String showMain() {
		return "안녕하세요.";
	}
	
	@RequestMapping("/usr/home/main2")
	@ResponseBody
	public String showMain2() {
		return "반갑습니다.";
	}
	
	@RequestMapping("/usr/home/main3")
	@ResponseBody
	public String showMain3() {
		return "또 만나요.";
	}
	
	@RequestMapping("/usr/home/getCount")
	@ResponseBody
	public int getCount() {
		count++;
		return count;
	}
	
	@RequestMapping("/usr/home/doSetCount")
	@ResponseBody
	public String doSetCount(int count) {
		this.count = 0;
		return "count의 값이" + this.count +"으로 초기화 되었습니다.";
	}
	
}