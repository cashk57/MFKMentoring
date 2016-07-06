package com.mfk;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mfk.models.User;

@Controller
public class DashboardController {
	
	 @RequestMapping("/greeting")
	    public String greeting(@RequestParam(value="name", required=false, defaultValue="UNF") String name, Model model) {
	     
		 User u1 = new User("Ronnie", "King", "ronnie.king@gmail.com", "abc123");
		 
		 model.addAttribute("school", name);
		 model.addAttribute("currentUser", u1);
         return "greeting";
	   }

}
