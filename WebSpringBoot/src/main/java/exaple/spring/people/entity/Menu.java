package exaple.spring.people.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "menu")
public class Menu {

	@Id

	@Column(name = "menu_id")
	private int menuId;

	@Column(name = "name")
	private String name;

	@Column(name = "_desc")
	private String desc;

	@Column(name = "controller")
	private String controller;

	@Column(name = "_function")
	private String function;

	public Menu() {
		super();
	}

	public Menu(int menuId, String name, String desc, String controller, String function) {
		super();
		this.menuId = menuId;
		this.name = name;
		this.desc = desc;
		this.controller = controller;
		this.function = function;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
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