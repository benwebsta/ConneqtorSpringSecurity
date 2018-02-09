package com.conneqtor.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.conneqtor.beans.Answers;
import com.conneqtor.config.HibernateUtil;

public class AnswersDaoImpl implements AnswersDao{

	@Override
	public List<Answers> getAllAnswers() {
		System.out.println("get all ANSWERS dao");
		Session sess = HibernateUtil.getSession();

		System.out.println("get all ANSWERS dao");
		Transaction tx;

		try {
			tx = sess.beginTransaction();
			Query query = sess.createQuery("FROM Answers");
			List<Answers> result = query.list();
			System.out.println("Answers: \n\n" + result);
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
	public Answers getAnswerById(int id) {
		Session sess = HibernateUtil.getSession();
		Transaction tx;
		
		try {
			tx = sess.beginTransaction();
			Answers result = (Answers)sess.get(Answers.class, id);
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
