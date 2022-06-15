package com.codingdojo;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping("/fruity")
public class RootController 
{
	@GetMapping("/")
	public String index
	(
			Model model
	) //Dependency Injection
	{	
		ArrayList<Item> items=new ArrayList<Item>();
		items.add(new Item("Watermelon",3.99));
		items.add(new Item("Apple Bananas",49.90));
		items.add(new Item("Buddha Pear",8.99));
		items.add(new Item("Haitian Mango",49.99));
		items.add(new Item("Pink Pineapple",39.99));
		
		model.addAttribute("cart",items);
		
		return "index";
	}
};
