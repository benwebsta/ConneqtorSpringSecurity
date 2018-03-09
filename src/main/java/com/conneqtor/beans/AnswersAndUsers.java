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
@Table(name="ANSWERS_AND_USERS")
public class AnswersAndUsers {
	
	@Id
	@Column(name="ANSWERS_AND_USERS_ID")
	@SequenceGenerator(name="ANSWERS_AND_USERS_SEQ", sequenceName="ANSWERS_AND_USERS_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ANSWERS_AND_USERS_SEQ")
	@Qualifier("answersAndUsersId")
	private int answersAndUsersId;
	
	@Column(name="USER_ID")
	@Qualifier("userId")
	private int userId;
	
	@Column(name="ANSWERS_ID")
	@Qualifier("answersId")
	private String answersId;

	public int getAnswersAndUsersId() {
		return answersAndUsersId;
	}

	public void setAnswersAndUsersId(int answersAndUsersId) {
		this.answersAndUsersId = answersAndUsersId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getAnswersId() {
		return answersId;
	}

	public void setAnswersId(String answersId) {
		this.answersId = answersId;
	}

	@Override
	public String toString() {
		return "AnswersAndUsers [answersAndUsersId=" + answersAndUsersId + ", userId=" + userId + ", answersId="
				+ answersId + "]";
	}

}
