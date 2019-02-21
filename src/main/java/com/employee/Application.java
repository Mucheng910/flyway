package com.employee.crud;//package com.employee.crud.data;

//import com.employee.crud.EmployeeRepository.EmployeeRepository;
//import com.employee.crud.entity.Employee;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//
//import java.util.ArrayList;
//import java.util.List;
//
////public class EmployeeData {
////    public static List<Employee> employeeData() {
////        List<Employee> employeeList = new ArrayList<>();
////        Employee employeeOne = new Employee(0, "小明", 20, "男");
////        Employee employeeTwo = new Employee(1, "小红", 19, "女");
////        Employee employeeThree = new Employee(2, "小智", 15, "男");
////        Employee employeeFour = new Employee(3, "小钢", 16, "女");
////        Employee employeeFive = new Employee(4, "小夏", 15, "女");
////        employeeList.add(employeeOne);
////        employeeList.add(employeeTwo);
////        employeeList.add(employeeThree);
////        employeeList.add(employeeFour);
////        employeeList.add(employeeFive);
////        return employeeList;
////    }
////
////
////}
//
//
//import com.employee.crud.EmployeeRepository.EmployeeRepository;
//import com.employee.crud.entity.Employee;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;

import com.employee.crud.EmployeeRepository.EmployeeRepository;
import com.employee.crud.entity.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }




}
