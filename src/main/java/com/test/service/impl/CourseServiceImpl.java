package com.test.service.impl;

import com.test.dao.CourseMapper;
import com.test.pojo.Course;
import com.test.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseMapper cm;
    public int addCourse(Course course) {
        return cm.insertSelective(course);
    }

}
