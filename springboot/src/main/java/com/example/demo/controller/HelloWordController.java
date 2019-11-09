package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//董明辉
@Controller
public class HelloWordController {
    @RequestMapping("/hello")
	public String hello() {
	return "hw";
	
	//我是东
}
}
