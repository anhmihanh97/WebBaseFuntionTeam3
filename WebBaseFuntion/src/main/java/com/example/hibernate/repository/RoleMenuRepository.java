package com.example.hibernate.repository;

import com.example.hibernate.entity.RoleMenu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/*
 * Creadted by Libra on 15/01/2019
 */
public interface RoleMenuRepository {
    public List<RoleMenu> getALLRoleMenu() ;

    public void addRoleMenu(RoleMenu user);

    public void deleteRoleMenu(RoleMenu user);

    public void updateRoleMenu(RoleMenu user);

    public RoleMenu getAllRoleMenu(int id);
}
