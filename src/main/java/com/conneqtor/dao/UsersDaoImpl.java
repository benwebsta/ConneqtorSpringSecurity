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

		Session sess = HibernateUtil.getSession();
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

	@Override
	public Users getUsersByUsername(String username) {
		Session sess = HibernateUtil.getSession();
		Transaction tx;
		
		System.out.println("get user by username dao impl");
		System.out.println(username);
		
		try {
			tx = sess.beginTransaction();
			Query query = sess.createQuery("FROM Users WHERE username= :username");
			query.setParameter("username", username);
			List<Users> result = query.list();
			tx.commit();
			if(result.size() != 0)
				return result.get(0);
			else 
				return null;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public Users createUsers(Users user) {
		System.out.println("in createUsers daoImpl");
		System.out.println(user);
		Session sess = HibernateUtil.getSession();
		Transaction tx;
		
		 try {
		     tx = sess.beginTransaction();
		     System.out.println(" in tx");
		     System.out.println(user);
			 sess.saveOrUpdate(user);
			 System.out.println("end of tx");
		     tx.commit();
		     return user;

		 }
		 catch (Exception e) {
			 System.out.println(e);
			 e.printStackTrace();
			 return null;
		 }
		 finally {
		     sess.close();
		 }
	}
}
