package com.journaldev.spring.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.journaldev.spring.model.befitUser;
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class logindto {
	
	
	public logindto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public logindto(List<befitUser> list, String message, String status) {
		super();
		this.list = list;
		this.message = message;
		this.status = status;
	}
	private List<befitUser> list;
	private String message;
	private String status;
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<befitUser> getList() {
		return list;
	}
	public void setList(List<befitUser> list) {
		this.list = list;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
