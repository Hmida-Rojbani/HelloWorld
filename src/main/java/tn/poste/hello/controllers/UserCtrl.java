package tn.poste.hello.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.AllArgsConstructor;
import tn.poste.hello.models.ui.User;
import tn.poste.hello.services.UserService;

@Controller
@AllArgsConstructor
public class UserCtrl {

	private UserService userService;


	@GetMapping("/add/user")
	public String getUserForm(Model model) {
		model.addAttribute("user", new User());
		return "user/user-form";
	}

	@PostMapping("/add/user")
	public String getUserForm(Model model,@Valid @ModelAttribute("user") User user, BindingResult results) {
		if (results.hasErrors()) {
			return "user/user-form";
		}
		System.out.println(user);
		userService.saveUserToDb(user);
		return "redirect:/show/user";
	}
	
	@GetMapping("/show/user")
	public String getUserFromDB(Model model) {
		List<User> listUser = userService.getUserList();
		model.addAttribute("listUser", listUser);
		return "user/list-user";
	}

}
