package com.ustglobal.retailermvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.retailermvc.beans.Retailer;
import com.ustglobal.retailermvc.repo.RetailerRepo;
@Controller
public class RetailerController {

	@Autowired
	private RetailerRepo service;
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(int id,String password, HttpServletRequest request) {
		
		Retailer retailer = service.login(id, password);
		if(retailer==null) {
			request.setAttribute("msg", "Invalid Credentials");
			return "login";
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("retailer", retailer);
			return "home";
		}
		
	}
	@GetMapping("/updatepassword")
	public String changePassword(HttpServletRequest request) {
			HttpSession session = request.getSession(false);
			if(session!=null) {
				return "updatepassword";
			}else {
				return "login";
			}
	}
	
	@PostMapping("/updatepassword")
	public String changePassword(String password,String confirmpassword,
			@SessionAttribute(name="retailer")Retailer retailer,
			ModelMap map) {
		if(password.equals(confirmpassword)) {
			service.updatePassword(retailer.getId(),password);
			map.addAttribute("msg","Password changed");
		}else {
			map.addAttribute("msg", "Password not matching!");
		}
		return "home";
	}
	
	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}//register page end

	@PostMapping("/register")
	public String register(Retailer retailer,ModelMap map) {
		int  check = service.register(retailer);
		if(check>0) {
			map.addAttribute("msg","Registration SUCCESSFUL and id is "+check);

		}else {
			map.addAttribute("msg", "Email is repeated");
		}
		return "login";
	
	}
	@GetMapping("/home")
	public String home(ModelMap map , @SessionAttribute(name="retailer", required=false) Retailer retailer) {
		if(retailer==null) {
			map.addAttribute("msg","Login First");
			return "login";
		}else {
			return "home";
		}
	}
	@PostMapping
	public String home() {
		return "home";
	}
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}
}
