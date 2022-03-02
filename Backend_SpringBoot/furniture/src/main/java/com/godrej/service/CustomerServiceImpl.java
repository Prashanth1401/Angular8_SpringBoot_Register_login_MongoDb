package com.godrej.service;


import com.godrej.domain.Customer;


import com.godrej.exception.CustomerAlreadyExistsException;
import com.godrej.exception.CustomerNotFoundException;

import com.godrej.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer saveCustomerDetail(Customer customer) throws CustomerAlreadyExistsException {
//        if(customerRepository.findById(customer.getCustomerId()).isPresent())
//        {
//            throw new CustomerAlreadyExistsException();
//        }
        return customerRepository.save(customer);
    }

//    @Override
//    public boolean deleteCustomer(int customerCode) throws CustomerNotFoundException {
//        boolean flag = false;
//        if(customerRepository.findById(customerCode).isEmpty())
//        {
//            throw new CustomerNotFoundException();
//        }
//        else {
//            customerRepository.deleteById(customerCode);
//            flag = true;
//        }
//        return flag;

   // }

    @Override
    public List<Customer> getAllCustomerDetail() throws Exception {
        return customerRepository.findAll();
    }

    @Override
    public List<Customer> getAllCustomersByCity(String city) throws CustomerNotFoundException {
        return null;
    }

//    @Override
//    public List<Customer> getAllCustomersByCity(String city) throws CustomerNotFoundException {
//        if(customerRepository.findAllCustomerFromCity(city).isEmpty())
//        {
//            throw new CustomerNotFoundException();
//        }
//        return customerRepository.findAllCustomerFromCity(city);
//        // return null;
//    }
}
