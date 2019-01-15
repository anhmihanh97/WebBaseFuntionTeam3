package com.example.hibernate.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.hibernate.model.UserDTO;
import com.example.hibernate.service.UserService;

@Controller
public class MainController {
	@Autowired
	private UserService userService;

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
		List<UserDTO> users = userService.getAllUser();
		model.addAttribute("list", users);
		
		return "admin";
	}
	@GetMapping(value = "/detail-admin/{id}")
	public String getUser(HttpServletRequest request,@PathVariable("id") int id) {
	
		request.setAttribute("list", userService.getAllUser(id));
		return "detailAdmin";
	}
	@GetMapping(value = "/add-admin")
	public String addUser(Model model) {
		model.addAttribute("Userss",new UserDTO());
		return "addUser" ;
	}

	@PostMapping(value = "/add-admin")
	public String addUser(Model model, @ModelAttribute(name = "Userss") UserDTO userDTO) {
		userService.addUser(userDTO);
		return "redirect:/admin";
	}
	@GetMapping(value = "/delete-admin/{id}")
	public String deleteUser(Model model,@PathVariable("id") int id) {
		userService.deleteUser(id);
		return "redirect:/admin" ;
	}
}
