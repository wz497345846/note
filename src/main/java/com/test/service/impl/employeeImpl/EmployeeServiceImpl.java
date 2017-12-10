package com.test.service.impl.employeeImpl;

import com.test.dao.EmployeeMapper;
import com.test.pojo.Employee;
import com.test.service.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    /**
     * 添加用户信息操作
     * @param employee
     * @return
     */
    public boolean addEmployee(Employee employee) {
        boolean flag=true;
        System.out.println(employeeMapper);
        Employee x=employeeMapper.selectByPrimaryKey(8888);
        System.out.println(x);
        return flag;
    }
}
