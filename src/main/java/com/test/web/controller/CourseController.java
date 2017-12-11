package com.test.web.controller;

import com.test.service.impl.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CourseController {
    @Autowired
    CourseServiceImpl cs;
    @RequestMapping("/{sb}")
    public String sb(String sb){
        return sb;
    }
    @RequestMapping("/addc")
    @ResponseBody
    public String addCourse(){
        System.out.println("addCourse");
        System.out.println(cs);
        return "";
    }
}
