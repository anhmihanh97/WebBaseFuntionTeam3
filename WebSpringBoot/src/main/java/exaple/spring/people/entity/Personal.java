package exaple.spring.people.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="personal")
public class Personal implements Serializable{
	
	@Id
	@Column (name = "personal_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int personalId;
	
	@Column (name = "first_name")
	private String firstName;
	
	@Column (name = "last_name")
	private String lastName;
	
	@Column (name = "mobile")
	private String mobile;
	
	@Column (name = "email")
	private String email;
	
	@Column (name = "hobbies")
	private String hobbies;
	
	@Column (name = "desciption")
	private String desciption;

	public Personal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personal(int personalId, String firstName, String lastName, String mobile, String email, String hobbies,
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
