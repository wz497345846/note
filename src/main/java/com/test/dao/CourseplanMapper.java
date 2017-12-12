package com.test.dao;

import com.test.pojo.Courseplan;
import com.test.pojo.CourseplanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CourseplanMapper {
    int deleteByExample(CourseplanExample example);

    int deleteByPrimaryKey(Integer courseid);

    int insert(Courseplan record);

    int insertSelective(Courseplan record);

    List<Courseplan> selectByExampleWithRowbounds(CourseplanExample example, RowBounds rowBounds);

    List<Courseplan> selectByExample(CourseplanExample example);

    Courseplan selectByPrimaryKey(Integer courseid);

    int updateByExampleSelective(@Param("record") Courseplan record, @Param("example") CourseplanExample example);

    int updateByExample(@Param("record") Courseplan record, @Param("example") CourseplanExample example);

    int updateByPrimaryKeySelective(Courseplan record);

    int updateByPrimaryKey(Courseplan record);
}