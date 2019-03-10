package com.journaldev.spring.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.journaldev.spring.daoImp.befitUserDaoImp;
import com.journaldev.spring.dto.logindto;
import com.journaldev.spring.model.befitUser;
import com.journaldev.spring.service.befitUserService;
@Service

public class befitUserServiceImp implements befitUserService {
	@Autowired
	private befitUserDaoImp bdao;
	@Override
	public long register(befitUser befitUser) {
		return bdao.registerBefitUser(befitUser);
		
	}
	@Override
	public logindto login(String mobile, String password) {
		logindto dt=new logindto();
		 dt=bdao.getBefitUser(mobile, password);
		 
		 
		return dt;
	}
	

}
