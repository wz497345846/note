package com.test.web.controller;

import com.test.pojo.Course;
import com.test.pojo.Coursetype;
import com.test.service.impl.CourseServiceImpl;
import com.test.service.impl.CoursetypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CourseController {
    @Autowired
    CourseServiceImpl courseService;
    @Autowired
    CoursetypeServiceImpl coursetypeService;
    @RequestMapping("/{sb}")
    public String sb(String sb){
        return sb;
    }
    @RequestMapping("/addc")
    @ResponseBody
    public String addCourse(Course course){
        System.out.println("addCourse");
       // System.out.println(coursetypeService.findAllType());
        Coursetype coursetype=new Coursetype();
        coursetype.setType("跑步");
        System.out.println(coursetypeService.addType(coursetype));
        return "123";
    }
}
