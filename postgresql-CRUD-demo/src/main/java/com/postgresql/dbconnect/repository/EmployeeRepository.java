package com.postgresql.dbconnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postgresql.dbconnect.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	

}
