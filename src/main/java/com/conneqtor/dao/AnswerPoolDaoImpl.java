package com.conneqtor.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.conneqtor.beans.AnswerPool;
import com.conneqtor.config.HibernateUtil;

public class AnswerPoolDaoImpl implements AnswerPoolDao{

	@Override
	public List<AnswerPool> getAllAnswerPools() {

		System.out.println("get all answer pools dao");
		Session sess = HibernateUtil.getSession();

		System.out.println("get all answer pools dao");
		Transaction tx;

		try {
			tx = sess.beginTransaction();
			Query query = sess.createQuery("FROM AnswerPool");
			List<AnswerPool> result = query.list();
			System.out.println("AnswerPool: \n\n" + result);
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
	public AnswerPool getAnswerPoolById(int id) {
		Session sess = HibernateUtil.getSession();
		Transaction tx;
		
		try {
			tx = sess.beginTransaction();
			AnswerPool result = (AnswerPool)sess.get(AnswerPool.class, id);
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
