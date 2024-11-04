package com.kodbook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {
	//push yfrrasdfghjkp[]poiuytre
	@GetMapping("/")
	public String index() {
		return"index";
	}
	@GetMapping("/openSignUp")
	public String openSignUp() {
		return"signUp";
	}
	
	@GetMapping("/openCreatePost")
	public String createPost() {
		return"createPost";
	}
	@GetMapping("/showposts")
	public String showPosts() {
		return"posts";
	}
}
