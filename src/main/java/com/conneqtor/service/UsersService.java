package com.conneqtor.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.conneqtor.beans.Users;
import com.conneqtor.dao.UsersDao;
import com.conneqtor.dao.UsersDaoImpl;

@Component
public class UsersService {
	
	UsersDao usersDao = new UsersDaoImpl();
	
	public List<Users> getAllUsers(){
		System.out.println("in getAllUsers service");
		return usersDao.getAllUsers();
	}
	
	public Users getUsersById(int id) {
		System.out.println("in getUsersById service");
		System.out.println("for id: " + id);
		return usersDao.getUsersById(id);
	}

}
