package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtlantaController {
	@GetMapping("welcome")
	public String welcome() {
		return "Welcome to Atlanta!! Run Happy";
		
	}
}
