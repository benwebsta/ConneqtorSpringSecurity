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
@Table(name="ANSWERS")
public class Answers {
	
	@Id
	@Column(name="ANSWER_ID")
	@SequenceGenerator(name="ANSWERS_SEQ", sequenceName="ANSWERS_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ANSWERS_SEQ")
	@Qualifier("answerId")
	private int answerId;
	
	@Column(name="ANSWER")
	@Qualifier("answer")
	private String answer;
	
	@Column(name="USER_ID")
	@Qualifier("userId")
	private int userId;

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Answers [answerId=" + answerId + ", answer=" + answer + ", userId=" + userId + "]";
	}

}
