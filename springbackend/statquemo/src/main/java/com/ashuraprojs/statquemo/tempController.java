package com.ashuraprojs.statquemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class tempController {

	@GetMapping("/")
	public String greet(HttpServletRequest req) {
		return "Welcome Banana Lord " + req.getSession().getId();
	}
}
