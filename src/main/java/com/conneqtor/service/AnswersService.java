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
		return answersDao.getAnswerById(id);
	}
}
