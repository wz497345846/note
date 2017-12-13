package com.test.service;

import com.test.pojo.Course;
import com.test.pojo.Courseplan;

import java.util.Map;

public interface CourseService {
    /**
     * 添加健身房课程
     * @param course
     * @return
     */
    int addCourse(Course course);
    Map<String,Object> findCourse(Course course, int offset, int row);
    void dropCourse(int id);
    Course findCourseById(int id);
    int modifyCourseplan(Courseplan courseplan);
    int modifyCourse(Course course);
}
