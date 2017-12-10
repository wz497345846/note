package com.test.web.controller;

import com.test.pojo.Employee;
import com.test.service.employee.EmployeeService;
import com.test.service.impl.employeeImpl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  Create by peng
 *  创建员工
 */
@Controller
public class CreateEmployee {
    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;


    @RequestMapping("createE")
    public String createEmployee(Employee employee){
        String str="error";
        boolean flag=employeeServiceImpl.addEmployee(employee);
        if (flag){
            str= "index";
        }
        return str;
    }
}
