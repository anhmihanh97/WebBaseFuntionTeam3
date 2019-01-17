package exaple.spring.people.model;

public class NewsDTO {
	private int newsId;
	private String url;
	private String title;
	private String desc;
	private String content;
	private String status;
	private String isHot;
	public NewsDTO() {
		super();
	}
	public NewsDTO(int newsId, String url, String title, String desc, String content, String status, String isHot) {
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
