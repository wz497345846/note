package com.test.service.impl;

import com.test.dao.CourseplanMapper;
import com.test.pojo.Courseplan;
import com.test.service.CoursePlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursePlanServiceImpl implements CoursePlanService {
    @Autowired
    CourseplanMapper courseplanMapper;
    public int addCourseplan(Courseplan courseplan) {
        return courseplanMapper.insertSelective(courseplan);
    }
    public Courseplan findCourseplan(int id){
        return  courseplanMapper.selectByPrimaryKey(id);
    }
}
