package com.bridgelabz.employeepayroll.controller;

import com.bridgelabz.employeepayroll.dto.EmployeeDTO;
import com.bridgelabz.employeepayroll.dto.ResponseDTO;
import com.bridgelabz.employeepayroll.model.Employee;
import com.bridgelabz.employeepayroll.service.IEmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Spring RestController annotation is used to create RESTful web services using Spring MVC.
 */
@RestController
public class EmployeePayrollController {
    /**
     * @Autowired annotation is used in setter methods to inject the value of the class properties.
     * When the bean is loaded in the ApplicationContext, the setter method is automatically called by the
     * spring boot and the value is assigned.
     */
    @Autowired
    IEmployeePayrollService service;

    /**
     * Get data - Ability to display welcome message
     * with the help of ResponseEntity we can send the data with the HttpsStatus
     * @return -returns the welcome message
     */
    @GetMapping("/employeePayrollService")
    public ResponseEntity<String> getWelcome() {
        return new ResponseEntity<String>(service.getWelcome(), HttpStatus.OK);
    }

    /**
     * create record and Ability to save employee details to repository
     * @apiNote accepts the employee data in JSON format and stores it in DB
     * @param employee- represents object of EmployeeDTO class
     * @return accepted employee information in JSON format
     */
    @PostMapping("/employeePayrollService/create")
    public ResponseEntity<Employee> saveDataToRepo(@RequestBody EmployeeDTO employee) {
        return new ResponseEntity<Employee>(service.postDataToRepo(employee), HttpStatus.OK);
    }

    /**
     * Ability to get all employees' data by findAll() method
     * @return list of employee information from DB in JSON format
     */
    @GetMapping("/employeePayrollService/get")
    public ResponseEntity<List<Employee>> getAllDataFromRepo() {
        return new ResponseEntity<List<Employee>>(service.getAllData(), HttpStatus.OK);
    }

    /**
     * Ability to get employee data by id
     * @param id - represents employee id
     * @return employee information with same id in JSON format
     */
    @GetMapping("/employeePayrollService/get/{id}")
    public ResponseEntity<Employee> getDataFromRepoById(@PathVariable Integer id) {
        Optional<Employee> employee = service.getDataById(id);
        ResponseDTO dto = new ResponseDTO("Data",employee);
        return new ResponseEntity(dto, HttpStatus.OK);
    }

    /**
     * Ability to update employee data for particular id
     * @apiNote accepts the employee data in JSON format and updates the employee having same id from database
     * @param id - represents employee id
     * @param employeeDTO - represents object of EmployeeDTO class
     * @return	updated employee information in JSON format
     */
    @PutMapping("/employeePayrollService/update/{id}")
    public ResponseEntity<String> updateDataInRepo(@PathVariable Integer id, @RequestBody EmployeeDTO employeeDTO) {
        Employee employee = service.updateDataById(id, employeeDTO);
        ResponseDTO responseDTO = new ResponseDTO("Updating Employee PayrollData Successfuly:", employee);
        return new ResponseEntity(employeeDTO, HttpStatus.OK);
    }

    /**
     * delete records from database from particular id
     * @apiNote accepts the id and deletes the data of that employee from DB
     * @param id - represents employee id
     * @return id and Acknowledgment message
     */
    @DeleteMapping("/employeePayrollService/delete/{id}")
    public ResponseEntity<String> deleteDataInRepo(@PathVariable Integer id) {
        return new ResponseEntity<String>(service.deleteDataById(id), HttpStatus.OK);
    }
}
