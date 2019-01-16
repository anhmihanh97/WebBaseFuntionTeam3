package exaple.spring.people.model;

public class MenuDTO {
	private int menuId;
	private String name;
	private String desc;
	private String controller;
	private String function;
	public MenuDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MenuDTO(int menuId, String name, String desc, String controller, String function) {
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
