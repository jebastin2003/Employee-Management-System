package com.company.ems.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String email;
    private String department;
    private String role;
    private double salary;
    private String status = "Active";
    private LocalDate dateOfJoining;
    private LocalDate dateOfExit;

    public Employee() {}

    public Employee(String name, String email, String department, String role, double salary, LocalDate dateOfJoining) {
        this.name = name;
        this.email = email;
        this.department = department;
        this.role = role;
        this.salary = salary;
        this.status = "Active";
        this.dateOfJoining = dateOfJoining;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDate getDateOfJoining() { return dateOfJoining; }
    public void setDateOfJoining(LocalDate dateOfJoining) { this.dateOfJoining = dateOfJoining; }

    public LocalDate getDateOfExit() { return dateOfExit; }
    public void setDateOfExit(LocalDate dateOfExit) { this.dateOfExit = dateOfExit; }
}
