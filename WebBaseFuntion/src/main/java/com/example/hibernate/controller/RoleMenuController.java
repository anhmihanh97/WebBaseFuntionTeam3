package com.example.hibernate.controller;

import com.example.hibernate.entity.RoleMenu;
import com.example.hibernate.model.UserDTO;
import com.example.hibernate.service.RoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/*
 * Creadted by Libra on 15/01/2019
 */
@Controller
public class RoleMenuController {
    private RoleMenuService roleMenuService;

    @GetMapping(value = "/")
    public String home(HttpServletRequest request) {
        request.setAttribute("m", "mt");
        return "index";
    }
    @GetMapping(value = "/admin1")
    public String admin1(HttpServletRequest request) {
        request.setAttribute("m", "mt");
        return "admin1";
    }
    @GetMapping(value = "/login")
    public String login(HttpServletRequest request) {
        request.setAttribute("ma", "hello login");
        return "login";
    }

    @GetMapping(value = "/register")
    public String register(HttpServletRequest request) {
        request.setAttribute("mr", "mt");
        return "register";
    }

    @GetMapping(value = "/admin")
    public String User(Model model) {
        List<RoleMenu> users = roleMenuService.getAllRoleMenu();
        model.addAttribute("list", users);

        return "admin";
    }
    @GetMapping(value = "/add-admin")
    public String addUser(Model model) {
        model.addAttribute("Userss",new UserDTO());
        return "addUser" ;
    }

    @PostMapping(value = "/add-admin")
    public String addUser(Model model, @ModelAttribute(name = "Userss") RoleMenu roleMenu) {
        roleMenuService.addRoleMune(roleMenu);
        return "redirect:/admin";
    }
}
