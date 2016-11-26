package dev.spring.investigation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PatternController {
	
	@GetMapping("pattern")
	public String pattern(Model model){
		model.addAttribute("concept","pattern");
		
		//Matches the beginning of the jsp file in WEB-INF/views
		return "welcome";
	}

}
