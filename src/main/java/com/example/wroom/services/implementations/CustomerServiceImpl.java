package com.example.wroom.services.implementations;

import com.example.wroom.exceptions.CustomerNotFoundException;
import com.example.wroom.models.Customer;
import com.example.wroom.models.Person;
import com.example.wroom.services.CustomerService;

import java.util.List;
import java.util.UUID;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public void createCustomer(Customer customer) {

    }

    @Override
    public Customer findCustomerById(UUID id) throws CustomerNotFoundException {
        return null;
    }

    @Override
    public Customer findCustomerByEmail(Person email) throws CustomerNotFoundException {
        return null;
    }

    @Override
    public List<Customer> findAllCustomers() {
        return null;
    }

    @Override
    public void updateCustomer(Customer customer) throws CustomerNotFoundException {

    }

    @Override
    public void deleteCustomerById(UUID id) throws CustomerNotFoundException {

    }

    @Override
    public void restoreCustomerById(UUID id) throws CustomerNotFoundException {

    }
}
