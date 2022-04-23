package com.bridgelabz.employeepayroll.service;

import com.bridgelabz.employeepayroll.dto.EmployeeDTO;
import com.bridgelabz.employeepayroll.model.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeePayrollService {
    public String getMessage(String name) ;
    public String postMessage(Employee employee);
    public String putMessage(String name) ;
    public String getWelcome();
    public Employee postDataToRepo(Employee employee);
    public List<Employee> getAllData();
    public Employee getDataById(Integer id);
    public Employee updateDataById(Integer id, EmployeeDTO employeeDTO);
    public String deleteDataById(Integer id);
}

