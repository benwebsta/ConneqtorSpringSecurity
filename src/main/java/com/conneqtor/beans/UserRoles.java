package com.conneqtor.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "USER_ROLES")
public class UserRoles {
	
	@Id
	@Column(name="USER_ROLES_ID")
	@SequenceGenerator(name="USER_ROLES_SEQ", sequenceName="USER_ROLES_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USER_ROLES_SEQ")
	@Qualifier("userRolesId")
	private int userRolesId;
	
	@Column(name="USER_ID")
	@Qualifier("userId")
	private int userId;
	
	@Column(name="ROLE_ID")
	@Qualifier("roleId")
	private int roleId;

	public int getUserRolesId() {
		return userRolesId;
	}

	public void setUserRolesId(int userRolesId) {
		this.userRolesId = userRolesId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "UserRoles [userRolesId=" + userRolesId + ", userId=" + userId + ", roleId=" + roleId + "]";
	}
	
}
