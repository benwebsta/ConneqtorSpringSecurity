package com.conneqtor.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.conneqtor.beans.UserRoles;
import com.conneqtor.service.UserRolesService;
import com.google.gson.Gson;

@Component
public class UserRolesRestController {
	
	@Autowired
	private UserRolesService userRolesService;
	
	@RequestMapping(method=RequestMethod.GET, value="/getAllUserRoles")
	public @ResponseBody String getAllUserRoles_JSON(HttpServletRequest request, 
													HttpServletResponse response){
		System.out.println("Get all USER ROLES rest controller hit");
		List<UserRoles> userRoles = userRolesService.getAllUserRoles();
		System.out.println("User Roles list: ");
		for(int i = 0; i < userRoles.size(); i++)
			System.out.println(userRoles.get(i).toString());
		String jsonResponse = new Gson().toJson(userRoles);
		System.out.println(jsonResponse);
		return jsonResponse;
	}
	
}
