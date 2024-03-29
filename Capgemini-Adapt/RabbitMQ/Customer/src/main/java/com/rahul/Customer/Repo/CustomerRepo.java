package com.rahul.Customer.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rahul.Customer.Model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, String> {

}
