package com.bridgelabz.employeepayroll.repository;

import com.bridgelabz.employeepayroll.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JPA is used to perform crud operations and customized operations as well
 */
public interface EmployeePayrollRepository extends JpaRepository<Employee, Integer> {
}
