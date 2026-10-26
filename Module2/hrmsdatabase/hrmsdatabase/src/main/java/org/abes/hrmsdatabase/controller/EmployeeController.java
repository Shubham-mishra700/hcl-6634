package org.abes.hrmsdatabase.controller;

import org.abes.hrmsdatabase.model.Employee;
import org.abes.hrmsdatabase.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:5173/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String msg(){
        return "welcome to SpringBoot App development";
    }

    @GetMapping("/addemp")
    public String addnewEmployee(){
        return employeeService.createEmployee();
    }

    @GetMapping("findbyid/(empid")
        public Employee getEmpById(@PathVariable long empid){
            return employeeService.getEmployeeById(empid);

    }
}
