package com.conneqtor.web;

import java.security.Principal;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.conneqtor.beans.Roles;
import com.conneqtor.beans.Users;
import com.google.gson.Gson;

import org.springframework.core.Constants;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest request) {
		System.out.println(request.getRemoteAddr());
		return "home";
	}
/*	public String home() {
		return "home";
	}*/
	@RequestMapping(value = "/home", method = RequestMethod.GET)
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
	@RequestMapping(value = "/questionForm", method = RequestMethod.GET)
	public String questionForm() {
		return "questionForm";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
/*	@RequestMapping(value="/success", method = RequestMethod.GET)
	  public Object printWelcome(ModelMap map) {
		  
		ServletRequestAttributes attr = (ServletRequestAttributes) 
			    RequestContextHolder.currentRequestAttributes();
		HttpSession session = attr.getRequest().getSession(true); // true == allow create
		map.addAttribute("msg", "Successfully logged in");
		map.addAttribute("session", session);

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName();
		Collection authorities = auth.getAuthorities();
		
		map.addAttribute("auth", auth);
		System.out.println("name: " + name);
		System.out.println("authorities: " + authorities.toString());

		return "success";

	  }*/
	@RequestMapping(value="/loggedIn", method = RequestMethod.GET)
	public @ResponseBody String loggedInAuth(ModelMap map, HttpServletRequest request, 
															 HttpServletResponse response) {
		System.out.println("in logged in");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		map.addAttribute("auth", auth);
		
		String jsonResponseMap = new Gson().toJson(map);
		System.out.println(jsonResponseMap);
		
		return jsonResponseMap;	
	}
	
}
