package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {

	@Autowired
	private ServletContext apprication;
	
	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	
	@RequestMapping("/result")
	public String result(Integer product1, Integer product2, Integer product3) {
		int total = product1 + product2 + product3;
		double tax = (product1 + product2 + product3) * 0.1;
		double taxTotal = total + tax;
		apprication.setAttribute("total", total);
		apprication.setAttribute("taxTotal", taxTotal);
		
		return "exam03-result";
		
	}
}
