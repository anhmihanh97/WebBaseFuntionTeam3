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
import com.example.hibernate.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String index(Model model) {
		List<Role> roles = userService.getAllUser();
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
		Optional<Role> userEdit = userService.findUserById(userId);
		userEdit.ifPresent(role -> model.addAttribute("role", role));
		return "editUser";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteUser(@RequestParam("role_id") Long userId, Model model) {
		userService.deleteUser(userId);
		return "redirect:/";

	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String save(Role user) {
		userService.saveUser(user);
		return "redirect:/";
	}
	
}
