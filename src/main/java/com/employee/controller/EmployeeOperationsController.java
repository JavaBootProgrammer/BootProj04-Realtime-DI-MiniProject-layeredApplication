package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.employee.model.Employee;
import com.employee.service.IEmployeeManagementService;

@Controller("empController")
public class EmployeeOperationsController {
    @Autowired
    private IEmployeeManagementService employeeService;

    public List<Employee> showEmployeesByDesgs(String designation1, String designation2, String designation3)
            throws Exception {
        // use service
        List<Employee> list = employeeService.fetchEmployeesByDesgs(designation1, designation2, designation3);
        return list;
    }

}
