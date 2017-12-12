package com.test.web.controller;

import com.test.pojo.Employee;
import com.test.service.impl.employeeImpl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

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
    public String createEmployee(Employee employee, MultipartFile avatar, HttpServletRequest request) throws IOException {
        String str="error";
        String filename=avatar.getOriginalFilename();
        //修改文件名
        String newFileName= employee.getEmpname()+UUID.randomUUID().toString()+filename.substring(filename.lastIndexOf("."));
        employee.setEmpavatar(newFileName);
        boolean flag=employeeServiceImpl.addEmployee(employee);
        if (flag){
            ServletContext sc=request.getSession().getServletContext();
            //根据servletcontext获取上下文绝对路径
            String realPath=sc.getRealPath("/WEB-INF/Upload/");
            avatar.transferTo(new File(realPath+newFileName));
            str="stuff-query";
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
    @RequestMapping("/selectEmployee")
    public List<Employee> selectEmployee(Employee employee,String pageNumber,String pageSize){
        List<Employee> list=employeeServiceImpl.selectEmployee(employee,pageNumber,pageSize);
        System.out.println(list);
        return list;
    }
}
