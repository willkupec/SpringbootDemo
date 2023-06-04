package com.SpringbootDemo.Backend.controller;


import com.SpringbootDemo.Backend.model.Customer;
import com.SpringbootDemo.Backend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/register")
    public String register(@RequestBody Customer customer) {
        customerService.registerCustomer(customer);
        return "New customer registered";
    }

    @GetMapping("")
    public List<Customer> list(){
        return customerService.getAllCustomers();
    }

}
