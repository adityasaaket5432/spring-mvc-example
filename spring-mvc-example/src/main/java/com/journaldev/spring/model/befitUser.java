package com.journaldev.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class befitUser implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5891373852695550116L;
	/**
	 * 
	 */
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	@Column
	private String fname;
	
	@Column
	private String lname;
	
	@Column(unique = true)
	private String mobile;
	
	@Column
	private String password;
	
	@Column
	private byte[] profilePic;
	
	@Column
	private String Email;
	
	@Column
	private String gender;
	
	@Column
	private String country;
	
	@Column
	private String pin;
	
	@Column
	private String Studentid;
	
	
	
	
	
	public befitUser() {
		super();
		// TODO Auto-generated constructor stub
	}


	public befitUser(long id, String fname, String lname, String mobile, String password, byte[] profilePic,
			String email, String gender, String country, String pin, String studentid) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.mobile = mobile;
		this.password = password;
		this.profilePic = profilePic;
		Email = email;
		this.gender = gender;
		this.country = country;
		this.pin = pin;
		Studentid = studentid;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
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

	public byte[] getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(byte[] profilePic) {
		this.profilePic = profilePic;
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
	

}
