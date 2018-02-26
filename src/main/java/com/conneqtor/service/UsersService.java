package com.conneqtor.service;

import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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

	public Users getUsersByUsername(String username) {
		System.out.println("in getUsersByUsername service");
		System.out.println("for username: " + username);
		return usersDao.getUsersByUsername(username);
	}
	
/*	public boolean login(Users user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
		Users dbUser = getUsersByUsername(user.getUsername());
		String userPass = encoder.encode(user.getPassword());
		String dbPass = dbUser.getPassword();
		
		System.out.println("db pass: " + dbPass);
		System.out.println("login pass: " + userPass);
		
		if(dbPass.equals(userPass))
			return true;
		else
			return false;
	}*/
	
	public Users createUsers(Users user){
		/*BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
		System.out.println("password before: " + user.getPassword());
		user.setPassword(encoder.encode(user.getPassword()));*/
		
		System.out.println("in createUsers service");
		System.out.println("password encrypted: " + user.getPassword());
		System.out.println("dbdbpass encrypted: $2a$06$Ur9hs5xmjB/paU36R72f5uybXXYPKchHHy8sxX6/GEXmTHKzXDzGC");
		System.out.println("creating user: " + user);
		return usersDao.createUsers(user);
	}
}
