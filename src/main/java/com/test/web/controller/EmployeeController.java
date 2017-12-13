package com.test.web.controller;

import com.test.pojo.Employee;
import com.test.service.impl.employeeImpl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
        String filename=avatar.getOriginalFilename();
        //修改文件名
        String newFileName= employee.getEmpname()+UUID.randomUUID().toString()+filename.substring(filename.lastIndexOf("."));
        employee.setEmpavatar(newFileName);
        boolean flag=employeeServiceImpl.addEmployee(employee);
        Map map=new HashMap();
        if (flag){
            ServletContext sc=request.getSession().getServletContext();
            //根据servletcontext获取上下文绝对路径
            String realPath=sc.getRealPath("/WEB-INF/Upload/");
            avatar.transferTo(new File(realPath+newFileName));
        }
        return "index";
    }

    /**
     * 删除员工信息
     */
    @RequestMapping("deleteE")
    @ResponseBody
    public Map deleteEmployee(Employee employee){
        boolean flag=employeeServiceImpl.deleteE(employee);
        Map map=new HashMap();
        if (flag){
            map.put("success",true);
        }else {
            map.put("msg","服务器繁忙");
        }
        return map;
    }

    /**
     * 修改员工信息
     */
    @RequestMapping("/changeEmployee")
    @ResponseBody
    public Map changeEmployeebp(Employee employee){
        boolean flag=employeeServiceImpl.changeEmployee(employee);
        Map map=new HashMap();
        if (flag){
            map.put("success",true);
        }else {
            map.put("msg","服务器繁忙");
        }
        return map;
    }


    /**
     * 查询指定员工信息
     */
    @RequestMapping("/selectEmployee")
    @ResponseBody
    public List<Employee> selectEmployee(Employee employee,String pageNumber,String pageSize){
        List<Employee> list=employeeServiceImpl.selectEmployee(employee,pageNumber,pageSize);
        return list;
    }

    /**
     * 员工登录
     */
    @RequestMapping("/employeeLogin")
    @ResponseBody
    public List<Employee> employeeLogin(Employee employee){
        List<Employee> list = employeeServiceImpl.employeeLogin(employee);
        return list;
    }


    /**
     *  查询所有员工信息
     */

    @RequestMapping("/getallEmployee")
    @ResponseBody
    public List<Employee> getallEmployee(){
        return employeeServiceImpl.getAllEmployee();
    }
}
