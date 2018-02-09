package com.conneqtor.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.conneqtor.beans.Questions;
import com.conneqtor.config.HibernateUtil;

public class QuestionsDaoImpl implements QuestionsDao{

	@Override
	public List<Questions> getAllQuestions() {

		System.out.println("get all QUESTIONS dao");
		Session sess = HibernateUtil.getSession();

		System.out.println("get all QUESTIONS dao");
		Transaction tx;

		try {
			tx = sess.beginTransaction();
			Query query = sess.createQuery("FROM Questions");
			List<Questions> result = query.list();
			System.out.println("Questions: \n\n" + result);
			tx.commit();
			if(!result.isEmpty())
				return result;
			else 
				return null;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Questions getQuestionById(int id) {
		Session sess = HibernateUtil.getSession();
		Transaction tx;
		
		try {
			tx = sess.beginTransaction();
			Questions result = (Questions)sess.get(Questions.class, id);
			tx.commit();
			if(result != null)
				return result;
			else 
				return null;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
