package com.example.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "menu")
public class Menu {

	@Id
	@Column (name = "menu_id")
	private Long menu_id;
	
	@Column (name = "name")
	private String name;
	
	@Column (name = "_desc")
	private String desc;
	
	@Column (name = "controller")
	private String controller;
	
	@Column (name = "_function")
	private String function;
	
	
	public Menu() {
		super();
	}
	
	public Menu(Long menu_id, String name, String desc, String controller, String function) {
		super();
		this.menu_id = menu_id;
		this.name = name;
		this.desc = desc;
		this.controller = controller;
		this.function = function;
	}

	public Long getMenu_id() {
		return menu_id;
	}


	public void setMenu_id(Long menu_id) {
		this.menu_id = menu_id;
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


	public String getController() {
		return controller;
	}


	public void setController(String controller) {
		this.controller = controller;
	}


	public String getFunction() {
		return function;
	}


	public void setFunction(String function) {
		this.function = function;
	}
	
}
