package com.conneqtor.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.conneqtor.beans.Answers;
import com.conneqtor.dao.AnswersDao;
import com.conneqtor.dao.AnswersDaoImpl;

@Component
public class AnswersService {

	AnswersDao answersDao = new AnswersDaoImpl();
	
	public List<Answers> getAllAnswers(){
		System.out.println("in getAllAnswers service");
		return answersDao.getAllAnswers();
	}
	
	public Answers getAnswersById(int id) {
		System.out.println("in getAnswersById service");
		System.out.println("for id: " + id);
		return answersDao.getAnswersById(id);
	}
	
	public Answers getAnswersByUserId(int userId) {
		System.out.println("in getAnswersByUserId service");
		System.out.println("for id: " + userId);
		return answersDao.getAnswersByUserId(userId);
	}
	
	public boolean createAnswers(Answers answers) {
		System.out.println("in createAnswers service");
		System.out.println("for answers: " + answers.toString());
		return answersDao.createAnswers(answers);
	}
}
