package com.example.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "role_menu")
public class RoleMenu {

	@Id
	@Column (name = "role_id")
	private Long role_id;
	
	@Column (name = "menu_id")
	private Long menu_id;
	
	@Column (name = "status")
	private boolean status;

	public RoleMenu() {
		super();
	}

	public RoleMenu(Long role_id, Long menu_id, boolean status) {
		super();
		this.role_id = role_id;
		this.menu_id = menu_id;
		this.status = status;
	}

	public Long getRole_id() {
		return role_id;
	}

	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}

	public Long getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(Long menu_id) {
		this.menu_id = menu_id;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
