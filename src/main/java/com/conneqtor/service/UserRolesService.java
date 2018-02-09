package com.conneqtor.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.conneqtor.beans.UserRoles;
import com.conneqtor.dao.UserRolesDao;
import com.conneqtor.dao.UserRolesDaoImpl;

@Component
public class UserRolesService {

	UserRolesDao userRolesDao = new UserRolesDaoImpl();
	
	public List<UserRoles> getAllUserRoles(){
		System.out.println("in getAllUsers service");
		return userRolesDao.getAllUserRoles();
	}
	
	public UserRoles getUserRolesById(int id) {
		System.out.println("in getUserRolesById service");
		System.out.println("for id: " + id);
		return userRolesDao.getUserRolesById(id);
	}
}
