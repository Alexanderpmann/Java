package com.codingdojo.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.models.Travel;
import com.codingdojo.services.TravelService;

@Controller
public class TravelController 
{
	    @Autowired
	    private TravelService travelService;

	// Create Page controller
	// get page -> create new

	    @GetMapping("/travels/new")
	    public String createTravel(Model model, HttpSession session)
	    {
	        // if user is not in session - redirect to login, else continue (insert on any get/post)
	        if(session.getAttribute("user")==null) return "redirect:/";
	        model.addAttribute("travelNew", new Travel());
	        return "new_travel";
	    }

	// post page data and redirect -> create new to dashboard

	    @PostMapping("/travels/new")
	    public String insertTravel(@Valid @ModelAttribute("travelNew") Travel travel, BindingResult errors)
	    {
	        if(errors.hasErrors())
	        {
	            return "new_travel";
	        }
	        travelService.create(travel);
	        return "redirect:/dashboard";
	    }

	// dashboard controller

	    @GetMapping("/dashboard")
	    public String allTravel(Model model)
	    {
	        model.addAttribute("allTravels", travelService.findAll());
	        return "dashboard";
	    }

	// show page controller

	    @GetMapping("/travels/{id}")
	    public String showTravel(Model model, @PathVariable("id")Long id)
	    {
	        model.addAttribute("travel", travelService.findById(id));
	        return "show_travel";
	    }

	// edit page controller

	    @GetMapping("/travels/{id}/edit")
	    public String editTravel(Model model, @PathVariable("id")Long id)
	        {
	            model.addAttribute("travel", travelService.findById(id));
	            return "editTravel";
	        }

	// post mapping = forms

	    @PostMapping("/travels/{id}")
	    public String updateTravel(@Valid @ModelAttribute("travel") Travel travel, BindingResult errors)
	    {
	        if(errors.hasErrors())
	        {
	            return "editTravel";
	        }
	        travelService.update(travel);
	        return "redirect:/dashboard";
	    }

	// delete controller

	    @GetMapping("/travels/{id}/delete")
	    public String deleteTravel(@PathVariable("id")Long id)
	    {
	        travelService.delete(id);
	        return "redirect:/dashboard";

	    }

	};
