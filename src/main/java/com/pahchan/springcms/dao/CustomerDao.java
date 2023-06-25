package com.pahchan.springcms.dao;

import com.pahchan.springcms.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerDao extends CrudRepository<Customer,Integer> {

    @Override
    List<Customer> findAll();
}
