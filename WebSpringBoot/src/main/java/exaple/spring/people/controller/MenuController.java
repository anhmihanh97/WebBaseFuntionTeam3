package exaple.spring.people.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import exaple.spring.people.model.MenuDTO;
import exaple.spring.people.service.MenuService;
@Controller
public class MenuController {
	@Autowired
	private MenuService menuService;
	
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
	@GetMapping(value = "/admin2")
	public String Users(Model model) {
		List<MenuDTO> menuDTO = menuService.getAllMenu();
		model.addAttribute("lists", menuDTO);
		return "admin2";
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
	@GetMapping(value = "/detail-admin2s/{id}")
	public String getUsers(HttpServletRequest request,@PathVariable("id") int id) {
		request.setAttribute("lists", menuService.getAllMenu(id));
		return "detailAdmin2s";
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
	@GetMapping(value = "/add-admin2s")
	public String addUsers(Model model) {
		model.addAttribute("Userss",new MenuDTO());
		return "addUser2s" ;
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
	@PostMapping(value = "/add-admin2s")
	public String addUsers(Model model, @ModelAttribute(name = "Userss") MenuDTO menuDTO) {
		menuService.addMenu(menuDTO);
		return "redirect:/admin2";
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
	@GetMapping(value = "/delete-admin2s/{id}")
	public String deleteUsers(Model model,@PathVariable("id") int id) {
		menuService.deleteMenu(id);
		return "redirect:/admin2" ;
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
	@GetMapping(value="/edit-user2s/{id}")
	public String editUsers(ModelMap model,@PathVariable("id") String id) {
		model.addAttribute("user", menuService.getAllMenu(Integer.parseInt(id)));
		return "editUser2s";
		
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
	@PostMapping(value="/edit-user2s")
	public String editUsers(ModelMap model,@ModelAttribute("user") MenuDTO menuDTO,BindingResult bindingResuls) {
		menuService.updateMenu(menuDTO);;
	return "redirect:/admin2";
	} 
}
