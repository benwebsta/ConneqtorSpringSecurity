package com.conneqtor.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HeaderController {

	@RequestMapping(value = "/findAnAdvisor", method = RequestMethod.GET)
	public String findAnAdvisorPage(){
		return "header/findAnAdvisor";
	}
	@RequestMapping(value = "/whatIsConneqtor", method = RequestMethod.GET)
	public String whatIsConneqtorPage(){
		return "header/whatIsConneqtor";
	}
	@RequestMapping(value = "/searchForClients", method = RequestMethod.GET)
	public String searchForClientsPage(){
		return "header/searchForClients";
	}
}
