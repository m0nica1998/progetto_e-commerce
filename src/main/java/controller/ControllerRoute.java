package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ControllerRoute {
	 @GetMapping("/test")
	    public String test() {
	        return "home";
	    }
	 @GetMapping
	public String homepage(Model model) {
		System.out.println("entro in homepage");
		return "home";
	}
}
