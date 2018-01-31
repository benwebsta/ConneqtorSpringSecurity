package com.conneqtor.dao;

import java.util.List;

import com.conneqtor.beans.AnswerPool;

public interface AnswerPoolDao {
	public List<AnswerPool> getAllAnswerPools();
	public AnswerPool getAnswerPoolById(int id);
}
