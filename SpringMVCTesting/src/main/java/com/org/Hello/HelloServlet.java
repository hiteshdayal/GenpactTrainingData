package com.org.Hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.org.Beans.User;

@Controller
public class HelloServlet {

	@RequestMapping(path = "/", method = RequestMethod.POST)  
    public String display(@ModelAttribute User user)  
    {  
		System.out.println(user);
        return "index";  
    }
	@RequestMapping(path = "/page", method = RequestMethod.POST)
	public String nextPage(@ModelAttribute User user) {
		System.out.println(user);
		return "page";
		
	}
	
}
