package com.test.service.impl;

import com.test.dao.CourseMapper;
import com.test.pojo.Course;
import com.test.pojo.CourseExample;
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
    public int addCourse(Course course) {
        return cm.insertSelective(course);
    }

    public Map<String,Object> findCourse(Course course, int offset, int row) {
        Map<String,Object> map=new HashMap<String,Object>();
        RowBounds rowBounds=new RowBounds(offset,row);
        CourseExample example=new CourseExample();
        CourseExample.Criteria criteria= example.createCriteria();
        map.put("total",cm.selectByExample(example).size());
        map.put("rows",cm.selectByExampleWithRowbounds(example,rowBounds));

        return map;
    }

}
