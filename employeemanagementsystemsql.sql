CREATE DATABASE employee_db;
USE employee_db;

CREATE TABLE employee (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100),
  email VARCHAR(100),
  department VARCHAR(50),
  role VARCHAR(50),
  salary DOUBLE,
  status VARCHAR(20) DEFAULT 'Active',
  date_of_joining DATE,
  date_of_exit DATE
);

