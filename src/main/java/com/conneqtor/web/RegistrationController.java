package com.conneqtor.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import com.conneqtor.beans.Users;
import com.conneqtor.beans.UsersDTO;
import com.conneqtor.service.UsersService;
import com.google.gson.Gson;

@Controller
public class RegistrationController {

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String showRegistrationForm(WebRequest request, Model model) {
		
		UsersDTO userDto = new UsersDTO();
		model.addAttribute("user", userDto);
		return "registration";
	}
	
	@RequestMapping(value="/checkEmail", method = RequestMethod.POST)
	public @ResponseBody String checkEmail(@RequestBody String newUserJson) {
		System.out.println("in check email java controller");
	
		Gson gson = new Gson();
		Users newUser = gson.fromJson(newUserJson, Users.class);
		
		UsersService usersService =  new UsersService();
		Users dbUser = usersService.getUsersByUsername(newUser.getUsername());
		
		String jsonResponseDbUser = new Gson().toJson(dbUser);
		System.out.println("dbUser: " + jsonResponseDbUser);
		
		return jsonResponseDbUser;	
	}
}


