package exaple.spring.people.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "news")
public class News {

	@Id
	@Column(name = "news_id")
	private int newsId;

	@Column(name = "url")
	private String url;

	@Column(name = "title")
	private String title;

	@Column(name = "_desc")
	private String desc;

	@Column(name = "content")
	private String content;

	@Column(name = "status")
	private String status;

	@Column(name = "is_hot")
	private String isHot;
	/*
	 * @Column(name = "user_id") private Long user_id;
	 * 
	 * @Column(name = "approver_id") private Long approver_id;
	 */

	/*
	 * @Column(name = "created_at") private String createdAt;
	 * 
	 * @Column(name = "updated_at") private Date updatedAt;
	 * 
	 * @Column(name = "approved_at") private String approvedAt;
	 */

	public News() {
		super();
	}

	public News(int newsId, String url, String title, String desc, String content, String status, String isHot) {
		super();
		this.newsId = newsId;
		this.url = url;
		this.title = title;
		this.desc = desc;
		this.content = content;
		this.status = status;
		this.isHot = isHot;
	}

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
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

	public String getIsHot() {
		return isHot;
	}

	public void setIsHot(String isHot) {
		this.isHot = isHot;
	}

}
