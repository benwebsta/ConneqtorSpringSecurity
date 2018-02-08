package com.conneqtor.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;

@Controller
public class FooterController {
	
	@RequestMapping(value = "/aboutUs", method = RequestMethod.GET)
	public String aboutUsPage(){
		return "footer/aboutUs";
	}
	@RequestMapping(value = "/contactUs", method = RequestMethod.GET)
	public String contactUsPage(){
		return "footer/contactUs";
	}
	@RequestMapping(value = "/privacyPolicy", method = RequestMethod.GET)
	public String privacyPolicyPage(){
		return "footer/privacyPolicy";
	}
	@RequestMapping(value = "/termsOfUse", method = RequestMethod.GET)
	public String termsOfUsePage(){
		return "footer/termsOfUse";
	}

}
