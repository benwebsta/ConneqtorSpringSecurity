package com.conneqtor.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.conneqtor.beans.Questions;
import com.conneqtor.dao.QuestionsDao;
import com.conneqtor.dao.QuestionsDaoImpl;

@Component
public class QuestionsService {

	QuestionsDao questionsDao = new QuestionsDaoImpl();
	
	public List<Questions> getAllQuestions(){
		System.out.println("in getAllQuestions service");
		return questionsDao.getAllQuestions();
	}
	
	public Questions getQuestionsById(int id) {
		System.out.println("in getQuestionsById service");
		System.out.println("for id: " + id);
		return questionsDao.getQuestionById(id);
	}
}
