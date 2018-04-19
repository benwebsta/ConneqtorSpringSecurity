package com.conneqtor.dao;

import java.util.List;

import com.conneqtor.beans.Answers;

public interface AnswersDao {
	public List<Answers> getAllAnswers();
	public Answers getAnswersById(int answerId);
	public Answers getAnswersByUserId(int userId);
	public boolean createAnswers(Answers answers);
	public boolean updateAnswers(Answers answers);
}
