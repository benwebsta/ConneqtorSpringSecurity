package com.conneqtor.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.conneqtor.beans.Roles;
import com.conneqtor.config.HibernateUtil;

public class RolesDaoImpl implements RolesDao{

	@Override
	public List<Roles> getAllRoles() {

		System.out.println("get all ROLES dao");
		Session sess = HibernateUtil.getSession();

		System.out.println("get all ROLES dao");
		Transaction tx;

		try {
			tx = sess.beginTransaction();
			Query query = sess.createQuery("FROM Roles");
			List<Roles> result = query.list();
			System.out.println("Roles: \n\n" + result);
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
	public Roles getRolesById(int id) {
		Session sess = HibernateUtil.getSession();
		Transaction tx;
		
		try {
			tx = sess.beginTransaction();
			Roles result = (Roles)sess.get(Roles.class, id);
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
