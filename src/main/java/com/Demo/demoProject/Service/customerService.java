package com.Demo.demoProject.Service;

import org.springframework.stereotype.Service;

import com.Demo.demoProject.Entity.Customer;

import java.util.List;
import java.util.ArrayList;

@Service
public class customerService {
	public static List<Object> list=new ArrayList<>();
	static {
	      Customer c=new Customer();
	      c.setName(22L);
	      c.setId(1L);
	      c.setName("Ankush");
	      list.add(c);
	      
	      c=new Customer();
	      c.setName(22L);
	      c.setId(2L);
	      c.setName("Rohan");
	      list.add(c);
	      
	      c=new Customer();
	      c.setName(22L);
	      c.setId(3L);
	      c.setName("Vijay");
	      list.add(c);
		
	}
	
	public List<Object> getCustomerList() {
		return list;
	}
	

}
