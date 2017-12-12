package com.test.web.controller;

import com.test.pojo.Course;
import com.test.pojo.Courseplan;
import com.test.pojo.Coursetype;
import com.test.pojo.Employee;
import com.test.service.employee.EmployeeService;
import com.test.service.impl.CourseServiceImpl;
import com.test.service.impl.CoursetypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CourseController {
    @Autowired
    CourseServiceImpl courseService;
    @Autowired
    EmployeeService employeeService;
    @Autowired
    CoursetypeServiceImpl coursetypeService;
    @RequestMapping("/{sb}")
    public String sb(String sb){
        return sb;
    }
    @RequestMapping("/addc")
    @ResponseBody
    public String addCourse(Course course){
       try{
           courseService.addCourse(course);
           return "1";
       }catch (Exception e){
           return "0";
       }

    }
    @RequestMapping("/addcourseplan")
    @ResponseBody
    public String addCoursePlan(Courseplan coursePlan){
        try{
            System.out.printf(coursePlan.toString());
            return "1";
        }catch (Exception e){

            return "0";
        }
    }

    @RequestMapping("/ctype")
    @ResponseBody
    public List<Map<String,String>> allType(){
        List<Map<String,String>> listmap=new ArrayList<Map<String, String>>();
        List<Coursetype> list=coursetypeService.findAllType();
        for (int i = 0; i < list.size(); i++) {
            Map<String,String> map=new HashMap<String, String>();
            map.put("id",list.get(i).getType());
            map.put("text",list.get(i).getType());
            listmap.add(map);
        }
        return listmap;
    }

    /**
     * 返回所有教练信息
     * @return
     */
    @RequestMapping("/courseemp")
    @ResponseBody
    public List<Map<String,String>> allEmp(){
        List<Map<String,String>> listmap=new ArrayList<Map<String, String>>();
        List<Employee> list=employeeService.selectAllCoach();
        for (int i = 0; i < list.size(); i++) {
            Map<String,String> map=new HashMap<String, String>();
            map.put("id",list.get(i).getEmpid()+"");
            map.put("text",list.get(i).getEmpname());
            listmap.add(map);
        }
        return listmap;
    }
}
