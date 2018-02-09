package com.conneqtor.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.conneqtor.beans.AnswerPool;
import com.conneqtor.beans.UserRoles;
import com.conneqtor.config.HibernateUtil;

public class UserRolesDaoImpl implements UserRolesDao{

	@Override
	public List<UserRoles> getAllUserRoles() {

		System.out.println("get all USER ROLES dao");
		Session sess = HibernateUtil.getSession();

		System.out.println("get all USER ROLES dao");
		Transaction tx;

		try {
			tx = sess.beginTransaction();
			Query query = sess.createQuery("FROM UserRoles");
			List<UserRoles> result = query.list();
			System.out.println("UserRoles: \n\n" + result);
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
	public UserRoles getUserRolesById(int id) {
		Session sess = HibernateUtil.getSession();
		Transaction tx;
		
		try {
			tx = sess.beginTransaction();
			UserRoles result = (UserRoles)sess.get(UserRoles.class, id);
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
