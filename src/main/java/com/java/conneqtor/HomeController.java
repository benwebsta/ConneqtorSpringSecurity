package com.java.conneqtor;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest request) {
		System.out.println(request.getRemoteAddr());
		return "home";
	}
	public String home() {
		return "home";
	}
	@RequestMapping(value = "/admin/privatePage", method = RequestMethod.GET)
	public String privatePage(){
		return "privatePage";
	}
	@RequestMapping(value = "/publicPage", method = RequestMethod.GET)
	public String publicPage(){
		return "publicPage";
	}
	@RequestMapping(value = "/admin/adminPage", method = RequestMethod.GET)
	public String adminPage(){
		return "adminPage";
	}
	
	
}
