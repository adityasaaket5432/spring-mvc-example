package com.journaldev.spring.dto;

public class response {
	
	private int id;
	private String name;
	public response() {
		super();
		// TODO Auto-generated constructor stub
	}
	public response(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
