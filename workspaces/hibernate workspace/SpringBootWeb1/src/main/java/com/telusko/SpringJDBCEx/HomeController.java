package com.telusko.SpringJDBCEx;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	
	  @GetMapping("/") 
	  public String home() { 
	 //System.out.println("home called");
	  return "index"; 
	  }
	 
	@GetMapping("add")
	public ModelAndView add(@RequestParam("num1")int num1,@RequestParam("num2")int num2, ModelAndView mv) {
	
		int result =num1+num2;
		mv.addObject("result",result);
		mv.setViewName("result");

		return mv;
	}

}
