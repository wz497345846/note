package com.test.web.controller;

import com.test.pojo.Employee;
import com.test.service.EmployeeService;
import com.test.service.impl.EmployeeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  Create by peng
 *  创建员工
 */
@Controller
public class CreateEmployee {

    @RequestMapping("createE")
    public String createEmployee(Employee employee){
        String str="error";
        System.out.println(employee);
        EmployeeService es=new EmployeeServiceImpl();
        boolean flag=es.addEmployee(employee);
        if (flag){
            str= "index";
        }
        return str;
    }
}
