package com.training.booking.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.booking.dto.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
