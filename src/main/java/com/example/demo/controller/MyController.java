package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	int c;

	@PostMapping("/add")
	public int addTwo(@RequestParam int a,@RequestParam int b) {
		System.out.println("a value is:"+a+" b value is:"+b+" Sum is:"+(a+b));
		 c=a+b;
		return c;
	}
	@PutMapping("/update/{a}")
	public int update(@PathVariable int a) {
		c=a;
		return c;
		

}}
