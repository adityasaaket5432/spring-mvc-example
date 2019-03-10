package com.journaldev.spring.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_DEFAULT)

public class befitUserDto {
	private String fname;
	
	private long id;
	
	private String lname;
	
	private String mobile;
	
	private String password;
	
    private String Email;
	
	private String gender;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getStudentid() {
		return Studentid;
	}
	public void setStudentid(String studentid) {
		Studentid = studentid;
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
	private String country;
	
	
	private String pin;
	
	private String Studentid;
	
	
	private String message;
	
	private String status;

	
	
	
	
	
	
	public befitUserDto(String fname, long id, String lname, String mobile, String password, String email,
			String gender, String country, String pin, String studentid, String message, String status) {
		super();
		this.fname = fname;
		this.id = id;
		this.lname = lname;
		this.mobile = mobile;
		this.password = password;
		Email = email;
		this.gender = gender;
		this.country = country;
		this.pin = pin;
		Studentid = studentid;
		this.message = message;
		this.status = status;
	}
	public befitUserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
}
