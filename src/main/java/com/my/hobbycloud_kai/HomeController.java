package com.my.hobbycloud_kai;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Locale locale, Model model) {
		log.debug("▶▶▶▶▶▶▶▶▶▶ [/] 메인 페이지 접속");
		return "home";
	}

}
