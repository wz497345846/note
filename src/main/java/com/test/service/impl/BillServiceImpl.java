/*
* Copyright (c) 2017 Javachenk.com. All Rights Reserved.
*/
package com.test.service.impl;

import com.test.dao.BillMapper;
import com.test.pojo.Bill;
import com.test.pojo.BillExample;
import com.test.service.BillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: JonyChen  Date: 2017/12/11
 */
@Service
public class BillServiceImpl implements BillService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    //注入Service依赖
    @Autowired
    private BillMapper billMapper;

    /**
     * 查询一条账单信息
     */
    public Bill findBillById(Integer billid) {
        return billMapper.selectByPrimaryKey(billid);
    }

    /**
     * 查询所有账单
     */
    public List<Bill> findAllBill() {
        BillExample example = new BillExample();
        return this.billMapper.selectByExample(example);
    }

    /**
     * 通过账单编号删除账单
     *
     * @param billid
     */
    public void dropBillById(Integer billid) {
        this.billMapper.deleteByPrimaryKey(billid);
    }

    /**
     * 增加账单信息
     *
     * @param bill
     */
    public void addBillInfo(Bill bill) {
        this.billMapper.insert(bill);
    }

    /**
     * 修改账单信息
     * @param bill
     */
    public void modifyBillInfo(Bill bill) {
        this.billMapper.updateByPrimaryKey(bill);
    }
}
