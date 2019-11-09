package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//新秀注释
@Controller
public class HelloWordController {
    @RequestMapping("/hello")
	public String hello() {
	return "hw";
	
	
}
}
