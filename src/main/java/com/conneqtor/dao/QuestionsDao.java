package com.conneqtor.dao;

import java.util.List;

import com.conneqtor.beans.Questions;

public interface QuestionsDao {
	public List<Questions> getAllQuestions();
	public Questions getQuestionById(int id);
}
