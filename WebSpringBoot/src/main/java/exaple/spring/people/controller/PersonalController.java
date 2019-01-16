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
import org.springframework.web.bind.annotation.RequestParam;


import exaple.spring.people.model.PersonalDTO;
import exaple.spring.people.service.PersonalService;

@Controller
public class PersonalController {
	@Autowired
	private PersonalService personalService;
	
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: return home 
	 * Version 1.0
	 * @param request
	 * @return
	 */
	@GetMapping(value = "/")
	public String home(HttpServletRequest request) {
		/*
		 * UserDetails userDetails=(UserDetails)
		 * SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		 */
		
		request.setAttribute("m","m"/*environment.getProperties()+userDetails.getUsername()*/);
		return "index";
	}
	
	
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: return admin1
	 * Version 1.0
	 * @param request
	 * @return
	 */
	/*
	 * @GetMapping(value = "/admin1") public String admin1(HttpServletRequest
	 * request) { request.setAttribute("m", "mt"); return "admin1"; }
	 */
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: return login
	 * Version 1.0
	 * @param requestr
	 * @return
	 */
	@GetMapping(value = "/login")
	public String login(HttpServletRequest requestr) {
		requestr.setAttribute("ma", "m");
		return "login";
	}

	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: return login
	 * Version 1.0
	 * @param request
	 * @param error
	 * @return
	 */
	@PostMapping(value = "/login")
	public String loginadd(HttpServletRequest request,@RequestParam(name="e",required=false) String error) {
		if(error!=null) {
			request.setAttribute("e", error);
		}
		return "redirect:/login";
	}
	
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: return out login
	 * Version 1.0
	 * @param request
	 * @param error
	 * @return
	 */
	@PostMapping(value = "/logout")
	public String loginout(HttpServletRequest request,@RequestParam(name="e",required=false) String error) {
		if(error!=null) {
			request.setAttribute("e", error);
		}
		return "redirect:/login";
	}
	
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: return regiter
	 * Version 1.0
	 * @param request
	 * @return
	 */
	@GetMapping(value = "/register")
	public String register(HttpServletRequest request) {
		request.setAttribute("mr", "mt");
		return "register";
	}
	
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: return admin
	 * Version 1.0
	 * @param model
	 * @return
	 */
	@GetMapping(value = "/admin")
	public String User(Model model) {
		List<PersonalDTO> users = personalService.getAllPersonal();
		model.addAttribute("list", users);
		
		return "admin";
	}
	
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: return detailAdmin
	 * Version 1.0
	 * @param request
	 * @param id
	 * @return
	 */
	@GetMapping(value = "/detail-admin/{id}")
	public String getUser(HttpServletRequest request,@PathVariable("id") int id) {
	
		request.setAttribute("list", personalService.getAllPersonal(id));
		return "detailAdmin";
	}
	
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: return addUser
	 * Version 1.0
	 * @param model
	 * @return
	 */
	@GetMapping(value = "/add-admin")
	public String addUser(Model model) {
		model.addAttribute("Userss",new PersonalDTO());
		return "addUser" ;
	}
	
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: return admin
	 * Version 1.0
	 * @param model
	 * @param personalDTO
	 * @return
	 */
	@PostMapping(value = "/add-admin")
	public String addUser(Model model, @ModelAttribute(name = "Userss") PersonalDTO personalDTO) {
		personalService.addPersonal(personalDTO);
		return "redirect:/admin";
	}
	
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: return admin
	 * Version 1.0
	 * @param model
	 * @param id
	 * @return
	 */
	@GetMapping(value = "/delete-admin/{id}")
	public String deleteUser(Model model,@PathVariable("id") int id) {
		personalService.deletePersonal(id);
		return "redirect:/admin" ;
	}
	
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: return editUser
	 * Version 1.0
	 * @param model
	 * @param id
	 * @return
	 */
	@GetMapping(value="/edit-user/{id}")
	public String editUser(ModelMap model,@PathVariable("id") String id) {
		model.addAttribute("user", personalService.getAllPersonal(Integer.parseInt(id)));
		return "editUser";
		
	} 
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: return admin 
	 * Version 1.0
	 * @param model
	 * @param personalDTO
	 * @param bindingResuls
	 * @return
	 */
	@PostMapping(value="/edit-user")
	public String editUser(ModelMap model,@ModelAttribute("user") PersonalDTO personalDTO,BindingResult bindingResuls) {
		personalService.updatePersonal(personalDTO);
	return "redirect:/admin";
	} 
	
	
}
