package com.conneqtor.beans;

import org.springframework.stereotype.Component;

@Component
public class AnswersCompareDTO {
	
	private int usersId1;
	
	private int usersId2;

	public int getUsersId1() {
		return usersId1;
	}

	public void setUsersId1(int usersId1) {
		this.usersId1 = usersId1;
	}

	public int getUsersId2() {
		return usersId2;
	}

	public void setUsersId2(int usersId2) {
		this.usersId2 = usersId2;
	}

	@Override
	public String toString() {
		return "AnswerCompareDTO [usersId1=" + usersId1 + ", usersId2=" + usersId2 + "]";
	}

}
