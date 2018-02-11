package com.conneqtor.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.conneqtor.beans.AnswerPool;
import com.conneqtor.beans.Questions;
import com.conneqtor.beans.QuestionsDTO;
import com.conneqtor.dao.QuestionsDao;
import com.conneqtor.dao.QuestionsDaoImpl;

@Component
public class QuestionsService {

	QuestionsDao questionsDao = new QuestionsDaoImpl();
	AnswerPoolService answerPoolService = new AnswerPoolService();
	
	public List<Questions> getAllQuestions(){
		System.out.println("in getAllQuestions service");
		return questionsDao.getAllQuestions();
	}
	
	public Questions getQuestionsById(int id) {
		System.out.println("in getQuestionsById service");
		System.out.println("for id: " + id);
		return questionsDao.getQuestionById(id);
	}
	
	public List<QuestionsDTO> getAllQuestionsAndAnswers(){
		System.out.println("In get all quesstions and answers service");
		List<QuestionsDTO> questionsDTOList = new ArrayList<QuestionsDTO>();
		
		//add questions to DTO
		List<Questions> questionsList = getAllQuestions();
		for(int i = 0; i < questionsList.size(); i++) {
			QuestionsDTO questionsDTO = new QuestionsDTO();
			questionsDTO.setQuestionId(questionsList.get(i).getQuestionId());
			questionsDTO.setQuestion(questionsList.get(i).getQuestion());
			questionsDTOList.add(questionsDTO);
		}
		
		//add answers to DTO
		List<AnswerPool> answerPoolList = answerPoolService.getAllAnswerPools();
		for(int k = 0; k < answerPoolList.size(); k++) {
			questionsDTOList.get(k).setA(answerPoolList.get(k).getA());
			questionsDTOList.get(k).setB(answerPoolList.get(k).getB());
			questionsDTOList.get(k).setC(answerPoolList.get(k).getC());
			questionsDTOList.get(k).setD(answerPoolList.get(k).getD());
			questionsDTOList.get(k).setE(answerPoolList.get(k).getE());
			questionsDTOList.get(k).setF(answerPoolList.get(k).getF());
		}
		
		return questionsDTOList;
	}
}
