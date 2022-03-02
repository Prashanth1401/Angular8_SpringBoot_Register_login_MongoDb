package com.godrej.service;


import com.godrej.domain.Customer;

import com.godrej.exception.CustomerAlreadyExistsException;
import com.godrej.exception.CustomerNotFoundException;


import java.util.List;

public interface CustomerService {
    Customer saveCustomerDetail(Customer customer) throws CustomerAlreadyExistsException;
   // boolean deleteCustomer(int id) throws CustomerNotFoundException;
    List<Customer> getAllCustomerDetail() throws Exception;
    List<Customer> getAllCustomersByCity(String city) throws CustomerNotFoundException;
}
