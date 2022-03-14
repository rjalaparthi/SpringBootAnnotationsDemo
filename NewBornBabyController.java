package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewBornBabyController {
	@Value("${baby.weight: No Baby Weight property found}")
	String babyWeight;
	
	@Autowired
	NewBornBabyService newbornBabyService;
	
	@GetMapping("baby/name")
	public String getBabyName() {
	
		return "The Baby Name is " + newbornBabyService.getBabyName()+ " " +"The baby weight is "  +babyWeight ;
	}

}
