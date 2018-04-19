package com.conneqtor.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.conneqtor.beans.Answers;
import com.conneqtor.beans.QuestionFormDTO;
import com.conneqtor.beans.Users;
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
	
	public QuestionFormDTO createAnswers(Answers answers) {
		System.out.println("in createAnswers service");
		System.out.println("for answers: " + answers.toString());
		QuestionFormDTO questionFormResponse = new QuestionFormDTO();
		UsersService usersService = new UsersService();
		
		Users checkUser = usersService.getUsersById(answers.getUserId());
		if(checkUser == null) {
			questionFormResponse.setResponse("User not found.");
			questionFormResponse.setResult(false);
		}
		else {
			Answers checkAnswers = getAnswersByUserId(answers.getUserId());
			if(checkAnswers == null) {
				boolean createAnswers = answersDao.createAnswers(answers);
				if(createAnswers) {
					questionFormResponse.setResponse("Answers submitted.");
					questionFormResponse.setResult(true);
				}
				else {
					questionFormResponse.setResponse("Answers failed to submit.");
					questionFormResponse.setResult(false);
				}
			}
			else {
				Answers tempAnswers = answersDao.getAnswersByUserId(answers.getUserId());
				answers.setAnswerId(tempAnswers.getAnswerId());
				boolean updateAnswers = answersDao.updateAnswers(answers);
				if(updateAnswers) {
					questionFormResponse.setResponse("Answers updated.");
					questionFormResponse.setResult(true);
				}
				else {
					questionFormResponse.setResponse("Answers failed to update.");
					questionFormResponse.setResult(false);
				}
			}
			
		}
		return questionFormResponse;
	}
	
	public double compareAnswers(int userId1, int userId2) {
		System.out.println("in compareAnswers service");
		System.out.println("for usersId1: " + userId1);
		System.out.println("and usersId2: " + userId2);
		Answers answers1 = answersDao.getAnswersByUserId(userId1);
		Answers answers2 = answersDao.getAnswersByUserId(userId2);
		System.out.println("answers1: " + answers1.toString());
		System.out.println("answers2: " + answers2.toString());
		
		double count = 0;
		if(answers1.getAnswer1().equals(answers2.getAnswer1()))
			count++;
		if(answers1.getAnswer2().equals(answers2.getAnswer2()))
			count++;
		if(answers1.getAnswer3().equals(answers2.getAnswer3()))
			count++;
		if(answers1.getAnswer4().equals(answers2.getAnswer4()))
			count++;
		if(answers1.getAnswer5().equals(answers2.getAnswer5()))
			count++;
		if(answers1.getAnswer6().equals(answers2.getAnswer6()))
			count++;
		if(answers1.getAnswer7().equals(answers2.getAnswer7()))
			count++;
		if(answers1.getAnswer8().equals(answers2.getAnswer8()))
			count++;
		if(answers1.getAnswer9().equals(answers2.getAnswer9()))
			count++;
		if(answers1.getAnswer10().equals(answers2.getAnswer10()))
			count++;
		if(answers1.getAnswer11().equals(answers2.getAnswer11()))
			count++;
		if(answers1.getAnswer12().equals(answers2.getAnswer12()))
			count++;
		if(answers1.getAnswer13().equals(answers2.getAnswer13()))
			count++;
		if(answers1.getAnswer14().equals(answers2.getAnswer14()))
			count++;
		if(answers1.getAnswer15().equals(answers2.getAnswer15()))
			count++;
		if(answers1.getAnswer16().equals(answers2.getAnswer16()))
			count++;
		if(answers1.getAnswer17().equals(answers2.getAnswer17()))
			count++;
		if(answers1.getAnswer18().equals(answers2.getAnswer18()))
			count++;
		if(answers1.getAnswer19().equals(answers2.getAnswer19()))
			count++;
		if(answers1.getAnswer20().equals(answers2.getAnswer20()))
			count++;
		if(answers1.getAnswer21().equals(answers2.getAnswer21()))
			count++;
		if(answers1.getAnswer22().equals(answers2.getAnswer22()))
			count++;
		if(answers1.getAnswer23().equals(answers2.getAnswer23()))
			count++;
		if(answers1.getAnswer24().equals(answers2.getAnswer24()))
			count++;
		if(answers1.getAnswer25().equals(answers2.getAnswer25()))
			count++;
		if(answers1.getAnswer26().equals(answers2.getAnswer26()))
			count++;
		if(answers1.getAnswer27().equals(answers2.getAnswer27()))
			count++;
		if(answers1.getAnswer28().equals(answers2.getAnswer28()))
			count++;
		if(answers1.getAnswer29().equals(answers2.getAnswer29()))
			count++;
		if(answers1.getAnswer30().equals(answers2.getAnswer30()))
			count++;
		if(answers1.getAnswer31().equals(answers2.getAnswer31()))
			count++;
		
		System.out.println("count: " + count);
		double percent = count/31.0;
		System.out.println("percent: " + percent);
		return percent;
	}
}
