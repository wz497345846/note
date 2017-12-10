package com.test.service.impl;

import com.test.dao.EmployeeMapper;
import com.test.pojo.Employee;
import com.test.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;
    public boolean addEmployee(Employee employee) {
        boolean flag=false;
        int x=employeeMapper.insertSelective(employee);
        if (x>0){
            flag=true;
        }
        return flag;
    }
}
