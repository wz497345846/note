package com.test.web.controller;

import com.test.pojo.Course;
import com.test.pojo.Courseplan;
import com.test.pojo.Coursetype;
import com.test.pojo.Employee;
import com.test.service.CoursePlanService;
import com.test.service.CourseService;
import com.test.service.CoursetypeService;
import com.test.service.employee.EmployeeService;
import com.test.service.impl.CourseServiceImpl;
import com.test.service.impl.CoursetypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class CourseController {
    @Autowired
    CourseService courseService;
    @Autowired
    EmployeeService employeeService;
    @Autowired
    CoursetypeService coursetypeService;
    @Autowired
    CoursePlanService coursePlanService;
    @RequestMapping("/{sb}")
    public String sb(String sb){
        return sb;
    }

    @RequestMapping("/allcourse")
    @ResponseBody
    public Map<String,Object> allcourse(@RequestParam(defaultValue = "1") String page,@RequestParam(defaultValue = "10") String rows){

        System.out.println("allcourse-page:"+page+"-rows:"+rows);
        return courseService.findCourse(null,Integer.parseInt(page),Integer.parseInt(rows));
    }

    /**
     * 添加课程
     * @param course
     * @return
     */
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

    /**
     * 添加课程计划
     * @param coursePlan
     * @return
     */
    @RequestMapping("/addcourseplan")
    @ResponseBody
    public String addCoursePlan(Courseplan coursePlan){
        System.out.printf(coursePlan.toString());
        try{
            coursePlanService.addCourseplan(coursePlan);
            return "1";
        }catch (Exception e){
            return "0";
        }
    }

    /**
     * 返回所有课程类型
     * @return
     */
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
    @RequestMapping("/delcourse")
    @ResponseBody
    public String dorpCourse(String id){
        try{
            courseService.dropCourse(Integer.parseInt(id));
            return "1";
        }catch (Exception e){
            return "0";
        }
    }
}
