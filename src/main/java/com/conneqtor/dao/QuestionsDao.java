package com.conneqtor.dao;

import java.util.List;

import com.conneqtor.beans.Questions;
import com.conneqtor.beans.QuestionsDTO;

public interface QuestionsDao {
	public List<Questions> getAllQuestions();
	public Questions getQuestionById(int id);
}
