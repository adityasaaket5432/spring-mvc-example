package com.journaldev.spring.dto;

import org.springframework.stereotype.Component;

@Component
public class userDto 
{
	private String Name;
	//private String Id;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	/*public String getId() {
		return Id;
	}*/
	public userDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public userDto(String name) {
		super();
		Name = name;
	
	}
	/*public void setId(String id) {
		Id = id;
	}
	*/
	
	

}
