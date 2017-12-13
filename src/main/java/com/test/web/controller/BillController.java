/*
* Copyright (c) 2017 Javachenk.com. All Rights Reserved.
*/
package com.test.web.controller;

/**
 * @author: JonyChen  Date: 2017/12/11
 */

import com.test.commons.DataGridModel;
import com.test.pojo.Bill;
import com.test.service.BillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/bill")
public class BillController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private BillService billService;

    @RequestMapping("/findAllBill")
    @ResponseBody
    public DataGridModel findBillAll(@RequestParam(defaultValue="1") Integer page, @RequestParam(defaultValue="5") Integer rows)throws Exception{
        return this.billService.findBillAll(page,rows);
    }
    @RequestMapping("/findById")
    @ResponseBody
    public Map<String, Integer> findByIdBill(Integer billid){
        Map<String, Integer> map = new HashMap<String, Integer>();
        try{
            this.billService.findBillById(billid);
            map.put("state", 200);
            return map;
        }catch(Exception e){
            e.printStackTrace();
            map.put("state", 500);
            return map;
        }
    }
    /**
     * 添加账单
     */
    @RequestMapping("/addBill")
    @ResponseBody
    public Map<String, Integer> addBill(Bill bill){
        Map<String, Integer> map = new HashMap<String, Integer>();
        try{
            this.billService.addBillInfo(bill);
            map.put("state", 200);
            return map;
        }catch(Exception e){
            e.printStackTrace();
            map.put("state", 500);
            return map;
        }
    }

    /**
     * 编辑账单
     */
    @RequestMapping("/updateBill")
    @ResponseBody
    public Map<String, Integer> updateBill(Bill bill){
        Map<String, Integer> map = new HashMap<String, Integer>();
        try{
            this.billService.modifyBillInfo(bill);
            map.put("state", 200);
            return map;
        }catch(Exception e){
            e.printStackTrace();
            map.put("state", 500);
            return map;
        }
    }

    /**
     * 删除账单
     */
    @RequestMapping("/dropBill")
    @ResponseBody
    public Map<String, Integer> dropBill(Integer billid){
        Map<String, Integer> map = new HashMap<String, Integer>();
        try{
            this.billService.dropBillById(billid);
            map.put("state", 200);
            return map;
        }catch(Exception e){
            e.printStackTrace();
            map.put("state", 500);
            return map;
        }
    }
}
