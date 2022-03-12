package com.contactApp.contactApp.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.contactApp.contactApp.entity.Contact;
import com.contactApp.contactApp.entity.User;
import com.contactApp.contactApp.repo.UserRepo;
import com.contactApp.contactApp.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@Autowired(required=true)
	private UserRepo repo;
	
	@GetMapping("/")
  public String login(Model model) {
		User user=new User();
		model.addAttribute("user",user);
	  return "login";
  }
	@PostMapping("/userLogin")
	public String loginUser(@ModelAttribute("user") User user) {
		
		String userId=user.getUserId();
		Optional<User> userdata=repo.findById(userId);
		//Optional<User> userdata=repo.findById(userId);
		if(user.getPassword().equals(userdata.get().getPassword())) {
			return "index";
		}else {
			return "error";
		}
		
	}
   
	@GetMapping("/userSignUp")
    public String add(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }
	
	//@PostMapping("/registerUser")
	
	//public String registerUser(@ModelAttribute("user")User user) {
	//	System.out.println("HEllo");
		//userservice.save(user);
		//return "/";
	//} 
	 @ResponseBody
	@RequestMapping(value = "/registerUser")
    public ModelAndView registerUser(@ModelAttribute("user")User user){
        ModelAndView mv = new ModelAndView("login");
        userservice.save(user);
        return mv;
    }
	
}












