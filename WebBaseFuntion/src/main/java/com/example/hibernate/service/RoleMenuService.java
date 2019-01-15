package com.example.hibernate.service;

import com.example.hibernate.entity.RoleMenu;

import java.util.List;

/*
 * Creadted by Libra on 15/01/2019
 */
public interface RoleMenuService {
    public List<RoleMenu> getAllRoleMenu();

    public void addRoleMune(RoleMenu roleMenu);

    public void deleteRoleMenu(int id);
}
