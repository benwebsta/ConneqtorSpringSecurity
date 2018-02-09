package com.conneqtor.dao;

import java.util.List;

import com.conneqtor.beans.Roles;

public interface RolesDao {
	public List<Roles> getAllRoles();
	public Roles getRolesById(int id);
}
