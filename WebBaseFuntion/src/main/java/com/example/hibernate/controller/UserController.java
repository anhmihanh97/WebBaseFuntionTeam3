package com.example.hibernate.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.hibernate.entity.Role;
import com.example.hibernate.service.*;
import com.example.hibernate.service.impl.UserServiceImpl;

@Controller
public class UserController {

	@Autowired
	private RoleService roleService;
	
	@Autowired
	private UserServiceImpl serviceImpl;

//	@RequestMapping("/")
//	public String login() {
//		return "login";
//	}
	
//	@RequestMapping("/login")
//	public String login() {
//		if (@RequestParam("email") @RequestParam("password") {
//			return "redirect:/index";
//		} else {
//			return "login";
//		}
//	}
	
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Role> roles = roleService.getAllRole();
		model.addAttribute("roles", roles);
		return "index";
	}

	@RequestMapping(value = "/add")
	public String addUser(Model model) {
		model.addAttribute("role", new Role());
		return "addUser";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String editUser(@RequestParam("role_id") Long userId, Model model) {
		Optional<Role> userEdit = roleService.findRoleById(userId);
		userEdit.ifPresent(role -> model.addAttribute("role", role));
		return "editUser";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteUser(@RequestParam("role_id") Long userId, Model model) {
		roleService.deleteRole(userId);
		return "redirect:/";

	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String save(Role user) {
		roleService.saveRole(user);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(@RequestParam("text_search") String name, Model model) {
		List<Role> roles = serviceImpl.findByTitleContaining(name);
		model.addAttribute("roles", roles);
		return "index";
	}
}
