package com.tcs.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcContoller {
	@Autowired
	UserService service;
	
	@RequestMapping("/")
	public String home()
	{	return "index";
	}
	
	@RequestMapping("/register")
	public String signup(Model model)
	{	model.addAttribute("user",new User());
		return "signup";
	}
	
	@RequestMapping("/process_register")
	public String processRegister(User user)
	{
		service.registerUser(user);
		return "sucess";
	}

	@RequestMapping("/login")
	public String login(Model model)
	{	model.addAttribute("user",new User());
		return "login";
	}	
	@RequestMapping("/process_login")
	public String processLogin(User user)
	{	return service.loginCheck(user)?"loginsucess":"loginfail";
	}
	@RequestMapping("/search")
	public String search(Model model)
	{	model.addAttribute("user",new User());
		return "search";
	}	
	
	@RequestMapping("/process_search")
	public String processSearch(Model model,User user)
	{	model.addAttribute("user",new User());
		return service.searchData(user)?"ss":"sf";
	}
}