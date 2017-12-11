package com.test.web.controller;

import com.test.pojo.Employee;
import com.test.service.impl.employeeImpl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 *  Create by peng
 *  员工操作
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;


    /**
     * 创建一个员工信息
     * @return 页面信息
     */
    @RequestMapping("createE")
    public String createEmployee(Employee employee){
        String str="error";
        boolean flag=employeeServiceImpl.addEmployee(employee);
        if (flag){
            str= "index";
        }
        return str;
    }

    /**
     * 删除员工信息
     */
    @RequestMapping("deleteE")
    public String deleteEmployee(Employee employee){
        String str="error";
        boolean flag=employeeServiceImpl.dropEmployee(employee);
        if (flag){
            str="index";
        }
        return str;
    }

    /**
     * 修改员工信息
     */
    @RequestMapping("changeEmployee")
    public String changeEmployeebp(Employee employee){
        boolean flag=employeeServiceImpl.updateEmployee(employee);
        return null;
    }


    /**
     * 查询指定员工信息
     */
    @RequestMapping("selectEmployee")
    public String selectEmployee(Employee employee){
        List<Employee> list=employeeServiceImpl.selectEmployee(employee);
        return null;
    }
}
