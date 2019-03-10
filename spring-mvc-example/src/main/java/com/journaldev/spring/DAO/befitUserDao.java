package com.journaldev.spring.DAO;



import java.util.List;

import com.journaldev.spring.dto.logindto;
import com.journaldev.spring.model.befitUser;


public interface befitUserDao 
{
	public long registerBefitUser(befitUser befitUser);
	public logindto getBefitUser(String mobile,String password);
	
}
