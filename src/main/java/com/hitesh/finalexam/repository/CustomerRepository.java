package com.hitesh.finalexam.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hitesh.finalexam.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}