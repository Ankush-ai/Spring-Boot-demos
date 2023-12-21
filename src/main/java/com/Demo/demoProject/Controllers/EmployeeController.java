package com.Demo.demoProject.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.Demo.demoProject.Entity.Employee;
import com.Demo.demoProject.Entity.Products;
import com.Demo.demoProject.Exceptions.ErrorObject;
import com.Demo.demoProject.Service.EmployeeService;
import com.Demo.demoProject.Service.ProductService;

@SuppressWarnings("unused")
@RestController
public class EmployeeController {
	@Autowired
	EmployeeService eService;
	public List<Employee> getList1() {
		return eService.getList();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployee (@PathVariable Integer id) {
		return eService.getEmployee(id);
	
	
	

}
}
