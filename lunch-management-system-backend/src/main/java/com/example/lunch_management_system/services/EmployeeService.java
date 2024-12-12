package com.example.lunch_management_system.services;


import com.example.lunch_management_system.modals.Employee;
import com.example.lunch_management_system.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {



    @Autowired
    private EmployeeRepository employeeRepository;



    public ResponseEntity<?> addEmployee(Employee employee){
        return new ResponseEntity<>(employeeRepository.save(employee), HttpStatus.OK);
    }

    public ResponseEntity<?> getEmployee(String id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()) {
            return new ResponseEntity<>(employee.get(), HttpStatus.OK);  // Return the employee object
        } else {
            return new ResponseEntity<>("Employee not found", HttpStatus.NOT_FOUND);  // Return 404 if employee is not found
        }
    }

    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }
}
