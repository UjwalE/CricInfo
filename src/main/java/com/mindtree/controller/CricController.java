package com.mindtree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.entity.Player;
import com.mindtree.service.ICricService;

@Controller
public class CricController {
	
	@Autowired
	ICricService service;
	 
	@RequestMapping("/search")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "Sachin") String name) {
		System.out.println("in controller: "+ name);
		
		List<Player> list = service.searchPlayer(name);
 
		ModelAndView mv = new ModelAndView("matches");
		mv.addObject("list", list);
		return mv;
	}
}
