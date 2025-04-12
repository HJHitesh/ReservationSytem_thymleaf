package com.hitesh.finalexam.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hitesh.finalexam.model.Payment;

public interface PaymentRepository extends MongoRepository<Payment, String> {
}