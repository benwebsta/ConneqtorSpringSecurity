package com.conneqtor.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.conneqtor.beans.Users;
import com.conneqtor.service.UsersService;
import com.google.gson.Gson;

@Controller
public class UsersRestController {
	
	@Autowired
	private UsersService usersService;
	
	@RequestMapping(method=RequestMethod.GET, value="/getAllUsers")
	public @ResponseBody String getAllUsers_JSON(HttpServletRequest request, 
												HttpServletResponse response) {
		System.out.println("Get all USERS rest controller hit");
		List<Users> users = usersService.getAllUsers();
		System.out.println("Users list: ");
		for(int i = 0; i < users.size(); i++)
			System.out.println(users.get(i).toString());
		String jsonResponse = new Gson().toJson(users);
		System.out.println(jsonResponse);
		return jsonResponse;
	}

}
