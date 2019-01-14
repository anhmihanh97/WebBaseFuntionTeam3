package com.example.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "user")
public class User {

	@Id
	@Column (name = "user_id")
	private Long user_id;
	@Column (name = "full_name")
	private String full_name;
	@Column (name = "email")
	private String email;
	@Column (name = "mobile")
	private int mobile;
	@Column (name = "password")
	private String password;
	@Column (name = "status")
	private boolean status;
	
	public User() {
		super();
	}
	
	public User(Long user_id, String full_name, String email, int mobile, String password, boolean status) {
		super();
		this.user_id = user_id;
		this.full_name = full_name;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.status = status;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
