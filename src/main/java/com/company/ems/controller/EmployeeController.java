package com.company.ems.controller;

import com.company.ems.entity.Employee;
import com.company.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Add new employee
    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    // Get all active employees
    @GetMapping("/active")
    public List<Employee> getActiveEmployees() {
        return employeeService.getActiveEmployees();
    }

    // Get all past employees
    @GetMapping("/past")
    public List<Employee> getPastEmployees() {
        return employeeService.getPastEmployees();
    }

    // Get employee by ID
    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    // Update employee
    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    // Remove employee (mark resigned)
    @PutMapping("/remove/{id}")
    public String removeEmployee(@PathVariable int id) {
        employeeService.removeEmployee(id);
        return "Employee removed successfully!";
    }

    // Delete from past employees permanently
    @DeleteMapping("/delete/{id}")
    public String deletePastEmployee(@PathVariable int id) {
        employeeService.deletePastEmployee(id);
        return "Past employee deleted permanently!";
    }
}
