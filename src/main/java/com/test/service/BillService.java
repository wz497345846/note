/*
* Copyright (c) 2017 Javachenk.com. All Rights Reserved.
*/
package com.test.service;

import com.test.pojo.Bill;

import java.util.List;

/**
 * @author: JonyChen  Date: 2017/12/11
 */
public interface BillService {
    /**
     * 通过账单编号查找账单
     * @param  billid
     * @return
     */
    Bill findBillById(Integer billid);

    /**
     * 查看所有账单
     * @return 一个账单集合
     */
    List<Bill> findAllBill();

    /**
     * 通过账单编号删除
     * @param billid
     */
    public void dropBillById(Integer billid);

    /**
     * 增加账单信息
     * @param bill
     * @return
     */
    public void addBillInfo(Bill bill);

    /**
     * 修改账单信息
     * @param bill
     */
    public void modifyBillInfo(Bill bill);





}
