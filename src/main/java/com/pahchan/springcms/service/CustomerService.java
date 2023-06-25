package com.pahchan.springcms.service;

import com.pahchan.springcms.dao.CustomerDao;
import com.pahchan.springcms.exception.CustomerNotFoundException;
import com.pahchan.springcms.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;


    public Customer addCustomer(Customer customer) {

        return customerDao.save(customer);

    }

    public List<Customer> getCustomers() {

        return customerDao.findAll();

    }

    public Customer getCustomer(int customerId) {
        Optional<Customer> optionalCustomer = customerDao.findById(customerId);
        if(!optionalCustomer.isPresent())
            throw new CustomerNotFoundException("Customer Record not found");
        return optionalCustomer.get();
    }

    public Customer updateCustomer(int customerId, Customer customer){

        customer.setCustomerId(customerId);


        return customerDao.save(customer);

    }

    public void deleteCustomer(int customerId){

        customerDao.deleteById(customerId);
    }

}
