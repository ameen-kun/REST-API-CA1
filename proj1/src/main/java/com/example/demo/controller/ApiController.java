package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Address;

@RestController
public class ApiController {
	public List<Address> createAdd(){
		List<Address> l=new ArrayList<Address>();
		l.add(new Address("Ash","001,Blue Skies Green Forest",560076));
		l.add(new Address("Suzuki","002,Black Forest",560076));
		l.add(new Address("Itsuki","003,White Forest",560076)); 
		l.add(new Address("Izuki","004,Red Velevet Fort",560076));
		l.add(new Address("Fushiguro","005,Black Current Lake",560076));
		l.add(new Address("Naruto","006,Greenwich Block",560076));
		return l;
	}
@GetMapping("/")
public List<Address> getAddress() {
	return createAdd();
	}
}
