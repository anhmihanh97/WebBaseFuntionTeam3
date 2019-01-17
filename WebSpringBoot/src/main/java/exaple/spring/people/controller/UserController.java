package exaple.spring.people.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import exaple.spring.people.entity.User;
import exaple.spring.people.model.UserDTO;
import exaple.spring.people.service.UserService;
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	/*
	 * @Autowired Environment environment;
	 */

	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: ....
	 * Version 1.0
	 * @param model
	 * @return
	 */
	@GetMapping(value = "/admin1")
	public String Users(Model model) {
		List<UserDTO> users = userService.getAllUser();
		model.addAttribute("lists", users);
		
		return "admin1";
	}
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: ....
	 * Version 1.0
	 * @param request
	 * @param id
	 * @return
	 */
	@GetMapping(value = "/detail-admins/{id}")
	public String getUsers(HttpServletRequest request,@PathVariable("id") int id) {
	
		request.setAttribute("lists", userService.getAllUser(id));
		return "detailAdmins";
	}
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: ....
	 * Version 1.0
	 * @param model
	 * @return
	 */
	@GetMapping(value = "/add-admins")
	public String addUsers(Model model) {
		model.addAttribute("Userss",new UserDTO());
		return "addUsers" ;
	}

	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: ....
	 * Version 1.0
	 * @param model
	 * @param userDTO
	 * @return
	 */
	@PostMapping(value = "/add-admins")
	public String addUsers(Model model, @ModelAttribute(name = "Userss") UserDTO userDTO) {
		userService.addUser(userDTO);
		return "redirect:/admin1";
	}
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: ....
	 * Version 1.0
	 * @param model
	 * @param id
	 * @return
	 */
	@GetMapping(value = "/delete-admins/{id}")
	public String deleteUsers(Model model,@PathVariable("id") int id) {
		userService.deleteUser(id);
		return "redirect:/admin1" ;
	}
	
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 16, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 16, 2019
	 * Description: ....
	 * Version 1.0
	 * @param model
	 * @param id
	 * @return
	 */
	@GetMapping(value="/edit-users/{id}")
	public String editUsers(ModelMap model,@PathVariable("id") String id) {
		model.addAttribute("user", userService.getAllUser(Integer.parseInt(id)));
		return "editUsers";
		
	} 
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 16, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 16, 2019
	 * Description: ....
	 * Version 1.0
	 * @param model
	 * @param userDTO
	 * @param bindingResuls
	 * @return
	 */
	@PostMapping(value="/edit-users")
	public String editUsers(ModelMap model,@ModelAttribute("user") UserDTO userDTO,BindingResult bindingResuls) {
		userService.updateUser(userDTO);
	return "redirect:/admin1";
	} 
	
}
