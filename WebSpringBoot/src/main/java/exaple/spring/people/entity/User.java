package exaple.spring.people.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User implements Serializable{

	@Id
	@Column (name = "user_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	
	@Column (name = "full_name")
	private String fullName;
	
	@Column (name = "email")
	private String email;
	
	@Column (name = "mobile")
	private String mobile;
	
	@Column (name = "password")
	private String password;
	
	@Column (name = "status")
	private String status;
	
	public User() {
		super();
	}

	public User(int userId, String fullName, String email, String mobile, String password, String status) {
		super();
		this.userId = userId;
		this.fullName = fullName;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.status = status;
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
}