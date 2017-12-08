package com.test.dao;

import com.test.pojo.Courseplan;

public interface CourseplanMapper {
    int deleteByPrimaryKey(Integer courseplanid);

    int insert(Courseplan record);

    int insertSelective(Courseplan record);

    Courseplan selectByPrimaryKey(Integer courseplanid);

    int updateByPrimaryKeySelective(Courseplan record);

    int updateByPrimaryKey(Courseplan record);
}