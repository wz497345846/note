package com.test.service;

import com.test.pojo.Course;
import com.test.pojo.Membermanage;

import java.util.List;

public interface VipCourseService {
    List<Course> selectUserCourse(Membermanage membermanage, String page, String rows);

    boolean addUserCourse(Course course, Membermanage membermanage);

    boolean delUserCourse(Course course, Membermanage membermanage);
}
