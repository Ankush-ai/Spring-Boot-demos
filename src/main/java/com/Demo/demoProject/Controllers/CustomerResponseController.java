package com.Demo.demoProject.Controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Demo.demoProject.Entity.Customer;

@RestController
public class CustomerResponseController {

    @GetMapping("/customer")
    public ResponseEntity<Customer> getCustomer() {
        Customer c = new Customer("Ankush","India");

        // Create HttpHeaders for the response
        HttpHeaders headers = new HttpHeaders();
        headers.add("token", "token value");

        // Return ResponseEntity with headers and response body
        return ResponseEntity.ok().headers(headers).body(c);
    }
}
