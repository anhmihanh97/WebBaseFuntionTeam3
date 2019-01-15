package com.example.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "role")
public class Role {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column (name = "role_id")
	private Long role_id;
	
	@Column (name = "name")
	private String name;
	
	@Column (name = "_desc")
	private String desc;

	
	
	public Role() {
		super();
	}


	public Role(Long role_id, String name, String desc) {
		super();
		this.role_id = role_id;
		this.name = name;
		this.desc = desc;
	}


	public Long getRole_id() {
		return role_id;
	}


	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}

}
