package com.tseringkalden.dojo_ninja.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.tseringkalden.dojo_ninja.models.Dojo;
import com.tseringkalden.dojo_ninja.services.AppService;

@Controller

public class DojoController {

	@Autowired
	private AppService appservice;

	@GetMapping("/dojo/new")
	public String newDojo(@ModelAttribute("dojoObject") Dojo dojo) {
		return "new.jsp";
	}

	@PostMapping("/dojo/new")
	public String createDojo(@Valid @ModelAttribute("dojoObject") Dojo dojo, BindingResult result) {
		System.out.println(dojo.getName());
		if(result.hasErrors()) {
			return "new.jsp";
		}else {
			appservice.createDojo(dojo);
			return "redirect:/dojo/new";
		}
	}

	public String show(@PathVariable("id") Long id, Model model) {
		Dojo dojo = appservice.findDojo(id);
		model.addAttribute("dojo", dojo);
		return "show.jsp";
	}

}
