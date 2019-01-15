package com.example.hibernate.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.hibernate.entity.News;
import com.example.hibernate.service.NewsService;

@Controller
public class MainController {
	@RequestMapping("/")
	public String login(Model model) {
		return "list";	
	}
	
	@Autowired
	private NewsService newsService;
	
	@GetMapping("/news")
	public String index(Model model) {
		model.addAttribute("news", newsService.findAll());
		return "list";
	}

	@GetMapping("/news/create")
	public String create(Model model) {
		model.addAttribute("news", new News());
		return "form";
	}

	@GetMapping("/news/{news_id}/edit")
	public String edit(@PathVariable int id, Model model) {
		model.addAttribute("news", newsService.findOne(id));
		return "form";
	}

	@PostMapping("/news/save")
	public String save(@Valid News news, BindingResult result, RedirectAttributes redirect) {
		if (result.hasErrors()) {
			return "form";
		}
		newsService.save(news);
		redirect.addFlashAttribute("success", "Saved employee successfully!");
		return "redirect:/news";
	}

	@GetMapping("/news/{news_id}/delete")
	public String delete(@PathVariable int id, RedirectAttributes redirect) {
		newsService.delete(id);
		redirect.addFlashAttribute("success", "Deleted employee successfully!");
		return "redirect:/news";
	}

	@GetMapping("/news/search")
	public String search(@RequestParam("s") String s, Model model) {
		if (s.equals("")) {
			return "redirect:/news";
		}

		model.addAttribute("news", newsService.search(s));
		return "list";
	}
}
