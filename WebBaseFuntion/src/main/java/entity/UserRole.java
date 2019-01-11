package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_user_role")
public class UserRole {
	@Id
	@Column(name = "user_id", nullable = false)
    private int userID;
	
	@Id
	@Column(name = "role_id", nullable = false)
    private String roleID;
	
	@Column(name = "status")
    private String status;
	
	@Column(name = "created_at")
    private String createdAt;
	
	@Column(name = "update_at")
    private String updatedAt;
	
}
