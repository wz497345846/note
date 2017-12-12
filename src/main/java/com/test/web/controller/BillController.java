/*
* Copyright (c) 2017 Javachenk.com. All Rights Reserved.
*/
package com.test.web.controller;

/**
 * @author: JonyChen  Date: 2017/12/11
 */
import com.test.pojo.Bill;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.test.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/bill")
public class BillController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private BillService billService;

    @RequestMapping("/findAllBill")
    @ResponseBody
    public String findAllBill(Model model){
        List<Bill> list = this.billService.findAllBill();
        model.addAttribute("list",list);
        for (Bill bill:list) {
            System.out.println(bill);
        }
        return "bill_index";
    }

    @RequestMapping("/dropUser")
    @ResponseBody
    public String dropUser(Integer billid){
        try{
            this.billService.dropBillById(billid);
            return "ok";
        }catch(Exception e){
            logger.debug(e.getMessage());
            e.printStackTrace();
            return "error";
        }
    }
}
