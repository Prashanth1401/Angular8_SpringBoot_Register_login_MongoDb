package com.godrej.controller;



import com.godrej.domain.Customer;
import com.godrej.exception.CustomerAlreadyExistsException;
import com.godrej.exception.CustomerNotFoundException;
import com.godrej.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v2")
@CrossOrigin
public class CustomerController {

    private ResponseEntity responseEntity;
    private CustomerService customerService;


    @Autowired
    public CustomerController(final CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("customer")
    public ResponseEntity<?> saveCustomer(@RequestBody Customer customer) throws CustomerAlreadyExistsException {
        try {
            customerService.saveCustomerDetail(customer);
            responseEntity = new ResponseEntity(customer , HttpStatus.CREATED);
        } catch (CustomerAlreadyExistsException e) {
            throw new CustomerAlreadyExistsException();
        }
        catch (Exception e)
        {
            responseEntity = new ResponseEntity<>("Error  !!!Try after sometime", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return responseEntity;
    }

    @DeleteMapping("customer/{customerId}")
    public ResponseEntity<?> deleteCustomer(@PathVariable("customerId") int customerId) throws CustomerNotFoundException {

        try {
            customerService.deleteCustomer(customerId);
            responseEntity = new ResponseEntity("Successfully deleted !!!", HttpStatus.OK);
        } catch (CustomerNotFoundException e) {

            throw new CustomerNotFoundException();

                    }
        catch (Exception exception){
            String ex = exception.getMessage();
            System.out.println(exception.getMessage());
            responseEntity = new ResponseEntity("Error !!! Try after sometime.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }

    @GetMapping("customers")
    public ResponseEntity<?> getAllCustomer(){


        try{

            responseEntity = new ResponseEntity(customerService.getAllCustomerDetail(), HttpStatus.OK);

        }catch (Exception e){
            responseEntity = new ResponseEntity("Error !!! Try after sometime.", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return responseEntity;

    }
    @GetMapping("customers/{city}")
    public ResponseEntity<?> getAllCustomerByCity(@PathVariable String city){


        try{

            responseEntity = new ResponseEntity(customerService.getAllCustomersByCity(city), HttpStatus.OK);

        }catch (Exception e){
            responseEntity = new ResponseEntity("Error !!! Try after sometime.", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return responseEntity;

    }

}
