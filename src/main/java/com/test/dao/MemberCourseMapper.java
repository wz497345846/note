package com.test.dao;

import com.test.pojo.MemberCourseExample;
import com.test.pojo.MemberCourseKey;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

//import com.test.pojo.MemberCourseKey;

public interface MemberCourseMapper {
    int deleteByExample(MemberCourseExample example);

    int deleteByPrimaryKey(MemberCourseKey key);

    int insert(MemberCourseKey record);

    int insertSelective(MemberCourseKey record);

    List<MemberCourseKey> selectByExampleWithRowbounds(MemberCourseExample example, RowBounds rowBounds);

    List<MemberCourseKey> selectByExample(MemberCourseExample example);

    int updateByExampleSelective(@Param("record") MemberCourseKey record, @Param("example") MemberCourseExample example);

    int updateByExample(@Param("record") MemberCourseKey record, @Param("example") MemberCourseExample example);
}