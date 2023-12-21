package com.Demo.demoProject.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Demo.demoProject.Entity.TestEntity;

import jakarta.validation.Valid;

@RestController
public class TestController {

	 @PostMapping("/test")
	 public String test(@Valid @RequestBody TestEntity testEnt) {
		 return "succes";
	 }
}
