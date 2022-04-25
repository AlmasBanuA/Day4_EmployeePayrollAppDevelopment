package com.bridgelabz.employeepayroll.service;

import com.bridgelabz.employeepayroll.dto.EmployeeDTO;
import com.bridgelabz.employeepayroll.model.Employee;

import java.util.List;
import java.util.Optional;

/**
 * Here we create an interface having some methods which we implement in EmployeePayrollService .
 */
public interface IEmployeePayrollService {
    String getMessage(String name);

    String postMessage(EmployeeDTO employee);

    String putMessage(String name);

    String getWelcome();

    public Employee postDataToRepo(EmployeeDTO employee);

    public List<Employee> getAllData();

    public Optional<Employee> getDataById(Integer id);

    public Employee updateDataById(Integer id, EmployeeDTO employeeDTO);

    public String deleteDataById(Integer id);
}
