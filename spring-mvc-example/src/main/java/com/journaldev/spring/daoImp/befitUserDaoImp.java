package com.journaldev.spring.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.journaldev.spring.DAO.befitUserDao;
import com.journaldev.spring.dto.befitUserDto;
import com.journaldev.spring.dto.logindto;
import com.journaldev.spring.model.befitUser;
import com.journaldev.spring.util.HibernateUtil;

@Repository
public class befitUserDaoImp implements befitUserDao
{
	
	
	
	public befitUserDaoImp() {
		System.out.println("befitDaoImp ");
		// TODO Auto-generated constructor stub
	}

	@Autowired
    private HibernateUtil hibernateUtil;
	@Override
	public long registerBefitUser(befitUser befitUser) {
		
		return (long)hibernateUtil.create(befitUser);
		
		
		
	}
	
	@Override
	public logindto  getBefitUser(String mobile,String password) {
		
		befitUserDto dt=new befitUserDto();
		dt =hibernateUtil.login(mobile,password);
		logindto logindto=new logindto();
		
		if(dt.getStatus()=="true" ){
			logindto.setMessage("login success");
			logindto.setStatus("$200");
			logindto.setId(dt.getId());
			return logindto;
		} else {
			logindto.setMessage("login failed");
			logindto.setStatus("$600");
			return logindto;
		}
		
		
	}
	
	/*public logindto  getBefitUser(String mobile,String password) {
		
		String mobile2=mobile;
		String password2=password;
		
		List<befitUser> loginlist =hibernateUtil.login1(mobile2,password2);
		logindto logindto=new logindto();
		logindto.setList(loginlist);
		System.out.println(loginlist);
		return logindto;
	
	}*/
}
