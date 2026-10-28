package org.abes.hrmsdatabase.service;

import org.abes.hrmsdatabase.model.Employee;
import org.abes.hrmsdatabase.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public String createEmployee(){
        Employee emp1 = new Employee(2001,"shubham","java","fsd");
        employeeRepository.save(emp1);
        return "Employee is added successfully";
    }

    public Employee getEmployeeById(long empid){
      return  employeeRepository.findById(empid).orElse(null);

    }
}
