package com.conneqtor.dao;

import java.util.List;

import com.conneqtor.beans.Users;

public interface UsersDao {
	public List<Users> getAllUsers();
	public Users getUsersById(int id);
}
