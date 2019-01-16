package exaple.spring.people.model;

public class PersonalDTO {
	private int personalId;
	private String firstName;
	private String lastName;
	private String mobile;
	private String email;
	private String hobbies;
	private String desciption;
	public PersonalDTO() {
		super();
	}
	public PersonalDTO(int personalId, String firstName, String lastName, String mobile, String email, String hobbies,
			String desciption) {
		super();
		this.personalId = personalId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.email = email;
		this.hobbies = hobbies;
		this.desciption = desciption;
	}
	public int getPersonalId() {
		return personalId;
	}
	public void setPersonalId(int personalId) {
		this.personalId = personalId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getDesciption() {
		return desciption;
	}
	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	
}
