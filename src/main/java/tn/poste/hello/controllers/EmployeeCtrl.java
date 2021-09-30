package tn.poste.hello.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;
import tn.poste.hello.services.EmployeeService;

@Controller
public class EmployeeCtrl {

	private EmployeeService empService;
	
	@GetMapping("/add/emp")
	public String addEmp() {
		empService.testAddData();
		empService.getAll();
		empService.getAllCreator();
		return "redirect:/";
	}
}
