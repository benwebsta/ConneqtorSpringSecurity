package com.conneqtor.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.conneqtor.beans.AnswerPool;
import com.conneqtor.dao.AnswerPoolDao;
import com.conneqtor.dao.AnswerPoolDaoImpl;

@Component
public class AnswerPoolService {

	AnswerPoolDao answerPoolDao = new AnswerPoolDaoImpl();
	
	public List<AnswerPool> getAllAnswerPools(){
		System.out.println("in getAllAnswerPools service");
		return answerPoolDao.getAllAnswerPools();
	}
	
	public AnswerPool getAnswerPoolById(int id) {
		System.out.println("in getAnswerPoolById service");
		System.out.println("for id: " + id);
		return answerPoolDao.getAnswerPoolById(id);
	}
}
