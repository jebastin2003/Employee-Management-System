package com.company.ems.service;

import com.company.ems.entity.Employee;
import com.company.ems.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Add new employee
    public Employee addEmployee(Employee employee) {
        employee.setStatus("Active");
        //employee.setDateOfJoining(LocalDate.now());
        return employeeRepository.save(employee);
    }

    // Get all active employees
    public List<Employee> getActiveEmployees() {
        return employeeRepository.findByStatus("Active");
    }

    // Get all past employees
    public List<Employee> getPastEmployees() {
        return employeeRepository.findByStatus("Resigned");
    }

    // Update employee details
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Remove employee (mark as Resigned)
    public void removeEmployee(int id) {
        Optional<Employee> empOpt = employeeRepository.findById(id);
        if (empOpt.isPresent()) {
            Employee emp = empOpt.get();
            emp.setStatus("Resigned");
            emp.setDateOfExit(LocalDate.now());
            employeeRepository.save(emp);
        }
    }

    // Delete from past employees (permanent delete)
    public void deletePastEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    // Get employee by ID
    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }
}
