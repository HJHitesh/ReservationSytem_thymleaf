package com.hitesh.finalexam.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hitesh.finalexam.model.Reservation;

public interface ReservationRepository extends MongoRepository<Reservation, String> {
}