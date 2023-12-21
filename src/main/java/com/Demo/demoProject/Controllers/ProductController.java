package com.Demo.demoProject.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Demo.demoProject.Entity.Products;
import com.Demo.demoProject.Service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService pService;
	@GetMapping("/products")
	public List<Products> getList(){
		return pService.getList();
	}
	
	@GetMapping("/products/{id}")
	public Products getProducts(@PathVariable Integer id) {
		return pService.getProducts(id);
		
	}

}
