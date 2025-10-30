package com.company.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")  // Home page
    public String home() {
        return "index"; // index.html in templates/
    }

    @GetMapping("/login")  // Login page
    public String login() {
        return "login"; // login.html in templates/
    }

    @GetMapping("/dashboard") // Dashboard page
    public String dashboard() {
        return "dashboard"; // dashboard.html
    }

    @GetMapping("/addEmployee")
    public String addEmployee() {
        return "addEmployee"; // addEmployee.html
    }

    @GetMapping("/activeEmployees")
    public String activeEmployees() {
        return "activeEmployees"; // activeEmployees.html
    }

    @GetMapping("/pastEmployees")
    public String pastEmployees() {
        return "pastEmployees"; // pastEmployees.html
    }
}
