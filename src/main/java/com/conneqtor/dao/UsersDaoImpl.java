package com.conneqtor.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.conneqtor.beans.Users;
import com.conneqtor.config.HibernateUtil;

public class UsersDaoImpl implements UsersDao{

	@Override
	public List<Users> getAllUsers() {

		System.out.println("get all USERS dao");
		Session sess = HibernateUtil.getSession();

		System.out.println("get all USERS dao");
		Transaction tx;

		try {
			tx = sess.beginTransaction();
			Query query = sess.createQuery("FROM Users");
			List<Users> result = query.list();
			System.out.println("Users: \n\n" + result);
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
	public Users getUsersById(int id) {
		Session sess = HibernateUtil.getSession();
		Transaction tx;
		
		try {
			tx = sess.beginTransaction();
			Users result = (Users)sess.get(Users.class, id);
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
