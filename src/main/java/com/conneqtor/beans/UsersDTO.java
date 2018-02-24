package com.conneqtor.beans;

public class UsersDTO {

    private String firstName;

    private String lastName;

    private String username; 
    
    private String password;
    
    private String matchingPassword;
    
    private int active;

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

	public String getMatchingPassword() {
		return matchingPassword;
	}

	public void setMatchingPassword(String matchingPassword) {
		this.matchingPassword = matchingPassword;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "UsersDTO [firstName=" + firstName + ", lastName=" + lastName + ", username=" + username + ", password="
				+ password + ", matchingPassword=" + matchingPassword + ", active=" + active + "]";
	}
	
}
