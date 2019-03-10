package com.journaldev.spring.service;


import com.journaldev.spring.dto.logindto;
import com.journaldev.spring.model.befitUser;

public interface befitUserService
{
	
	
	
	public long register(befitUser befitUser);

	public logindto login(String mobile,String password);
	
	
}
