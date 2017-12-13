package com.test.dao;

import com.test.pojo.MemberCourse;
import com.test.pojo.MemberCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MemberCourseMapper {
    int deleteByExample(MemberCourseExample example);

    int deleteByPrimaryKey(Integer courseid);

    int insert(MemberCourse record);

    int insertSelective(MemberCourse record);

    List<MemberCourse> selectByExampleWithRowbounds(MemberCourseExample example, RowBounds rowBounds);

    List<MemberCourse> selectByExample(MemberCourseExample example);

    MemberCourse selectByPrimaryKey(Integer courseid);

    int updateByExampleSelective(@Param("record") MemberCourse record, @Param("example") MemberCourseExample example);

    int updateByExample(@Param("record") MemberCourse record, @Param("example") MemberCourseExample example);

    int updateByPrimaryKeySelective(MemberCourse record);

    int updateByPrimaryKey(MemberCourse record);
}