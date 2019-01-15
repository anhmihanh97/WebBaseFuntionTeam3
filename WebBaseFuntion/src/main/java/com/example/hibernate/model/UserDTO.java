package com.example.hibernate.model;

import org.springframework.web.multipart.MultipartFile;

public class UserDTO {
	private int userId;
	private String fullName;
	private String email;
		private String mobile;
		private String password;
		private String status;
		private MultipartFile avatar;
	public UserDTO() {
			super();
		}
	public UserDTO(int userId, String fullName, String email, String mobile, String password, String status,
				MultipartFile avatar) {
		super();
		this.userId = userId;
		this.fullName = fullName;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.status = status;
		this.avatar = avatar;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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

	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public MultipartFile getAvatar() {
		return avatar;
	}
	public void setAvatar(MultipartFile avatar) {
		this.avatar = avatar;
	}
	
}
