package com.test.service;

import com.test.pojo.Course;

import java.util.List;
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
}
