package com.test.dao;

import com.test.pojo.Bill;

public interface BillMapper {
    int deleteByPrimaryKey(Integer billid);

    int insert(Bill record);

    int insertSelective(Bill record);

    Bill selectByPrimaryKey(Integer billid);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);
}