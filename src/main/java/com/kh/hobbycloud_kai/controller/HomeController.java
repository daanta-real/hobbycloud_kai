package com.kh.hobbycloud_kai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		log.debug("▶▶▶▶▶▶▶▶▶▶ 접속: /");
		return "home";
	}

}
