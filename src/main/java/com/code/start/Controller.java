package com.code.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	Repo r;
	
	
	@PostMapping("/addEmail")
	public String addEmail(@RequestBody EmailModel email)
	{
		r.save(email);
		return "addition successful";
		
	}
	
}
