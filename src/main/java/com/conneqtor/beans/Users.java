package com.conneqtor.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Entity
@Scope("session")
@Table(name = "USERS")
public class Users {
	
	@Id
	@Column(name="USER_ID")
	@SequenceGenerator(name="USER_SEQ", sequenceName="USER_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USER_SEQ")
	@Qualifier("userId")
	private int userId;
	
	@Column(name="FIRST_NAME")
	@Qualifier("firstName")
	private String firstName;
	
	@Column(name="LAST_NAME")
	@Qualifier("lastName")
	private String lastName;
	
	@Column(name="USERNAME")
	@Qualifier("username")
	private String username;
	
	@Column(name="PASSWORD")
	@Qualifier("password")
	private String password;
	
	@Column(name="ACTIVE")
	@Qualifier("active")
	private int active;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", username="
				+ username + ", password=" + password + ", active=" + active + "]";
	}

}

