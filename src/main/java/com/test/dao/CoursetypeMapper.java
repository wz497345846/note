package com.test.dao;

import com.test.pojo.Coursetype;
import com.test.pojo.CoursetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoursetypeMapper {
    int deleteByExample(CoursetypeExample example);

    int deleteByPrimaryKey(String type);

    int insert(Coursetype record);

    int insertSelective(Coursetype record);

    List<Coursetype> selectByExample(CoursetypeExample example);

    int updateByExampleSelective(@Param("record") Coursetype record, @Param("example") CoursetypeExample example);

    int updateByExample(@Param("record") Coursetype record, @Param("example") CoursetypeExample example);
}