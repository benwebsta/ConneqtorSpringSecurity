package com.conneqtor.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.conneqtor.beans.Roles;
import com.conneqtor.dao.RolesDao;
import com.conneqtor.dao.RolesDaoImpl;

@Component
public class RolesService {
	
	RolesDao rolesDao = new RolesDaoImpl();
	
	public List<Roles> getAllRoles(){
		System.out.println("in getAllRoles service");
		return rolesDao.getAllRoles();
	}
	
	public Roles getRolesById(int id) {
		System.out.println("in getRolesById service");
		System.out.println("for id: " + id);
		return rolesDao.getRolesById(id);
	}

}
