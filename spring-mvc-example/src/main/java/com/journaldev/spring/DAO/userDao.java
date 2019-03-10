package com.journaldev.spring.DAO;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.journaldev.spring.model.User;

@Repository
public class userDao 
{
	@Autowired
    private SessionFactory sessionFactory;
		 
	
	
		public Session getSession()
		{
				 Session session=null;
				try
				{
					 session=sessionFactory.getCurrentSession();
				}
				catch(HibernateException e)
				{
					return sessionFactory.openSession();
				}
				return session;
		}
			
			
		public String addUser(User user)
		{
			Session session=getSession();
			session.save(user);
			return "";
		}
		public List<User> getUser()
		{
			Session session=getSession();
			return session.createCriteria(User.class).list();
			
		}



}


