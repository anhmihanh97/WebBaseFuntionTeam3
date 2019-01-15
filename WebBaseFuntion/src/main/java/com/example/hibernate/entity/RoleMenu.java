
  package com.example.hibernate.entity;

  import javax.persistence.Column; import javax.persistence.Entity; import
  javax.persistence.Id; import javax.persistence.Table;

  @Entity
  @Table (name = "tbl_role_menu")
  public class RoleMenu {

  @Id

  @Column (name = "role_id") private Long roleId;

  @Column (name = "menu_id") private Long menuId;

  @Column (name = "status") private int status;

  public RoleMenu() { super(); }

      public RoleMenu(Long roleId, Long menuId, int status) {
          this.roleId = roleId;
          this.menuId = menuId;
          this.status = status;
      }

      public Long getRoleId() {
          return roleId;
      }

      public void setRoleId(Long roleId) {
          this.roleId = roleId;
      }

      public Long getMenuId() {
          return menuId;
      }

      public void setMenuId(Long menuId) {
          this.menuId = menuId;
      }

      public int getStatus() {
          return status;
      }

      public void setStatus(int status) {
          this.status = status;
      }
  }
