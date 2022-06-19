package com.menorise.newaccount.service;

import com.menorise.newaccount.exception.CustomerNotFoundException;
import com.menorise.newaccount.model.Customer;
import com.menorise.newaccount.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    protected Customer findCustomerById(String id) {
        return customerRepository.findById(id).orElseThrow(
                ()-> new CustomerNotFoundException("Customer could not found by id:" + id));
    }
}
