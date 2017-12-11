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




}
