package com.eliaskrr.employeecontrol.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eliaskrr.employeecontrol.model.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{
	void deleteEmployeedById(Long id);
	Optional<Employee> findEmployeeById(Long id);
}
