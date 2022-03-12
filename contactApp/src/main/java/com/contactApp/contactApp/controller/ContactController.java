package com.contactApp.contactApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.contactApp.contactApp.entity.Contact;
import com.contactApp.contactApp.service.ContactService;

@Controller
public class ContactController {


	 @Autowired
	    private ContactService service;

	    @GetMapping("/userLogin1")
	    public String viewHomePage(Model model) {
	        List<Contact> listcontact = service.listAll();
	        model.addAttribute("listcontact", listcontact);
	        System.out.print("Get / ");	
	        return "index";
	    }

	    @GetMapping("/userLogin1/new")
	    public String add(Model model) {
	        model.addAttribute("contact", new Contact());
	        return "new";
	    }

	    @RequestMapping(value = "/userLogin1/save", method = RequestMethod.POST)
	    public String saveContact(@ModelAttribute("contact") Contact std) {
	    	System.out.println("Contact Saved Successfully1");

	    service.save(std);
            System.out.println("Contact Saved Successfully");
	        return "redirect:/userLogin1";
	    }
	    
	    

	    
	    
}
