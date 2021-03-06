package com.codingdojo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/dojos")
@Controller
public class DojoController 
{
	@GetMapping("/new")
	public String renderDojo()
	{
		return "dojo";
	}
	
	@GetMapping("/{id}")
	public String findDojo(@PathVariable("id") Long dojoId )
	{
		return "dojo_show";
		
	}
};
