package com.Demo.demoProject.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import com.Demo.demoProject.Model.User;
import com.Demo.demoProject.Service.customerService;

@SuppressWarnings("unused")
@RestController
//@RequestMapping("/users")
public class Customercontroller {
//	@GetMapping("/user/{userName}")
//	public String getUserName(@PathVariable(name="userName")String name) {
//	return "My name is "+ name;
//
//}
	
//	@GetMapping("/user/{userName}/{age}/{location}")
//	public String getInfo(@PathVariable(name="userName")String name,
//			@PathVariable(name="age")String age,
//			@PathVariable(name="location")String location) {
//		return "My name is "+name +"I am " + age +"I am from " + location;
//	}
	
////	@GetMapping("/users")
////	public String getName(@RequestParam(name = "userName") String name) {
////		return "My name is "+name;
////	}
////	
////	@GetMapping("/customers")
////	public String getCustomerName(@RequestParam(defaultValue = "anonymous") String name) {
////		return "My name is "+name;
////	}
////	
////	@GetMapping("/employees")
////	public String getEmployeeName(@RequestParam(required = false) String name) {
////		return "My name is "+name;
//	}
//	@PostMapping("/users")
//	public String printUser(@RequestBody User user) {
//		System.out.println("Printing the user Object" +user);
//		return"success";
//	}
//	
//	@GetMapping("/users")
//	public @ResponseBody User getUser() {
//		User user = new User();
//		user.getName("Ankush");
//		user.getLocation("India");
//		user.getAge(22L);
//		
//		return user;
//		
//	}
//}
//	 @RequestMapping("/user")
//	 public String getUser() {
//		 return "Success";
//	 }
	
	@Autowired
	customerService cService;
	@SuppressWarnings("rawtypes")
	@GetMapping("/Customers")
	public List getList() {
		return cService.getCustomerList();
	}
	
}
