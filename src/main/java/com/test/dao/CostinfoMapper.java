package com.test.dao;

import com.test.pojo.Costinfo;

public interface CostinfoMapper {
    int deleteByPrimaryKey(Integer costinfoid);

    int insert(Costinfo record);

    int insertSelective(Costinfo record);

    Costinfo selectByPrimaryKey(Integer costinfoid);

    int updateByPrimaryKeySelective(Costinfo record);

    int updateByPrimaryKey(Costinfo record);
}