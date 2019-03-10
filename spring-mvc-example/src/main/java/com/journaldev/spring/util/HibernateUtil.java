package com.journaldev.spring.util;

import java.io.Serializable;
import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.journaldev.spring.dto.befitUserDto;
import com.journaldev.spring.model.Employee;
import com.journaldev.spring.model.befitUser;


@Repository
@Transactional
public class HibernateUtil {
	
	@Autowired
    private SessionFactory sessionFactory;
		
    public <T> Serializable create(final T entity) {
        return sessionFactory.getCurrentSession().save(entity);        
    }
    
    public <T> T update(final T entity) {
        sessionFactory.getCurrentSession().update(entity);   
        return entity;
    }
    
	public <T> void delete(final T entity) {
		sessionFactory.getCurrentSession().delete(entity);
	}

	public <T> void delete(Serializable id, Class<T> entityClass) {
		T entity = fetchById(id, entityClass);
		delete(entity);
	}
    
    @SuppressWarnings("unchecked")	
    public <T> List<T> fetchAll(Class<T> entityClass) {        
        return sessionFactory.getCurrentSession().createQuery(" FROM "+entityClass.getName()).list();        
    }
  
    @SuppressWarnings("rawtypes")
	public <T> List fetchAll(String query) {        
        return sessionFactory.getCurrentSession().createSQLQuery(query).list();        
    }
    
    @SuppressWarnings("unchecked")
	public <T> T fetchById(Serializable id, Class<T> entityClass) {
        return (T)sessionFactory.getCurrentSession().get(entityClass, id);
    }
    @SuppressWarnings("unchecked")
    public befitUserDto login(String mobile,String password)
    {
    
    	befitUserDto dt=new befitUserDto();
   	String hql = "FROM befitUser E WHERE E.mobile = " + mobile +" " +"and  E.password = " +password ;
   	System.out.println("hql results:" + hql);
    
    	Session session=sessionFactory.getCurrentSession();
    	Query query=session.createQuery(hql);
    	List<befitUser> list=query.list();
    	befitUser bf=new befitUser();
    	
    	
    	if(!list.isEmpty())
    	{
    		bf=list.get(0);
    		System.out.println(bf.getId());
    		dt.setStatus("true");
    		dt.setId(bf.getId());
    		return dt;
    	}
    	else
    	{
    		dt.setStatus("false");
    		
    		return dt;
    	}
    	
    }
    
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

	
}
