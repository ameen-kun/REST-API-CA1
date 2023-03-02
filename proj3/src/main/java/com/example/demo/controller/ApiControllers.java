package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Family;

@RestController
public class ApiControllers {
	public List<Family> createFamily(){
		List<Family> l=new ArrayList<>();
		l.add(new Family("Ash",18,"Brother"));
		l.add(new Family("Suzu",15,"Sister"));
		l.add(new Family("Itsumi",36,"Mother"));
		l.add(new Family("Izu",13,"Brother"));
		l.add(new Family("AllMight",40,"Father"));
		return l;
	}
	
@GetMapping("/")
public List<Family> getFamiltDetails(){
	return createFamily();
}
}
