package com.example.lunch_management_system.controller;


import com.example.lunch_management_system.modals.Employee;
import com.example.lunch_management_system.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;


    @PostMapping("addEmployee")
    public ResponseEntity<?> addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @GetMapping("getEmployee/{id}")
    public ResponseEntity<?> getEmployee(@PathVariable String id){
        return employeeService.getEmployee(id);

    }

    @GetMapping("getAllEmployees")
    public List<Employee> getAllEmployees(){
        return employeeService.findAllEmployees();
    }

}
