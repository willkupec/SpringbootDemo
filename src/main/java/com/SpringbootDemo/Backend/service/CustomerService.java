package com.SpringbootDemo.Backend.service;

import com.SpringbootDemo.Backend.model.Customer;

import java.util.List;

public interface CustomerService {
    public Customer registerCustomer(Customer customer);
    public List<Customer> getAllCustomers();
}
