package com.godrej.repository;




import com.godrej.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer,Integer> {
    @Query("{'customerAddress.city' : {$in : [?0]}}")
    List<Customer> findAllCustomerFromCity(String city);
}


// In this scenario city is not property of the document Customer ,
// so we cannot use findBy methods, hence
// we use @Query and write a user defined query.
//  ?0 represents positional parameter