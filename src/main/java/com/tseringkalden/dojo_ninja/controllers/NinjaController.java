package com.tseringkalden.dojo_ninja.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tseringkalden.dojo_ninja.models.Ninja;
import com.tseringkalden.dojo_ninja.services.AppService;

@Controller
public class NinjaController {
	@Autowired
	private AppService appservice;
	
	@GetMapping("/ninja/new")
	public String newDojo(@ModelAttribute("ninjaObject") Ninja ninja, Model model ) {
		model.addAttribute("allDojos", appservice.getAllDojos());
		return "ninja.jsp";
	}
	@PostMapping("/ninja/new")
	public String createDojo(@Valid @ModelAttribute("ninjaObject") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "ninja.jsp";
		}else {
			appservice.createNinja(ninja);
			return "redirect:/ninja/new";
		}
	}
	
	
}



