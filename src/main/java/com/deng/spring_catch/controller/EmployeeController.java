package com.deng.spring_catch.controller;

import com.deng.spring_catch.bean.Employee;
import com.deng.spring_catch.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/emp/{id}")
    public Employee getEmpByid(@PathVariable("id") Integer id){
        Employee employByid = employeeService.getEmployByid(id);
        System.out.print(employByid);
        return employByid;
    }

    @GetMapping("/emp")
    public void update(Employee employee){
        employeeService.update(employee);
    }

}
