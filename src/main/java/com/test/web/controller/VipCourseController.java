package com.test.web.controller;

import com.test.pojo.Course;
import com.test.pojo.Membermanage;
import com.test.service.impl.VipCourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class VipCourseController {
    @Autowired
    private VipCourseServiceImpl vipCourseServiceImpl;

    @RequestMapping("/getUserCourse")
    @ResponseBody
    public List<Course> getUserCourse(Membermanage membermanage, String page, String rows){
        return vipCourseServiceImpl.selectUserCourse(membermanage,page,rows);
    }

    /**
     * 新建选课信息
     */

    @RequestMapping("createUserCourse")
    @ResponseBody
    public Map createUserCourse(Course course, Membermanage membermanage){

        boolean flag=vipCourseServiceImpl.addUserCourse(course,membermanage);
        Map map=new HashMap();
        if (flag){
            map.put("success",true);
        }else {
            map.put("msg","服务器繁忙");
        }
        return map;
    }

    /**
     * 删除选课信息
     */
    @RequestMapping("delUserCourse")
    @ResponseBody
    public Map delUserCourse(Course course,Membermanage membermanage){

        boolean flag=vipCourseServiceImpl.delUserCourse(course,membermanage);
        Map map=new HashMap();
        if (flag){
            map.put("success",true);
        }else {
            map.put("msg","服务器繁忙");
        }
        return map;
    }
}
