package com.test.service.impl;

import com.test.dao.CourseMapper;
import com.test.dao.MemberCourseMapper;
import com.test.pojo.*;
import com.test.service.VipCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VipCourseServiceImpl implements VipCourseService {
    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private MemberCourseMapper memberCourseMapper;

    /**
     *  获取会员选课信息
     */
    public List<Course> selectUserCourse(Membermanage membermanage, String page, String rows) {
        MemberCourseExample example=new MemberCourseExample();
        MemberCourseExample.Criteria criteria=example.createCriteria();
        if (membermanage.getMemberid()!=null&&membermanage.getMemberid()>0){
            criteria.andMemberidEqualTo(membermanage.getMemberid());
        }
        List<MemberCourseKey> memberCourseKeys=memberCourseMapper.selectByExample(example);
        List<Course> courses=new ArrayList<Course>();
        for (int i = 0; i <memberCourseKeys.size(); i++) {
            courses.add(courseMapper.selectByPrimaryKey(memberCourseKeys.get(i).getCourseid()));
        }
        return courses;
    }

    /**
     *  新建会员选课信息
     */
    public boolean addUserCourse(Course course, Membermanage membermanage) {
        MemberCourseKey memberCourse=new MemberCourseKey();
        memberCourse.setMemberid(membermanage.getMemberid());
        memberCourse.setCourseid(course.getCourseid());
        int x=memberCourseMapper.insert(memberCourse);
        if (x>0){
            return true;
        }
        return false;
    }

    /**
     *  删除选课信息
     */
    public boolean delUserCourse(Course course, Membermanage membermanage) {
        MemberCourseKey memberCourseKey=new MemberCourseKey();
        memberCourseKey.setMemberid(membermanage.getMemberid());
        memberCourseKey.setCourseid(course.getCourseid());
        int x=memberCourseMapper.deleteByPrimaryKey(memberCourseKey);
        if (x>0){
            return true;
        }
        return false;
    }
}
