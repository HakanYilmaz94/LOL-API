package com.lol.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstPageWebController {

	@GetMapping(value = "/views/checkUser")
	public String getBillingView(
			@RequestParam(name = "username", required = true, defaultValue = "") String username,
			Model model) {

		model.addAttribute("username",username);
		return "firstPage";
	}

}
