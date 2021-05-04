package com.example.student.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.student.entity.Register;
import com.example.student.repository.RegisterRepository;


@Controller
public class RegisterController {
	@Autowired
	private RegisterRepository registerRepo;

		
	@RequestMapping("/showReg")
	public String showReg() {
		return "showReg";
	}
	
	@RequestMapping("showLoginPage")
	public String showLoginPage() {
		return "login";
	}
	
	
	
	@RequestMapping("/saveReg")
	public String saveReg(@ModelAttribute("user") Register register) {
		registerRepo.save(register);
		return "login";
	}
	
	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("emailId") String emailId,@RequestParam("password") String password,ModelMap modelMap) {
		
		Register register = registerRepo.findByEmail(emailId);

		if(register!=null) {
		if(register.getEmail().equals(emailId) && register.getPassword().equals(password)) {
			return "dashboard";
		}else {
			modelMap.addAttribute("error","Invalid Username/Password");
			return "login";
		}
		}else {
			modelMap.addAttribute("error","Invalid Username/Password");
			return "login";
		}
	}	
}
