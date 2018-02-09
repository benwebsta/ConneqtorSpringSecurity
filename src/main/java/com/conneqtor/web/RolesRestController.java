package com.conneqtor.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.conneqtor.beans.Roles;
import com.conneqtor.service.RolesService;
import com.google.gson.Gson;

@Controller
public class RolesRestController {

	@Autowired
	private RolesService rolesService;
	
	@RequestMapping(method=RequestMethod.GET, value="/getAllRoles")
	public @ResponseBody String getAllRoles_JSON(HttpServletRequest request, 
	        													HttpServletResponse response){
		System.out.println("Get all ROLES rest controller hit");
		List<Roles> roles = rolesService.getAllRoles();
		System.out.println("Roles list: ");
		for(int i = 0; i < roles.size(); i++)
			System.out.println(roles.get(i).toString());
		String jsonResponse = new Gson().toJson(roles);
		System.out.println(jsonResponse);
		return jsonResponse;
	}
	
}
