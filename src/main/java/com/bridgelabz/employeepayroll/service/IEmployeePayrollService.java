package com.bridgelabz.employeepayroll.service;

import com.bridgelabz.employeepayroll.model.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeePayrollService {
    String getMessage(String name);

    Employee postMessage(Employee employee);

    String putMessage(String name);

    String getWelcome();

    public Employee postDataToRepo(Employee employee);

    public List<Employee> getAllData();

    public Optional<Employee> getDataById(Integer id);

    public Employee updateDataById(Integer id, Employee employee);

    public String deleteDataById(Integer id);
}

