package com.test.dao;

import com.test.pojo.Costinfo;
import com.test.pojo.CostinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CostinfoMapper {
    int countByExample(CostinfoExample example);

    int deleteByExample(CostinfoExample example);

    int deleteByPrimaryKey(Integer costinfoid);

    int insert(Costinfo record);

    int insertSelective(Costinfo record);

    List<Costinfo> selectByExample(CostinfoExample example);

    Costinfo selectByPrimaryKey(Integer costinfoid);

    int updateByExampleSelective(@Param("record") Costinfo record, @Param("example") CostinfoExample example);

    int updateByExample(@Param("record") Costinfo record, @Param("example") CostinfoExample example);

    int updateByPrimaryKeySelective(Costinfo record);

    int updateByPrimaryKey(Costinfo record);
}