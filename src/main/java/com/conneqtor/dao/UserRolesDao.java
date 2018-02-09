package com.conneqtor.dao;

import java.util.List;

import com.conneqtor.beans.UserRoles;

public interface UserRolesDao {
	public List<UserRoles> getAllUserRoles();
	public UserRoles getUserRolesById(int id);
}
