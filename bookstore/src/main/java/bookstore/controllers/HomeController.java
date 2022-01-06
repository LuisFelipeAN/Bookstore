package bookstore.controllers;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bookstore.domain.User;
import bookstore.services.UserService;

@Controller
public class HomeController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Home page Requested, locale = "+locale);
		Date date = new Date();
		DateFormat dateFormat=DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime",formattedDate.toString());
		return "home";
	}
	
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public String user(@Validated User user, Model model) {
		System.out.println("User Page Resquested");
		model.addAttribute("username",user.getUsername());
		return "user";
	}
	
	@PostMapping("/add")
	public String addUser(@Validated User user,Model model) {
		User savedUser= userService.addUser(user);
		model.addAttribute("username",user.getUsername());
		if(savedUser!=null) {
			return "user";
		}else {
			return "user-error";
		}
		
		
		

	}
}
