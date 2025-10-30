# Employee Management System

A simple web application to manage employees in a company. Built with **Spring Boot**, **Thymeleaf**, **JPA/Hibernate**, and **MySQL**, featuring CRUD operations and employee status tracking.

---

## Features
- Admin login authentication
- Add new employees with name, email, department, role, salary, and joining date
- View **active employees**
- Update employee details (role, salary, department)
- Remove employees (mark as resigned)
- View **past employees** (resigned)
- Delete past employees permanently
- Professional front-end with HTML, CSS, and JS

---

## Tech Stack
- **Backend:** Java, Spring Boot, Spring Data JPA  
- **Frontend:** HTML, CSS, JavaScript, Thymeleaf  
- **Database:** MySQL  
- **Build Tool:** Maven  

---

## Setup & Installation
1. **Clone the repository**  
```bash
git clone <your-github-repo-link>
cd <project-folder>

CREATE DATABASE ems;

spring.datasource.url=jdbc:mysql://localhost:3306/ems
spring.datasource.username=root
spring.datasource.password=<your-password>
spring.jpa.hibernate.ddl-auto=update

mvn spring-boot:run

src/main/java
 └─ com.company.ems
     ├─ controller
     ├─ entity
     ├─ repository
     └─ service
src/main/resources
 ├─ templates
 └─ static
     └─ css
