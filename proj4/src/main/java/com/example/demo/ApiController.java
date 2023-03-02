package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
private String name="Ashizuki";
public void setName(String name) {
	this.name=name;
}
@GetMapping("/{name}")
public String getName(@PathVariable String name) {
	setName(name);
	return "Hi "+this.name;
}
@GetMapping("/")
public String getName() {
	setName("Ashizuki");
	return "Hi "+this.name;
}
}
