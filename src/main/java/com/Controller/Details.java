package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.admin.Admin;
import com.service.AdminService;

@Controller
public class Details {
	@Autowired
	private AdminService adminService;

	@ModelAttribute
	public void desc(Model model) {
		model.addAttribute("Header","Registration page");
		model.addAttribute("Desc","Knowledge is divine");
		System.out.println("Attribute Data");
	}
	
@RequestMapping("/input")
public String show(Model model) {
	System.out.println("Show..");
	return "input";
}

@RequestMapping(path="/getInfo",method=RequestMethod.POST)   //here we used PostMapping where it is used to insert the data into the database.
public String data(@RequestParam("email") String email,@RequestParam("uName") String uName,
		@RequestParam("pass") String password,Model model) {
	Admin admin=new Admin();
	admin.setEmail(email);
	admin.setuName(uName); admin.setPass(password);
	System.out.println("Email"+email); System.out.println("Uname:"+uName);
	System.out.println("password:"+password);
	model.addAttribute("email",email);
	model.addAttribute("uName",uName); model.addAttribute("pass",password);
	this.adminService.s1(admin);
	
	return "success";
}
}
