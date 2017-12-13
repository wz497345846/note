package com.test.service.impl;

import com.test.dao.CourseMapper;
import com.test.dao.CourseplanMapper;
import com.test.pojo.Course;
import com.test.pojo.CourseExample;
import com.test.pojo.Courseplan;
import com.test.service.CourseService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseMapper cm;
    @Autowired
    CourseplanMapper csm;

    /**
     * 添加课程
     * @param course
     * @return
     */
    public int addCourse(Course course) {
        return cm.insertSelective(course);
    }

    /**
     * 查找课程
     * @param course
     * @param offset
     * @param row
     * @return
     */
    public Map<String,Object> findCourse(Course course, int offset, int row) {
        Map<String,Object> map=new HashMap<String,Object>();
        RowBounds rowBounds=new RowBounds(offset,row);
        CourseExample example=new CourseExample();
        CourseExample.Criteria criteria= example.createCriteria();
        map.put("total",cm.selectByExample(example).size());
        map.put("rows",cm.selectByExampleWithRowbounds(example,rowBounds));

        return map;
    }

    /**
     * 删除课程
     * @param id
     * @return
     */
    public void dropCourse(int id){

        cm.deleteByPrimaryKey(id);
        csm.deleteByPrimaryKey(id);
    }
    /**
     * 查找课程
     */
    public Course findCourseById(int id){
        return cm.selectByPrimaryKey(id);
    }

    /**
     * 修改课程
     * @param course
     * @return
     */
    public int modifyCourse(Course course){
       return cm.updateByPrimaryKeySelective(course);
    }
    /**
     * 修改课程计划
     */
    public int modifyCourseplan(Courseplan courseplan){
        return csm.updateByPrimaryKeySelective(courseplan);
    }
}
