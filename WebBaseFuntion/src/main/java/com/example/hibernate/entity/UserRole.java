package com.example.hibernate.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "user_role")
public class UserRole {

	@Id
	@Column (name = "user_id")
	private Long user_id;
	
	@Column (name = "role_id")
	private Long role_id;
	
	@Column (name = "status")
	private String status;
	
	@Column (name = "created_at")
	private Date created_at;
	
	@Column (name = "updated_at")
	private Date updated_at;

	public UserRole() {
		super();
	}

	public UserRole(Long user_id, Long role_id, String status, Date created_at, Date updated_at) {
		super();
		this.user_id = user_id;
		this.role_id = role_id;
		this.status = status;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Long getRole_id() {
		return role_id;
	}

	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	
}
