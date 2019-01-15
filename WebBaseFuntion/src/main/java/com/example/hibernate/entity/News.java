package com.example.hibernate.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "news")
public class News {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "news_id")
	private int news_id;
	
	@Column (name = "url")
	private String url;
	
	@Column (name = "title")
	private String title;
	
	@Column (name = "_desc")
	private String desc;
	
	@Column (name = "content")
	private String content;
	
	@Column (name = "status")
	private String status;
	
	@Column (name = "is_hot")
	private String is_hot;
	
	@Column (name = "user_id")
	private Long user_id;
	
	@Column (name = "approver_id")
	private Long approver_id;
	
	@Column (name = "created_at")
	private Date created_at;
	
	@Column (name = "updated_at")
	private Date updated_at;
	
	@Column (name ="approved_at")
	private Date approved_at;

	
	public News() {
		super();
	}


	public News(int news_id, String url, String title, String desc, String content, String status, String is_hot,
			Long user_id, Long approver_id, Date created_at, Date updated_at, Date approved_at) {
		super();
		this.news_id = news_id;
		this.url = url;
		this.title = title;
		this.desc = desc;
		this.content = content;
		this.status = status;
		this.is_hot = is_hot;
		this.user_id = user_id;
		this.approver_id = approver_id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.approved_at = approved_at;
	}


	public int getNews_id() {
		return news_id;
	}


	public void setNews_id(int news_id) {
		this.news_id = news_id;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getIs_hot() {
		return is_hot;
	}


	public void setIs_hot(String is_hot) {
		this.is_hot = is_hot;
	}


	public Long getUser_id() {
		return user_id;
	}


	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}


	public Long getApprover_id() {
		return approver_id;
	}


	public void setApprover_id(Long approver_id) {
		this.approver_id = approver_id;
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


	public Date getApproved_at() {
		return approved_at;
	}


	public void setApproved_at(Date approved_at) {
		this.approved_at = approved_at;
	}

	
}
