package com.training.booking.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.booking.entity.Property;

public interface PropertyRepository extends JpaRepository<Property, Long> {

}
