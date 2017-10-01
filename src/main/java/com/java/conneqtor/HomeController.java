package com.java.conneqtor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	/*public String home(HttpServletRequest request) {
		System.out.println(request.getRemoteAddr());
		return "home";
	}*/
	public String home() {
		return "home";
	}
	@RequestMapping(value = "/admin/privatePage", method = RequestMethod.GET)
	public String privatePage(){
		return "privatePage";
	}
	@RequestMapping(value = "privatePage2", method = RequestMethod.GET)
	public String privatePage2(){
		return "testPage";
	}
	@RequestMapping(value = "/admin/privatePage3", method = RequestMethod.GET)
	public String privatePage3(){
		return "testPage2";
	}
	
	
}
