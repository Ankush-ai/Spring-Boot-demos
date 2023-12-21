package com.Demo.demoProject.Service;

import org.springframework.stereotype.Service;
import com.Demo.demoProject.Entity.Products;
import com.Demo.demoProject.Exceptions.NoDataFoundException;
import com.Demo.demoProject.Exceptions.ResourceNotFoundException;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductService {
	private static List<Products> list = new ArrayList<>();
	static {
		list.add(new Products("iPhone XR", 1, 500.00));
		list.add(new Products("Galaxy Note 10", 2, 700.00));
		list.add(new Products("Oneplus Nord", 3, 400.00));
		list.add(new Products("Galaxy S10", 4, 750.00));
		list.add(new Products("iPhone 11", 5, 700.00));
	}
	 public List<Products> getList(){
		 if(list.size()>0) {
			 return list;
		 }
		 throw new NoDataFoundException("No products available");
	 }
	 
	 public Products getProducts(Integer id) {
		 Optional<Products> theProduct= list.stream().filter(p -> p.getId() == id).findFirst();
		 if(!theProduct.isPresent()) {
			 throw new ResourceNotFoundException("No product found for id ->" + id);
		 }
		 return theProduct.get();	 }
	

}
