package com.example.hibernate.serviceimpl;

import com.example.hibernate.entity.RoleMenu;
import com.example.hibernate.entity.User;
import com.example.hibernate.model.UserDTO;
import com.example.hibernate.repository.RoleMenuRepository;
import com.example.hibernate.service.RoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/*
 * Creadted by Libra on 15/01/2019
 */
@Service
public class RoleMenuServiceIpml implements RoleMenuService {

    private RoleMenuRepository roleMenuRepository;

    @Override
    public List<RoleMenu> getAllRoleMenu() {
        List<RoleMenu> roleMenus = roleMenuRepository.getALLRoleMenu();

        List<RoleMenu> dtos= new ArrayList<RoleMenu>();
        for(RoleMenu u : roleMenus) {
            RoleMenu roleMenu = new RoleMenu();
            roleMenu.setRoleId(u.getRoleId());
            roleMenu.setMenuId(u.getMenuId());
            roleMenu.setStatus(u.getStatus());
            dtos.add(roleMenu);
        }
        return dtos;
    }

    @Override
    public void addRoleMune(RoleMenu roleMenu) {
        RoleMenu u = new RoleMenu();
        u.setRoleId(roleMenu.getRoleId());
        u.setMenuId(roleMenu.getMenuId());
        u.setStatus(roleMenu.getStatus());
        roleMenuRepository.addRoleMenu(u);
    }

    @Override
    public void deleteRoleMenu(int id) {
        RoleMenu roleMenu = roleMenuRepository.getAllRoleMenu(id);
        if(roleMenu != null) {
            roleMenuRepository.deleteRoleMenu(roleMenu);
        }
    }


}
