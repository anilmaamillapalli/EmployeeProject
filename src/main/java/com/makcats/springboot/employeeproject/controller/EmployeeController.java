package com.makcats.springboot.employeeproject.controller;

import com.makcats.springboot.employeeproject.entity.Employee;
import com.makcats.springboot.employeeproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/save")
    public ResponseEntity<String> saveStudent(@RequestBody Employee employee){
       String response= employeeService.saveEmployee(employee);
         return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
