package com.test.dao;

import com.test.pojo.Bill;
import com.test.pojo.BillExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillMapper {
    //按条件计数。
    int countByExample(BillExample example);

    //按主键删除
    int deleteByExample(BillExample example);

    // 通过账单号删除
    int deleteByPrimaryKey(Integer billid);

    // 插入一条
    int insert(Bill record);

    // 批量插入
    int insertSelective(Bill record);

    //查找所有订单信息
    List<Bill> selectByExample(BillExample example);

    //通过账单号查找账单信息
    Bill selectByPrimaryKey(Integer billid);

    int updateByExampleSelective(@Param("record") Bill record, @Param("example") BillExample example);

    int updateByExample(@Param("record") Bill record, @Param("example") BillExample example);

    //批量更新
    int updateByPrimaryKeySelective(Bill record);

    //更新一条
    int updateByPrimaryKey(Bill record);
}