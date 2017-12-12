package com.test.service.impl.employeeImpl;

import com.test.dao.EmployeeMapper;
import com.test.pojo.Employee;
import com.test.pojo.EmployeeExample;
import com.test.service.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        boolean flag=false;
        int x=employeeMapper.insertSelective(employee);
        if (x>0){
            flag=true;
        }
        return flag;
    }

    /**
     * 删除员工操作
     */
    public boolean dropEmployee(Employee employee) {
        boolean flag=false;
        int x=employeeMapper.deleteByPrimaryKey(employee.getEmpid());
        if (x>0){
            flag=true;
        }
        return flag;
    }

    /**
     *  修改员工信息
     */
    public boolean updateEmployee(Employee employee) {
        boolean flag=false;
        int x=employeeMapper.updateByPrimaryKeySelective(employee);
        return false;
    }

    /**
     * 返回所有教练
     */
    public List<Employee> selectAllCoach() {
        EmployeeExample employeeExample=new EmployeeExample();
        EmployeeExample.Criteria criteria=employeeExample.createCriteria();
        criteria.getAllCriteria();
        return employeeMapper.selectByExample(employeeExample);
    }

    /**
     *  查询员工信息
     */
    public List<Employee> selectEmployee(Employee employee, String pageNumber, String pageSize) {
        EmployeeExample employeeExample=new EmployeeExample();
        EmployeeExample.Criteria criteria=employeeExample.createCriteria();
        if (employee.getEmpname()!=null){
            criteria.andEmpnameEqualTo(employee.getEmpname());
        }
        if (employee.getEmpstate()!=null){
            criteria.andEmpstateEqualTo(employee.getEmpstate());
        }
        if (employee.getRoleid()!=null){
            criteria.andRoleidEqualTo(employee.getRoleid());
        }
        List<Employee> list=employeeMapper.selectByExample(employeeExample);
        return list;
    }

}
