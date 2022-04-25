package com.bridgelabz.employeepayroll.service;

import com.bridgelabz.employeepayroll.dto.EmployeeDTO;
import com.bridgelabz.employeepayroll.model.Employee;
import com.bridgelabz.employeepayroll.repository.EmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Service marks a Java class that performs some service,
 * such as executing business logic, performing calculations, and calling external APIs.
 */
@Service
public class EmployeePayrollService implements IEmployeePayrollService {
    @Autowired
    EmployeePayrollRepository repository;

    public String getMessage(String name) {

        return "Welcome To Employee Program " + name;
    }

    public String postMessage(EmployeeDTO employee) {
        return "Hello Employee " + employee.getFirstName() + "" + employee.getLastName() + "!";
    }

    public String putMessage(String name) {

        return "Hey Dude , " + name;
    }

    public String getWelcome() {

        return "Welcome to Employee Payroll App.....!";
    }

    /**
     * accepts the employee data in the form of EmployeeDTO and stores it in DB
     * @param employee - represents object of EmployeeDTO class
     * @return accepted employee information in JSON format
     */
    @Override
    public Employee postDataToRepo(EmployeeDTO employee) {
        Employee newEmployee = new Employee(employee);
        repository.save(newEmployee);
        return newEmployee;
    }

    /**
     * @return list of employee information from DB
     */
    @Override
    public List<Employee> getAllData() {
        List<Employee> list = repository.findAll();
        return list;
    }

    /**
     * @param id - represents employee id
     * @return employee information with same empId
     */
    @Override
    public Optional<Employee> getDataById(Integer id) {
        Optional<Employee> newEmployee = repository.findById(id);
        return newEmployee;
    }

    /**
     * accepts the employee data in the form of EmployeeDTO and
     * updates the employee having same id from database
     * @param id - represents employee id
     * @param employeeDTO - represents object of EmployeeDTO class
     * @return	updated employee information in JSON format
     */
    public Employee updateDataById(Integer id, EmployeeDTO employeeDTO) {
        Employee newEmployee = new Employee(id, employeeDTO);
        repository.save(newEmployee);
        return newEmployee;
    }

    /**
     * accepts the id and deletes the data of that employee from DB
     * @param id - represents employee id
     * @return empId and Acknowledgment message
     */
    public String deleteDataById(Integer id) {
        repository.deleteById(id);
        return "Employee with unique ID:" + id + " got deleted";
    }


}
