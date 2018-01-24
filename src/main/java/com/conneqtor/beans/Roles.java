package com.conneqtor.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "ROLES")
public class Roles {

	@Id
	@Column(name="ROLE_ID")
	@Qualifier("roleId")
	private int roleId;
	
	@Column(name="ROLE")
	@Qualifier("role")
	private String role;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Roles [roleId=" + roleId + ", role=" + role + "]";
	}
	
}
