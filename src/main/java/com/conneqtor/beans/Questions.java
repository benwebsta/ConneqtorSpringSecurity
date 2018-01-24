package com.conneqtor.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="QUESTIONS")
public class Questions {
	
	@Id
	@Column(name="QUESTION_ID")
	@Qualifier("questionId")
	private int questionId;
	
	@Column(name="QUESTION")
	@Qualifier("question")
	private String question;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Questions [questionId=" + questionId + ", question=" + question + "]";
	}

}
