package tn.poste.hello.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import tn.poste.hello.models.ui.User;

@Controller
public class UserCtrl {
	
	@GetMapping("/add/user")
	public String getUserForm(Model model) {
		model.addAttribute("user", new User());
		return "user/user-form";
	}
	
	@PostMapping("/add/user")
	public String getUserForm(Model model, @ModelAttribute("user") User user) {
		System.out.println(user);
		model.addAttribute("user", new User());
		return "user/user-form";
	}
	

}
