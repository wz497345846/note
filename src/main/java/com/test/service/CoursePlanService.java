package com.test.service;

import com.test.dao.CourseplanMapper;
import com.test.pojo.Courseplan;

public interface CoursePlanService {
/**
 * 添加课程计划
 */
    int addCourseplan(Courseplan courseplan);
}
