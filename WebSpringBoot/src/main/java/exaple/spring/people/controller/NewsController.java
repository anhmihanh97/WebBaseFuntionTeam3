package exaple.spring.people.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import exaple.spring.people.model.NewsDTO;
import exaple.spring.people.service.NewsService;

@Controller
public class NewsController {
	@Autowired
	private NewsService newsservice;
	@GetMapping(value = "/admin3")
	public String Users(Model model) {
		List<NewsDTO> newsDTO = newsservice.getAllNews();
		model.addAttribute("lists", newsDTO);
		return "admin3";
	}
}
