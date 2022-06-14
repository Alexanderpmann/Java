package com.codingdojo;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RootController 
{
	@GetMapping("/")
	public String home
	(
			HttpSession session
	)
	{
		if(session.getAttribute("madlibs")==null)
		{
			session.setAttribute("madlibs", new ArrayList<Madlib>());
		}
		return "index";
	}
	
	@GetMapping("/show")
	public String show(Model model, HttpSession session)
	{
		return "show";
	}
	
		//Model model: 
//		Madlib madlib=new Madlib
//		(
//			(String)session.getAttribute("noun"),
//			(String)session.getAttribute("adjective"),
//			(String)session.getAttribute("verb")
//		);
		
//		Replaced with the above class
//		String noun=(String) session.getAttribute("noun");
//		String adjective=(String) session.getAttribute("adjective");
//		String verb=(String) session.getAttribute("verb");
		
//		String madlib="The "+adjective+" "+noun+" "+verb+".";
		
//		model.addAttribute("madlib",madlib);
		
		
	
	@PostMapping("/submit")
	public String process
	( 
			@RequestParam("noun") String noun,
			@RequestParam("adjective") String adjective,
			@RequestParam("verb") String verb,
			HttpSession session
	)
	{
		ArrayList<Madlib> libs=(ArrayList<Madlib>) session.getAttribute("madlibs");
		libs.add(new Madlib(noun,adjective,verb));
//		session.setAttribute("madlibs", libs);
		return "redirect:/show";
		}
	};
		
//		System.out.println("Noun: "+noun);
//		System.out.println("Adjective: "+adjective);
//		System.out.println("Verb: "+verb); 
		
//		session.setAttribute("noun",noun);
//		session.setAttribute("adjective",adjective);
//		session.setAttribute("verb",verb);
		
	
