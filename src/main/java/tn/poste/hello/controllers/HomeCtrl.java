package tn.poste.hello.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tn.poste.hello.models.ui.FormData;

@Controller
public class HomeCtrl {
	
	@RequestMapping(path = "/home" , method = RequestMethod.GET)
	public String getHome(Model model) {
		model.addAttribute("data", new FormData());
		return "hello/name-selection";
	}
	
	//@RequestMapping(path = "/home" , method = RequestMethod.POST)
	@PostMapping("/home")
	public String goToHelloName(@ModelAttribute("data") FormData data) {
		return "redirect:/home/"+data.getName();
	}
	 
	@RequestMapping(path = "/home/{value}")
	public String goToHome(@PathVariable("value") String name, Model model) {
		model.addAttribute("obj", name);
		return "hello/home";
	}

}
