package com.controller;

import java.util.List;
import com.model.Employee;
import com.model.Company;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController {

    private Company company = new Company();

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return company.getEmpList();
    }
}