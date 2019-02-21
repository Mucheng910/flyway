package com.employee.crud.service;

import com.employee.crud.EmployeeRepository.EmployeeRepository;
import com.employee.crud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);

    }

    public void deleteEmployeeById(int employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    public void updateEmployeeById(int employeeId, Employee employee) {
        Employee employeeInfo = employeeRepository.findById(employeeId).get();
        employeeInfo.setName(employee.getName());
        employeeInfo.setAge(employee.getAge());
        employeeInfo.setGender(employee.getGender());
        employeeRepository.save(employeeInfo);
    }
}





