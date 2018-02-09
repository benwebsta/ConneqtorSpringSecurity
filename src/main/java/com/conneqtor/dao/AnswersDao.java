package com.conneqtor.dao;

import java.util.List;

import com.conneqtor.beans.Answers;

public interface AnswersDao {
	public List<Answers> getAllAnswers();
	public Answers getAnswerById(int id);
}
