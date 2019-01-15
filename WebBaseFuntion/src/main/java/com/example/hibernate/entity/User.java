package com.example.hibernate.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "user")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
	private int status;
	
	@ManyToMany(cascade = CascadeType.ALL )
	@JoinTable(name="user_role", joinColumns=@JoinColumn(name="user_id"),inverseJoinColumns=@JoinColumn(name="role_id")	)
	private Set<Role>roles;
	
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
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
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public User(Long user_id, String full_name, String email, int mobile, String password, int status) {
		super();
		this.user_id = user_id;
		this.full_name = full_name;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.status = status;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
