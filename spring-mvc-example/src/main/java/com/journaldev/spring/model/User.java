package com.journaldev.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	private String userName;
	
	

	

	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		System.out.println("set userName called");
	}
}
