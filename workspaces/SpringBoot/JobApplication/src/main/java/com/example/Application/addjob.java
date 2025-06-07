package com.example.Application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class addjob {
	

	
	@GetMapping({"/", "home"})
    public String home() {
        return "home";
    }


    @GetMapping("addjob")
    public String addJob() {
        return "addjob";
    }
}
